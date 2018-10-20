package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clases.Conectar;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <link href=\"css/stilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("      \n");
      out.write("          $(document).ready(function(){\n");
      out.write("          $('.imagen').hide().show(\"slow\");\n");
      out.write("           });           \n");
      out.write("       </script>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("     \n");
      out.write("       \n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body> \n");
      out.write(" <div class=\"imagen\">\n");
      out.write("<img src=\"Imagen/hola.jpg\" />\n");
      out.write("\n");
      out.write("</div>       \n");
      out.write("        <h1>Formulario de acceso</h1>\n");
      out.write("<form id=\"form\" name=\"form\" action=\"Login.jsp\" method=\"post\">\n");
      out.write("\t<div id=\"block\">\n");
      out.write("\t\t<label id=\"user\" for=\"name\">p</label>\n");
      out.write("\t\t<input type=\"text\" name=\"txtusuario\" id=\"name\" placeholder=\"Username\" required/>\n");
      out.write("\t\t<label id=\"pass\" for=\"password\">k</label>\n");
      out.write("\t\t<input type=\"password\" name=\"txtcontra\" id=\"password\" placeholder=\"Password\" required />\n");
      out.write("\t\t<input type=\"submit\" id=\"submit\" name=\"submit\" value=\"a\"/>\n");
      out.write("\t</div>\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("        ");
 
        Conectar op  =new Conectar();
        if(request.getParameter("submit")!=null){
            String nombre=request.getParameter("txtusuario");
            String contra=request.getParameter("txtcontra");
            HttpSession sesion =request.getSession();
            switch(op.loguear(nombre,contra)){
                
                case 1:
                    
                    sesion.setAttribute("user",nombre);
                    sesion.setAttribute("nivel","1");
                    response.sendRedirect("indexMain.jsp");
                    
                break;
                    
                    
                case 2:
                  
                    sesion.setAttribute("user",nombre);
                    sesion.setAttribute("nivel","2");
                    response.sendRedirect("indexMain.jsp");
                    
                break; 
                    
                default:
                    out.write("el usuario no existe o contraseña invalida");
                    break;
            }
            
        }
        if(request.getParameter("cerrar")!=null){
           session.invalidate();
        }
        
        
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
