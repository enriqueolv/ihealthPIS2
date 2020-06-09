
package servicios_paciente_medicos.model.recetas;


public class Medicamento {
    private String idMedicamento;
    private String matriculaPaciente;
    private String numReceta;
    private String nombreMedicamento;
    private String descripcionDeHorarios;
    private String notaDelMedico;
    
    public Medicamento(){
    }
    
    public Medicamento(String idMedicamento, String matriculaPaciente, String numReceta, String nombreMedicamento, String descripcionDeHorarios, String notaDelMedico){
        this.idMedicamento = idMedicamento;
        this.numReceta = numReceta;
        this.matriculaPaciente = matriculaPaciente;
        this.nombreMedicamento = nombreMedicamento;
        this.descripcionDeHorarios = descripcionDeHorarios;
        this.notaDelMedico = notaDelMedico;
    }
    
    public void setIdMedicamento(String idMedicamento){
        this.idMedicamento = idMedicamento;
    }
    public void setNumReceta(String numReceta){
        this.numReceta = numReceta;
    }
    public void setMatriculaPaciente(String matriculaPaciente){
        this.matriculaPaciente = matriculaPaciente;
    }
    public void setNombreMedicamento(String nombreMedicamento){
        this.nombreMedicamento = nombreMedicamento;
    }
    public void setDescripcionDeHorarios(String descripcionDeHorarios){
        this.descripcionDeHorarios = descripcionDeHorarios;
    }
    public void setNotaDelMedico(String notaDelMedico){
        this.notaDelMedico = notaDelMedico;
    }
    
    
    
    public String getIdMedicamento(){
        return this.idMedicamento;
    }
    public String getNumReceta(){
        return this.numReceta;
    }
    public String getMatriculaPaciente(){
        return this.matriculaPaciente;
    }
    public String getNombreMedicamento(){
        return this.nombreMedicamento;
    }
    public String getDescripcionDeHorarios(){
        return this.descripcionDeHorarios;
    }
    public String getNotaDelMedico(){
        return this.notaDelMedico;
    }
    
}
