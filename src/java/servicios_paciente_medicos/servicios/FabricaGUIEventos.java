/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios_paciente_medicos.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import servicios_generales.model.eventos.Evento;
import servicios_generales.servicios.ProxyBD;

/**
 *
 * @author Kevin Enrique
 */
public class FabricaGUIEventos {
    public String getGUI(){
        ProxyBD proxy = new ProxyBD();
        ArrayList<Evento> eventos = new ArrayList<>();
        eventos = proxy.getInfoEventos();
        
        String bootstrap  = Bootstrap.getHTML();
        String navbar = Navbar.getHTML();
        String footer = Footer.getHTML();
        
        String contenido = "";
        String tabla = "";
        Iterator<Evento> iterEventos = eventos.iterator();
        Evento evento = null;
        while(iterEventos.hasNext()){
            tabla = "<table class=\"table table-hover table-bordered\">";
            evento = iterEventos.next();
            tabla = tabla +
            "<tr class=\"col-sm-3 col-md-6\">\n" +
"                    <td colspan=\"2\" style=\"background-color: cadetblue\"><a href=\"http://data.salud.cdmx.gob.mx/portal/index.php/um-sedesa/110-hospital-materno-infantil-dr-nicolas-m-cedillo-soriano\" target=\"_blank\" class=\"list-group-item list-group-item-action\" >"+evento.getTitulo()+"</a>\n" +
"                    </td>\n" +
"                </tr>\n" +
"                <tr class=\"col-sm-3 col-md-6\">\n" +
"                    <td rowspan=\"4\"><iframe src=\" "+ evento.getUbicacion()   +" \" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe></td>\n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td class=\"col-sm-3 col-md-6\" >Hora: "+ evento.getHora() + "</td>\n" +
"                </tr>\n" +
"                <tr class=\"col-sm-3 col-md-6\"><td>fecha: "+ evento.getFecha() +    "</td> \n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td class=\"col-sm-3 col-md-6\">Descripciòn del evento: "+ evento.getDescripcion()  +" </td>\n" +
"                </tr>     ";
            
            
            
            
            tabla = tabla + "</table>";
            contenido = contenido + tabla;
        }
       
        
        
        
        String GUI = "<html><head>"+bootstrap+"<head/><body>"+navbar+"<h2>EVENTOS</h2><br><div class=\"container\">"+contenido+"</div><br>"+footer+"</body></html>";
        
        return GUI;
    }
}
