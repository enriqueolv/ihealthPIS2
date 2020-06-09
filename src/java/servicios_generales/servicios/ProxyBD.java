
package servicios_generales.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicios_generales.model.agendas.Cita;
import servicios_generales.model.cuentas.CuentaMedico;
import servicios_generales.model.cuentas.CuentaPaciente;
import servicios_generales.model.eventos.Evento;
import servicios_generales.model.instalaciones.CentroDeAltaEspecialidad;
import servicios_generales.model.instalaciones.Hospital;
import servicios_generales.model.instalaciones.Laboratorio;
import servicios_paciente_medicos.model.recetas.Medicamento;
import servicios_paciente_medicos.model.recetas.Receta;
import servicios_paciente_medicos.model.recetas.Recetario;


public class ProxyBD {
    private static Connection conexion;
    private static String usuario = "root";
    private static String contraseniaBD = "";
    private static String url = "jdbc:mysql://localhost/ihealth"; 
   
    private void conectar(){
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion =  DriverManager.getConnection(url, usuario, contraseniaBD);
        }catch(ClassNotFoundException e){
            System.out.println("No se encontro la Driver clase de java");
            e.printStackTrace();
        }catch(SQLException e){
            System.out.println("Error sql a nivel de la conexion");
            e.printStackTrace();
        }
   }
   
    private void desconectar(){
       try {
           conexion.close();
       } catch (SQLException ex) {
           Logger.getLogger(ProxyBD.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Error al desconectar");
       }
       
   }
   
   
    public CuentaPaciente getCuentaPaciente(String correo, String contra){
       conectar();
       
       ResultSet result = null;
       PreparedStatement statement = null;
       CuentaPaciente cuenta = new CuentaPaciente();
       
        try{
            String statementText = "SELECT* FROM `ihealth`.`cuentas` where correo = '"+ correo + "';" ;
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   ///Regresa la primera cuenta que se encuentre
            if(result.next()){
                String contrasenia = result.getString(2);
                cuenta.setCorreo(correo);
                cuenta.setContrasenia(contrasenia);
                
                if(contrasenia.equals(contra)){
                }else{
                    cuenta = null;
                }

            }else{
                cuenta = null;
            }

           
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en getCuentaPaciente");
            e.printStackTrace();
        }
        
        if(cuenta != null){
        //buscamos los demas datos del paciente en la tabla cuentasPacientes
            try{
                String statementText = "SELECT* FROM `ihealth`.`cuentaspacientes` where correo = '"+ correo + "';" ;
                statement = conexion.prepareStatement(statementText);
                result = statement.executeQuery();
                if(result.next()){
                    //Si si se encuentran los demas datos registrados
                    //se agregan a la informacion de la cuenta
                    String matricula = result.getString(2);
                    String nombre = result.getString(3);
                    String apellido = result.getString(4);
                    String codigoPostal = result.getString(5);
                    String fechaNacimiento = result.getString(6);
                    
                    cuenta.setMatricula(matricula);
                    cuenta.setNombre(nombre);
                    cuenta.setApellido(apellido);
                    cuenta.setCodigoPostal(codigoPostal);
                    cuenta.setFechaNacimiento(fechaNacimiento);
                    
                }else{
                    //La cuenta por la que preguntas no es una cuenta de pacientes
                    //porque no esta en la tabla de las cuentas de pacientes
                    
                    cuenta = null;
                }
                
            }catch(SQLException e){
            }
        
        
        }
       
       desconectar();
       return cuenta;

   }

    
    public ArrayList<CuentaMedico> getInfoMedicos(){
        ArrayList<CuentaMedico> medicos = new ArrayList<>();
        conectar();
        
        ResultSet result = null;
        PreparedStatement statement = null;
           
        
        try{
            String statementText = "SELECT * FROM `ihealth`.`cuentasmedicos`;" ;
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            while(result.next()){
                String correo = result.getString(1);
                String numeroDeEmpleado = result.getString(2);
                String nombre = result.getString(3);
                String apellido = result.getString(4);
                String telefono = result.getString(5);
                float salario =(float) result.getFloat(6);
                String especialidad = result.getString(7);
                String departamento = result.getString(8);
                String almaMater = result.getString(9);
                String idCentroDeTrabajo = result.getString(10);
                String dirFoto = result.getString(11);
                
                //Note que para mostrar la informacion del medico no se requiere recuperar la contraseña de su cuenta
                medicos.add(new CuentaMedico(correo, "", numeroDeEmpleado, nombre, apellido, telefono, salario,
                especialidad, departamento, almaMater, idCentroDeTrabajo, dirFoto));
            }

            return medicos;
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en getInfoMedicos");
            e.printStackTrace();
        }
        
        
        desconectar();
        return medicos;
    }
    
    
    public ArrayList<Hospital> getInfoHospitales(){
        
        //Regresa la informacion de todos los hospitales omitiendo los
        //laboratorios y centros de alta especialidad
        ArrayList<Hospital> listaHospitales = new ArrayList<>();
        conectar();
        
        ResultSet result = null;
        PreparedStatement statement = null;
        
        
        try{
            String statementText = "SELECT * FROM `ihealth`.`hospitales`;" ;
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            while(result.next()){
                String idCentroDeTrabajo = result.getString(1);
                String ubicacion = result.getString(2);
                String nombre = result.getString(3);
                String descripcion = result.getString(4);
                
                listaHospitales.add(new Hospital(idCentroDeTrabajo, ubicacion, nombre, descripcion, null, null));
            }

            return listaHospitales;
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en getInfoHospitales");
            e.printStackTrace();
        }
        
        
        
        desconectar();
        return listaHospitales;
    }
    
    public Hospital getHospital(String idCentroDeTrabajo){
        conectar();
        
        ResultSet result = null;
        PreparedStatement statement = null;
        String ubicacionHospital = null;
        String nombreHospital = null;
        String descripcionHospital = null;
        
        try{
            String statementText = "SELECT * FROM `ihealth`.`hospitales` WHERE idCentroDeTrabajo='"+ idCentroDeTrabajo +"';";
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            if(result.next()){
               
                ubicacionHospital = result.getString(2);
                nombreHospital = result.getString(3);
                descripcionHospital = result.getString(4);
                
              
                //return new Hospital(idCentroDeTrabajo, ubicacion, nombre, null, null);
            }else{
                //return new Hospital();
            }          
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en getInfoHospitales");
            e.printStackTrace();
        }
        
        
        ArrayList<Laboratorio> laboratorios = new ArrayList<>();
        //Sacamos los laboratorios de ese hospital de la base de datos
        try{
            String statementText = "SELECT * FROM `ihealth`.`laboratorios` WHERE idCentroDeTrabajo='"+ idCentroDeTrabajo +"';";
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            while(result.next()){
                String idLaboratorio = result.getString(1);
                String nombre = result.getString(3);

                laboratorios.add(new Laboratorio(idLaboratorio, idCentroDeTrabajo, nombre));
            }          
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en laboratorios para recuperar los datos del hospital");
            e.printStackTrace();
        }
        
        
        
        ArrayList<CentroDeAltaEspecialidad> centros = new ArrayList<>();
        //Sacamos los centros de alta especialidad que se encuentran en el hospital especificado
        
        try{
            String statementText = "SELECT * FROM `ihealth`.`centrosDeAltaEspecialidad` WHERE idCentroDeTrabajo='"+ idCentroDeTrabajo +"';";
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
            
            while(result.next()){
                String idCentroDeAltaEspecialidad = result.getString(1);
                String nombre = result.getString(3);
                centros.add(new CentroDeAltaEspecialidad(idCentroDeAltaEspecialidad, idCentroDeTrabajo, nombre));
            }
        }catch(SQLException e){
            System.out.println("Error al realizar la consulta en centrosDeAltaEspecialidad para recuperar los datos del hospital");
            e.printStackTrace();
        }
        
        
        desconectar();
        return new Hospital(idCentroDeTrabajo, ubicacionHospital, nombreHospital, descripcionHospital ,laboratorios, centros);
     
    }
    
    public ArrayList<Evento> getInfoEventos(){
        ArrayList<Evento> eventos = new ArrayList<>();
        conectar();
        
        ResultSet result = null;
        PreparedStatement statement = null;
           
        
        try{
            String statementText = "SELECT * FROM `ihealth`.`eventos`;" ;
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            while(result.next()){
                String idEvento = result.getString(1);
                String titulo = result.getString(2);
                String descripcion = result.getString(3);
                String fecha = result.getString(4);
                String hora = result.getString(5);
                String ubicacion = result.getString(6);
                String foto = result.getString(7);
            
                
                //Note que para mostrar la informacion del medico no se requiere recuperar la contraseña de su cuenta
                eventos.add(new Evento(idEvento, titulo, descripcion, fecha, hora, ubicacion, foto));
            }

            return eventos;
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta en getInfoEventos");
            e.printStackTrace();
        }
        
        desconectar();
        return eventos;
    }
    
    public ArrayList<Cita> getCitasPaciente(String matriculaPaciente){
        ArrayList<Cita> citas = new ArrayList<>();
        conectar();
        ResultSet result = null;
        PreparedStatement statement = null;
        
        try{
            String statementText = "SELECT * FROM ihealth.citas WHERE matriculaPaciente =\"" + matriculaPaciente + "\";";
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            while(result.next()){
                String idAgendable = result.getString(1);
                String titulo = result.getString(2);
                String descripcion = result.getString(3);
                String fecha = result.getString(4);
                String hora = result.getString(5);
                String idCentroDeTrabajo = result.getString(7);
                String numeroDeEmpleadoDoctor = result.getString(8);
                citas.add(new Cita(idAgendable, matriculaPaciente, idCentroDeTrabajo, numeroDeEmpleadoDoctor, "", titulo, descripcion, fecha, hora));
            }
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta para obtener todas la recetas de un paciente");
            e.printStackTrace();
        }
        
        
        
        desconectar();
        return citas;
    }
    
    public ArrayList<Receta> getRecetasDePaciente(String matriculaPaciente){
        /*
        Primero se toman las recetas del paciente especificado, estas se separan por 
        numero de receta, es decir tengo n recetas del paciente, por cada
        una de esas recetas del paciente, tomo los medicamentos de esa receta
        finalmente agrego los medicamentos a cada receta que tenga el paciente
        */
        
        ArrayList<Receta> recetas = new ArrayList<>();
        conectar();
        ResultSet result = null;
        PreparedStatement statement = null;
        
        try{
            String statementText = "SELECT * FROM ihelth.recetas WHERE matriculaPaciente =" + matriculaPaciente + ";";
            statement = conexion.prepareStatement(statementText);
            result = statement.executeQuery();
                   
            
            while(result.next()){
                //String matriculaPaciente = result.getString(1);
                String numeroReceta = result.getString(2);
                recetas.add(new Receta(matriculaPaciente, numeroReceta, new ArrayList<Medicamento>()));
            }
        }catch (SQLException e){
            System.out.println("Error al realizar la consulta para obtener todas la recetas de un paciente");
            e.printStackTrace();
        }
        
        Iterator iRecetas = recetas.iterator();
        while(iRecetas.hasNext()){
            Receta recetaActual = (Receta) iRecetas.next();
            //Por cada receta se tendria que hacer una consulta en la base de datos para
            //obtener los medicamentos de esa receta
            
            String statementText = "SELECT * FROM ihealth.medicamentos WHERE matriculaPaciente = "+matriculaPaciente+" AND numeroDeReceta =" + recetaActual.getNumeroDeReceta() + ";" ;
            try{
                statement = conexion.prepareStatement(statementText);
                result = statement.executeQuery();
                
                while(result.next()){
                    String idMedicamento = result.getString(1);
                    String numReceta = result.getString(3);
                    String nombreMedicamento = result.getString(4);
                    String descripcionDeHorarios = result.getString(5);
                    String notaDelMedico = result.getString(6);
                    
                    recetaActual.agregarMedicamento(new Medicamento(idMedicamento, matriculaPaciente, numReceta, nombreMedicamento, descripcionDeHorarios, notaDelMedico));
                }
                
            }catch(SQLException e){
                System.out.println("Error al sacar los medicamentos de una receta de la base de datos");
                e.printStackTrace();
            }
        }

        
        desconectar();
        return recetas;
    }
    
    //BETA
    public void savePaciente(CuentaPaciente paciente){
        conectar();
        
        String matricula = paciente.getMatricula();
        String contrasenia = paciente.getContrasenia();
        String nombre = paciente.getNombre();
        String apellido = paciente.getApellido();
        String correo = paciente.getCorreo();
        String codigoPostal = paciente.getCodigoPostal();
        String fechaNacimiento = paciente.getFechaNacimiento();
        
        try{
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO `ihealth`.`cuentas`"
            + "(`correo`,"
            + "`contrasenia`) "
            + "VALUES(?, ?);");

            statement.setString(1, correo);
            statement.setString(2, contrasenia);

            statement.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error al agregar la cuenta, insertando los datos de la tabla cuentas");
            e.printStackTrace();
        }    
        
        try{
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO `ihealth`.`cuentas`"
            + "(`correo`,"
            + "`matricula`, " 
            + "`nombre`, " 
            + "`apellido`, "
            + "`codigoPostal`, "
            + "`fechaNacimiento`) "
            + "VALUES(?, ?, ?, ?, ?, ?);");

            statement.setString(1, correo);
            statement.setString(2, matricula);
            statement.setString(3, nombre);
            statement.setString(4, apellido);
            statement.setString(5, codigoPostal);
            statement.setString(6, fechaNacimiento);
            
            statement.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error al agregar la cuenta, insertando los datos adicionaels de la cuenta en la tabla cuentas pacientes");
            e.printStackTrace();
        }  
            
        desconectar();        
    }
   
    //BETA
    public void saveRecetario(Recetario recetario){
    
    }
    
    
    
    
   
}
