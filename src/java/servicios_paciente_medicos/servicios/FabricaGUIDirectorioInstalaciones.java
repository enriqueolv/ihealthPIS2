
package servicios_paciente_medicos.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import servicios_generales.model.instalaciones.Hospital;
import servicios_generales.servicios.ProxyBD;

/**
 *
 * @author Kevin Enrique
 */
public class FabricaGUIDirectorioInstalaciones {
    public String getGUI(){
        String GUI = "";
        ProxyBD proxy = new ProxyBD();
        ArrayList<Hospital> hospitales = proxy.getInfoHospitales();
        Iterator iterHospitales = hospitales.iterator();
        
        GUI = "";
        String bootstrap = Bootstrap.getHTML();
        String navbar = Navbar2.getHTML();
        String footer = Footer.getHTML();
        
        String tituloGUI = "<h2>Hospitales</h2><br>";
  
        
        
        String tabla = "<table class=\"table table-bordered\">";
        while(iterHospitales.hasNext()){
            Hospital actual = (Hospital) iterHospitales.next();
            String nombre = actual.getNombre();
            String ubicacion = actual.getUbicacion();
            String descripcion = actual.getDescripcion();

            String elementoTabla = "<tr>\n" +
"                <td colspan=\"2\" style=\"background-color: cadetblue\"><a href=\"http://data.salud.cdmx.gob.mx/portal/index.php/um-sedesa/110-hospital-materno-infantil-dr-nicolas-m-cedillo-soriano\" target=\"_blank\" class=\"list-group-item list-group-item-action\" >"+ nombre +"</a>\n" +
"                </td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td class=\"col-sm-3 col-md-6\" >\n" +
"                    <p></p>\n" +
"                    <p>" + descripcion+   "</p>\n" +
"                </td>\n" +
"                <td><iframe src=\" " + ubicacion  + "    \" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe></td>\n" +
"\n" +
"            </tr>";

            tabla = tabla + elementoTabla;
        }
        tabla = tabla + "</table>";
        
        
        
        GUI = "<html><head>"+ bootstrap+"</head>"
              +"<body>"
              + navbar
              +"<div class=\"container\">" + tituloGUI +   tabla  +"</div>"+footer + "</body></html>";
        
        
        return GUI;
    }
}
