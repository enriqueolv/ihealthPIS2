/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios_paciente_medicos.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import servicios_generales.model.agendas.Cita;
import servicios_generales.model.cuentas.CuentaPaciente;
import servicios_generales.servicios.ProxyBD;
import servicios_paciente_medicos.model.recetas.Receta;

/**
 *
 * @author Kevin Enrique
 */
public class FabricaGUIPrincipalPacientes {
    public String getGUI(CuentaPaciente cuenta){
        
        ProxyBD proxy = new ProxyBD();
        
        String bootstrap = Bootstrap.getHTML();
        String navbar = Navbar2.getHTML();
        String footer = Footer.getHTML();
        
        
        
        
        
        
        
        
        String GUI = "<html>"
                        +"<header>"
                           +bootstrap
                        +"</header>"
                        +"<body>"
                            +navbar
                            +getContenido(cuenta)
                            +footer
                        +"</body>"
                    +"</html>";
        
        return GUI;
    }
    
    private String getContenido(CuentaPaciente cuenta){
        
        ProxyBD proxy = new ProxyBD();
        ArrayList<Cita>citas = new ArrayList<>();
        citas = proxy.getCitasPaciente(cuenta.getMatricula());
        
        
        String citasHTML = "";
        Iterator iCitas = citas.iterator();
        Cita actual = null;
        while(iCitas.hasNext()){
            citasHTML = citasHTML + "<a href=\" # \">";
            actual =(Cita)iCitas.next();
            citasHTML = citasHTML + actual.getTitulo();
            citasHTML = citasHTML + "</a><br>";
            
        }
    
        String contenido = " <div class=\"container\">\n" +
"            <h2>"+   cuenta.getNombre() +" "+ cuenta.getApellido() +" ("+cuenta.getMatricula()+")</h2>\n" +
"            <ul class=\"nav nav-tabs\">\n" +
"                <li class=\"nav-item\">\n" +
"                    <a class=\"nav-link active\" data-toggle=\"tab\" href=\"#citas\">Citas</a>\n" +
"                </li>\n" +
"                <li class=\"nav-item\">\n" +
"                    <a class=\"nav-link\" data-toggle=\"tab\" href=\"#recetas\">Recetas</a>\n" +
"                </li><li class=\"nav-item\">\n" +
"                    <a class=\"nav-link\" data-toggle=\"tab\" href=\"#expediente\">Expediente Medico</a>\n" +
"                </li>\n" +
"                <li class=\"nav-item\">\n" +
"                    <a class=\"nav-link\" data-toggle=\"tab\" href=\"#pagos\">Pagos</a>\n" +
"                </li>\n" +
"            </ul>\n" +
"\n" +
"\n" +
"\n" +
"            \n" +
"            <div class=\"tab-content\">\n" +
"                <!--\n" +
"                Citas\n" +
"                -->\n" +
"                <div class=\"tab-pane container active\" id=\"citas\">\n" +
"                    <div class=\"container\">\n" +
"                        <div class=\"row\">\n" +
"                            <div class=\"col-md-6 col-sm-12\">\n" +
"                                <div class=\"card mt-3\">\n" +
"                                    <div class=\"card-header\">\n" +
"                                        <h5 class=\"card-title\">Lista de Citas</h5>\n" +
"                                    </div>\n" +
"                                    <div class=\"card-body\">\n" +
"                                        <!--\n" +
"                                        en esta area se colocara el codigo \n" +
"                                        a visualizar por los usuarios\n" +
"                                        -->\n" +
citasHTML +
"                                       \n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                        \n" +
"                            <div class=\"col-md-6 col-sm-12\">\n" +
"\n" +
"                                <section class=\"card mt-3\">\n" +
"                                    <div class=\"card-header\">\n" +
"                                        <h5 class=\"card-title\">Solicitar Cita</h5>\n" +
"                                    </div>\n" +
"                                    <div class=\"card-body\">\n" +
"                                        <form>\n" +
"                                            <div class=\"form-group\">\n" +
"                                                <label>Usuario:</label>\n" +
"                                                <!--<input class=\"form-control\" type=\"text\" name=\"usuario\">-->\n" +
"                                            </div>\n" +
"                                            <div class=\"form-group\">\n" +
"                                                <label>Correo:</label>\n" +
"                                                <!--<input class=\"form-control\" type=\"text\" name=\"correo\">-->\n" +
"                                            </div>\n" +
"                                            <div class=\"form-group\">\n" +
"                                                <label>Fecha</label>\n" +
"                                                <input class=\"form-control\" type=\"text\" name=\"fecha\">\n" +
"                                            </div>\n" +
"                                            <div class=\"form-group\">\n" +
"                                                <label>Hora de Inicio</label>\n" +
"                                                <input class=\"form-control\" type=\"time\" name=\"horaInicio\">\n" +
"                                            </div>\n" +
"                                            <div class=\"form-group\">\n" +
"                                                <label>Hora Final</label>\n" +
"                                                <input class=\"form-control\" type=\"time\" name=\"horaFinal\">\n" +
"                                            </div>\n" +
"                                            <div class=\"form-group col-md-4\">\n" +
"                                                <label for=\"inputDoctor\">Doctor</label>\n" +
"                                                <select id=\"Doctor\" class=\"form-control\">\n" +
"                                                    <option select value=\"1\">Doctor1</option>\n" +
"                                                    <option value=\"2\">Doctor2</option>\n" +
"                                                    <option value=\"3\">Doctor3</option>\n" +
"                                                </select>\n" +
"                                            </div>\n" +
"                                            <div class=\"form-group col-md-4\">\n" +
"                                                <label for=\"inputHospital\">Hospital</label>\n" +
"                                                <select id=\"Hospital\" class=\"form-control\">\n" +
"                                                    <option select value=\"1\">Hospital Materno Infantil</option>\n" +
"                                                    <option value=\"2\">Hospital General Xoco</option>\n" +
"                                                    <option value=\"3\">Hospital General La Villa</option>\n" +
"                                                </select>\n" +
"                                            </div>\n" +
"                                            <button class=\"btn btn-success\">Solicitar</button>\n" +
"                                        </form>\n" +
"                                    </div>\n" +
"                                </section>\n" +
"                            </div>\n" +
"                            </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"\n" +
"\n" +
"                <!--\n" +
"                Recetas\n" +
"                -->\n" +
"                <div class=\"tab-pane container fade\" id=\"recetas\">\n" +
"                    <div class=\"container\">\n" +
"                        <div class=\"row\">\n" +
"                            <div class=\"col-md-6 col-sm-12\">\n" +
"                                <div class=\"card mt-3\">\n" +
"                                    <div class=\"card-header\">\n" +
"                                        <h5 class=\"card-title\">Lista de Recetas</h5>\n" +
"                                    </div>\n" +
"                                    <div class=\"card-body\">\n" +
"                                        <!--\n" +
"                                        en esta area se colocara el codigo \n" +
"                                        a visualizar por los usuarios\n" +
"                                        -->\n" +
"                                        <p class=\"text-center\">No hay Recetas por el momento</p>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                            <div class=\"col-md-6 col-sm-12\">\n" +
"                                <div class=\"card mt-3\">\n" +
"                                    <div class=\"card-header\">\n" +
"                                        <h5 class=\"card-title\">Visualizacion de la Receta Seleccionada</h5>\n" +
"                                    </div>\n" +
"\n" +
"                                    <div class=\"card-body\">\n" +
"                                        <!--\n" +
"                                        en esta area se colocara el codigo \n" +
"                                        a visualizar por los usuarios\n" +
"                                        -->\n" +
"                                        <p class=\"text-center\">Ninguna Receta seleccionada</p>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"                <!--\n" +
"                Expediente\n" +
"                -->\n" +
"                <div class=\"tab-pane container fade\" id=\"expediente\">\n" +
"                    Datos del expediente\n" +
"                </div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"                <!--\n" +
"                Pagos\n" +
"                -->\n" +
"                <div class=\"tab-pane container fade\" id=\"pagos\">\n" +
"                    <div class=\"container\">\n" +
"                        <div class=\"row\">\n" +
"                            <div class=\"col-md-6 col-sm-12\">\n" +
"                                <div class=\"card mt-3\">\n" +
"                                    <div class=\"card-header\">\n" +
"                                        <h5 class=\"card-title\">Lista de Pagos</h5>\n" +
"                                    </div>\n" +
"                                    <div class=\"card-body\">\n" +
"                                        <!--\n" +
"                                        en esta area se colocara el codigo \n" +
"                                        visualizar los usuarios\n" +
"                                        -->\n" +
"                                        <p class=\"text-center\">No hay Adeudos</p>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                            <div class=\"col-md-6 col-sm-12\">\n" +
"                                <div class=\"card mt-3\">\n" +
"                                    <div class=\"card-header\">\n" +
"                                        <h5 class=\"card-title\">Visualizacion de info pagos</h5>\n" +
"                                    </div>\n" +
"\n" +
"                                    <div class=\"card-body\">\n" +
"                                        <!--\n" +
"                                        en esta area se colocara el codigo \n" +
"                                        visualizar los usuarios\n" +
"                                        -->\n" +
"                                        <p class=\"text-center\">Ninguna Receta seleccionada</p>\n" +
"                                    </div>\n" +
"                                </div>\n" +
"                            </div>\n" +
"                        </div>\n" +
"                    </div>\n" +
"                </div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"            <!--Fin tabla de contenidos-->\n" +
"            </div>\n" +
"        <!--Fin tabla de conteiner-->\n" +
"        </div> <br><br>";
        return contenido;
    }
    
    
}
