<%-- 
    Document   : Formato
    Created on : 21/10/2018, 12:22:27 PM
    Author     : MIRSHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<style>
	.materias{
    background-color:rgb(183, 183, 226);
    position: absolute;top:300px;left:60px;
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
           <h3>calificaciones Primer parcial</h3>   GRUPO :<input type="text" name="grupo"> TuTor :<input type="text" name="Tutor">                      
           Carrera<input type="text" name="carrera">   CICLO :<input type="text" name="ciclo">  

           <input type="submit" name="boton" value="consultar">
  
<table border="1" class="materias " WIDTH="1200" HEIGHT="50">
	<tr>
		  <td>n_control</td><td>Alumno</td><td>Materia</td> 	<td>Materia</td>	<td>Materia</td>	<td>Materia</td>	<td>Materia</td>	<td>Materia</td>	<td>Materia</td><td>promedio</td><td>Mat.Aprob</td>
	<tr>	
</table>	
</body>
</html>