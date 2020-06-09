/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios_paciente_medicos.servicios;

import servicios_generales.model.cuentas.CuentaPaciente;


public class FabricaDeGUIS {
    public String getGuiDirectorioMedico(){
        String HTML_GUI = "\"<head></head><body>Saludos desde la fabrica</body>\"";
        FabricaGUIDirectorioMedico fabrica = new FabricaGUIDirectorioMedico();
        
        HTML_GUI = fabrica.getGUI();
        return HTML_GUI;
    }
    
    public String getGUIDirectorioInstalaciones(){
        String HTML_GUI = "";
        FabricaGUIDirectorioInstalaciones fabrica = new FabricaGUIDirectorioInstalaciones();
        
        HTML_GUI = fabrica.getGUI();
        return HTML_GUI;
    }
    
    public String getGUIEventos(){
        String HTML_GUI = "";
        FabricaGUIEventos fabrica = new FabricaGUIEventos();
        
        HTML_GUI = fabrica.getGUI();
        return HTML_GUI;
    }
    
    public String getGUIPrincipalPacientes(CuentaPaciente cuenta){
        String HTML_GUI = "";
        FabricaGUIPrincipalPacientes fabrica = new FabricaGUIPrincipalPacientes();

        HTML_GUI = fabrica.getGUI(cuenta);
        
        return HTML_GUI;
    }
}
