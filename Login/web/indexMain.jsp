<%-- 
    Document   : indexMain
    Created on : 18/10/2018, 11:31:53 AM
    Author     : MIRSHA
--%>
<%@page session ="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Menu Maestro</title>
	<style type="text/css">
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
        <% 
        HttpSession sesion =request.getSession();
        String usuario;
        String nivel;
        if(session.getAttribute("user")!=null && sesion.getAttribute("nivel")!=null){
            usuario=sesion.getAttribute("user").toString();
            nivel=sesion.getAttribute("nivel").toString();
           
        }else{
            out.print("<script>location.replace(Login.jsp)</script>");
        }
        %>
        <ul>
		<li><a href="indexMain.jsp" class="activo">Inicio</a></li>
		<li><a href="Formato.jsp">Calificaciones</a></li>
		<li><a href="Parciales.jsp">Parciales</a></li>
		<li><a href="Tutorias.jsp">Tutorias</a></li>
                <li><a href='Login.jsp?cerrar=true'>cerrar sesion</a>
	</ul>
        
        
        
    </body>
</html>
