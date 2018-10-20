<%-- 
    Document   : Tutorias
    Created on : 19/10/2018, 10:20:17 PM
    Author     : MIRSHA
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="clases.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tutorias</title>
<style>
.h{
    position: absolute; top:100px;left:350px;
}
.h1{
    position: absolute; top:120px;left:350px;
}
.h2{
    position: absolute; top:140px;left:350px;
}
.h3{
    position: absolute; top:160px;left:350px;
}
.tabla{
    background-color: aliceblue;
    position: absolute; top:280px;left:350px;
}
.datos{
    background-color: aliceblue;
     position: absolute; top:330px;left:350px;
}
 body{
			margin: 0;
            background-color:darkslategray;
		}
		ul{
			list-style-type: none;
			margin: 0;
			padding: 0;
			overflow:hidden;
			background-color: #222;
			position: sticky;
			top: 0;
			width: 100%;
		}
		li {
			float: left;
		}
		li a {
			text-decoration: none;
			display: block;
			color: white;
			text-align: center;
			padding: 14px 16px;
		}
		li :hover:not(.activo){
			background-color: gray;
		}
		.activo {
			background-color: blue;
		}
</style>

</head>
<body>
           <ul>
                <li><a href="indexMain.jsp" class="activo">Inicio</a></li>
          
                
            </ul>
    
    
    
    
<h2 class="h">Tutor: </h2>
<h2 class="h1">Carrera: </h2>    
<h2 class="h2">Grupo:</h2>
<h2 class="h3">Ciclo :</h2>
<table border="1" class="tabla" WIDTH="760" HEIGHT="50">
    <tr>
        <td>NO</td><td>ALUMNO</td><td>ACREDITA</td>
        <%  
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
        %>
    </tr>
</table>

</body>
</html>