
package servicios_paciente_medicos.servicios;

/**
 *
 * @author Kevin Enrique
 */
public class Navbar2 {
    public static String getHTML(){
        String navbar2 = "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
"    <a class=\"navbar-brand\" href=\"/ihealth_v2\"> ABC </a>\n" +
"    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" \n" +
"    aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"      <span class=\"navbar-toggler-icon\"></span>\n" +
"    </button>\n" +
"\n" +
"    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
"      <ul class=\"navbar-nav mr-auto\">\n" +
"        <li class=\"nav-item active\">\n" +
"          <a class=\"nav-link text-info\" href=\"/ihealth_v2\">Ihealth<span class=\"sr-only\">(current)</span></a>\n" +
"        </li>\n" +
"        <li class=\"nav-item\">\n" +
"          <a class=\"nav-link text-info\" href=\"/ihealth_v2\">Conocenos</a>\n" +
"        </li>\n" +
"\n" +
"        <li class=\"nav-item dropdown\">\n" +
"          \n" +
"          <a class=\"nav-link text-info\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Directorio</a>\n" +
"          <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n" +
"            <a class=\"dropdown-item\" href=\"/ihealth_v2/servletDirectorioMedico\">Medicos</a>\n" +
"            <a class=\"dropdown-item\" href=\"/ihealth_v2/servletInstalaciones\">Instalaciones</a>\n" +
"          </div>\n" +
"        </li>               \n" +
"      </ul>\n" +
"    </div>\n" +
"</nav>";
        
        return navbar2;
    }
}
