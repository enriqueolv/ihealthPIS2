package org.apache.jsp.portal_005fclientes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dir_005fmedico_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/navbar.html");
    _jspx_dependants.add("/WEB-INF/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<head>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <LINK REL=StyleSheet HREF=\"/ihealth_v2/assets/styles/index.css\" TYPE=\"text/css\" MEDIA=screen>\n");
      out.write("  <title>Ihealth</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"/ihealth_v2\"> ABC </a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" \n");
      out.write("      aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link text-info\" href=\"/ihealth_v2\">Ihealth<span class=\"sr-only\">(current)</span></a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link text-info\" href=\"/ihealth_v2\">Conocenos</a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("            <a class=\"nav-link text-info\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Directorio</a>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("              <a class=\"dropdown-item\" href=\"/ihealth_v2/servletDirectorioMedico\">Medicos</a>\n");
      out.write("              <a class=\"dropdown-item\" href=\"/ihealth_v2/portal_clientes/instalaciones.jsp\">Instalaciones</a>\n");
      out.write("            </div>\n");
      out.write("          </li>               \n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\" action=\"index.html\">\n");
      out.write("          <a class=\"btn btn-outline-info my-2 my-sm-0\" href=\"/ihealth_v2/portal_clientes/pagina_de_registro.jsp\">Registrarse</a>\n");
      out.write("        </form>\n");
      out.write("          &nbsp;\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\" action=\"index.html\">\n");
      out.write("          <a class=\"btn btn-outline-info my-2 my-sm-0\" href=\"/ihealth_v2/portal_clientes/login.jsp\">Iniciar Sesion</a>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("  </nav>\n");
      out.write("</body>    \n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"card\" style=\"width: 300px;\">\n");
      out.write("            <img src=\"/ihealth_v2/assets/imagenes/generic-doctor-m.png\" class=\"card-img-top rounded-circle\"  alt=\"imagen médico\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <h5 class=\"card-title\">Nombre médico</h5>\n");
      out.write("              <h6 class=\"card-text\">Departamento</h6>\n");
      out.write("              <h7 class=\"card-text\">Instalación</h7> <br>\n");
      out.write("              <a href=\"#collapsedContact\" class=\"btn btn-primary\" data-toggle=\"collapse\"role=\"button\" aria-expanded=\"false\" aria-controls=\"collapsedContact\">Contacto</a>\n");
      out.write("              <a href=\"#collapsedInfo\" class=\"btn btn-primary\" data-toggle=\"collapse\"role=\"button\" aria-expanded=\"false\" aria-controls=\"collapsedInfo\">Ver más</a>\n");
      out.write("              <div class=\"collapse\" id=\"collapsedInfo\">\n");
      out.write("                <div class=\"card card-body\">\n");
      out.write("                  <h6 class=\"card-text\">Especialidad: mi especialidad</h6>\n");
      out.write("                  <h6 class=\"card-text\">Egresado de: mi univiersidad</h6>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"collapse\" id=\"collapsedContact\">\n");
      out.write("                <div class=\"card card-body\">\n");
      out.write("                  <h6 class=\"card-text\">email: </h6>\n");
      out.write("                  <h6 class=\"card-text\">Telefono: </h6>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  <div class=\"card\" style=\"width: 300px;\">\n");
      out.write("    <img src=\"/ihealth_v2/assets/imagenes/generic-doctor-m.png\" class=\"card-img-top rounded-circle\"  alt=\"imagen médico\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("      <h5 class=\"card-title\">Nombre médico</h5>\n");
      out.write("      <h6 class=\"card-text\">Departamento</h6>\n");
      out.write("      <h7 class=\"card-text\">Instalación</h7> <br>\n");
      out.write("      <a href=\"#collapsedContact\" class=\"btn btn-primary\" data-toggle=\"collapse\"role=\"button\" aria-expanded=\"false\" aria-controls=\"collapsedContact\">Contacto</a>\n");
      out.write("      <a href=\"#collapsedInfo\" class=\"btn btn-primary\" data-toggle=\"collapse\"role=\"button\" aria-expanded=\"false\" aria-controls=\"collapsedInfo\">Ver más</a>\n");
      out.write("      <div class=\"collapse\" id=\"collapsedInfo\">\n");
      out.write("        <div class=\"card card-body\">\n");
      out.write("          <h6 class=\"card-text\">Especialidad: mi especialidad</h6>\n");
      out.write("          <h6 class=\"card-text\">Egresado de: mi univiersidad</h6>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"collapse\" id=\"collapsedContact\">\n");
      out.write("        <div class=\"card card-body\">\n");
      out.write("          <h6 class=\"card-text\">email: </h6>\n");
      out.write("          <h6 class=\"card-text\">Telefono: </h6>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Footer -->\n");
      out.write("         <!-- Site footer -->\n");
      out.write("<footer class=\"site-footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-sm-12 col-md-6\">\n");
      out.write("            <h6>About</h6>\n");
      out.write("            <p class=\"text-justify\">Scanfcode.com <i>CODE WANTS TO BE SIMPLE </i> is an initiative  to help the upcoming programmers with the code. Scanfcode focuses on providing the most efficient code or snippets as the code wants to be simple. We will help programmers build up concepts in different programming languages that include C, C++, Java, HTML, CSS, Bootstrap, JavaScript, PHP, Android, SQL and Algorithm.</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-8 col-sm-6 col-xs-12\">\n");
      out.write("            <p class=\"copyright-text\">Copyright &copy; 2020 All Rights Reserved by\n");
      out.write("         <a href=\"#\">Ihealth</a>.\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("            <ul class=\"social-icons\">\n");
      out.write("              <li><a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("              <li><a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("              <li><a class=\"dribbble\" href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("              <li><a class=\"linkedin\" href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>   \n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("</footer>\n");
      out.write("        <!-- Footer -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
