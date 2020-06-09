/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios_paciente_medicos.servicios;

/**
 *
 * @author Kevin Enrique
 */
public class Navbar {
    public static String getHTML(){
        String navbar = "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
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
"      \n" +
"      <form class=\"form-inline my-2 my-lg-0\" action=\"index.html\">\n" +
"        <button class=\"btn btn-outline-info my-2 my-sm-0\" type=\"submit\">Registrarse</button>\n" +
"      </form>\n" +
"        &nbsp;\n" +
"       <form class=\"form-inline my-2 my-lg-0\" action=\"index.html\">\n" +
"        <a class=\"btn btn-outline-info my-2 my-sm-0\" href=\"/ihealth_v2/portal_clientes/login.jsp\">Iniciar Sesion</a>\n" +
"      </form>\n" +
"    </div>\n" +
"</nav>";
        
        return navbar;
    }
}
