package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.io.PrintWriter;
import clases.Conexion;
import java.sql.Connection;

public final class Tutorias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Tutorias</title>\n");
      out.write("<style>\n");
      out.write(".h{\n");
      out.write("    position: absolute; top:100px;left:350px;\n");
      out.write("}\n");
      out.write(".h1{\n");
      out.write("    position: absolute; top:120px;left:350px;\n");
      out.write("}\n");
      out.write(".h2{\n");
      out.write("    position: absolute; top:140px;left:350px;\n");
      out.write("}\n");
      out.write(".h3{\n");
      out.write("    position: absolute; top:160px;left:350px;\n");
      out.write("}\n");
      out.write(".tabla{\n");
      out.write("    background-color: aliceblue;\n");
      out.write("    position: absolute; top:280px;left:350px;\n");
      out.write("}\n");
      out.write(".datos{\n");
      out.write("    background-color: aliceblue;\n");
      out.write("     position: absolute; top:330px;left:350px;\n");
      out.write("}\n");
      out.write(" body{\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("            background-color:darkslategray;\n");
      out.write("\t\t}\n");
      out.write("\t\tul{\n");
      out.write("\t\t\tlist-style-type: none;\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t\toverflow:hidden;\n");
      out.write("\t\t\tbackground-color: #222;\n");
      out.write("\t\t\tposition: sticky;\n");
      out.write("\t\t\ttop: 0;\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t}\n");
      out.write("\t\tli {\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t}\n");
      out.write("\t\tli a {\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tdisplay: block;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tpadding: 14px 16px;\n");
      out.write("\t\t}\n");
      out.write("\t\tli :hover:not(.activo){\n");
      out.write("\t\t\tbackground-color: gray;\n");
      out.write("\t\t}\n");
      out.write("\t\t.activo {\n");
      out.write("\t\t\tbackground-color: blue;\n");
      out.write("\t\t}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("           <ul>\n");
      out.write("                <li><a href=\"indexMain.jsp\" class=\"activo\">Inicio</a></li>\n");
      out.write("          \n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<h2 class=\"h\">Tutor: </h2>\n");
      out.write("<h2 class=\"h1\">Carrera: </h2>    \n");
      out.write("<h2 class=\"h2\">Grupo:</h2>\n");
      out.write("<h2 class=\"h3\">Ciclo :</h2>\n");
      out.write("<table border=\"1\" class=\"tabla\" WIDTH=\"760\" HEIGHT=\"50\">\n");
      out.write("    <tr>\n");
      out.write("        <td>NO</td><td>ALUMNO</td><td>ACREDITA</td>\n");
      out.write("        ");
  
      Conexion m = new Conexion ();
      Connection con = m.conectar();
      Statement  stmt = null; 
      try { 
      stmt = con.createStatement();
      String sql="select a.n_control,nombre,paterno,materno,sum(calificacion)/count(DISTINCT nombre_materia) as promedio from alumnos a inner join registrosalumnos b on a.n_control=b.n_control inner join materias c on c.idmateria=b.idmateria where a.nombre='aladino';";
      PreparedStatement pstmt = con.prepareStatement(sql);
      ResultSet rs = pstmt.executeQuery();
      while (rs.next()){      
      out.println("<table border=2 class='datos' WIDTH='760' HEIGHT='50'><tr> <td>"+rs.getString("n_control")+"</td><td>"+rs.getString("nombre")+"_"+rs.getString("paterno")+"_"+rs.getString("materno")+"</td><td>"+rs.getString("promedio")+"</td></tr></table>");   
                   }
    
      } 
      catch( SQLException e ) { 
      e.printStackTrace(); 
      } 
      finally { 
      if ( con != null ) { 
      try    { 
      con.close(); 
      stmt.close(); 
      } catch( Exception e ) { 
       System.out.println( e.getMessage()); 
      } 
      }
      }
        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
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
