<%-- 
    Document   : Parciales
    Created on : 19/10/2018, 08:40:29 PM
    Author     : MIRSHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <style>
    .tab{
    background-color:rgb(183, 183, 226);
    position: absolute;top:200px;left:350px;

    }
    .nombre{
        text-align: center;
    }
    .tab2{
         background-color: aliceblue;
        position: absolute;top:280px;left:350px;
    }
    .tab3{
         background-color: aliceblue;
        position: absolute;top:280px;left:525px;
    }
    .tab4{
         background-color: aliceblue;
        position: absolute;top:350px;left:525px;
    }
    .tab5{
         background-color: aliceblue;
        position: absolute;top:280px;left:700px;
    }
    .tab6{
         background-color: aliceblue;
        position: absolute;top:280px;left:865px;
    }
    .tab7{
         background-color: aliceblue;
        position: absolute;top:350px;left:865px;
    }
    .tab8{
         background-color: aliceblue;
        position: absolute;top:420px;left:350px;
    }
    .tab9{
         background-color: aliceblue;
        position: absolute;top:490px;left:350px;
    }
    .tab10{
         background-color: aliceblue;
        position: absolute;top:560px;left:350px;
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
    <div>

<table border="2" WIDTH="760" HEIGHT="50" class="tab">
<tr>
<td class="nombre" >Formato Parcial de Tutorias </td>
</tr>
<tr>
<td> Nombre del tutor :     </td>
</tr>    
<tr>
<td>Periodo escolar : 2017-B ............................ Fecha:19 OCTUBRE 2018       </td> 
</tr>
</table>

<table class="tab2" border="2">
<tr>
<td HEIGHT="130" WIDTH="50" > Parcial</td> <td HEIGHT="130" WIDTH="50" > Grupo</td> <td HEIGHT="130" WIDTH="50" > Carrera</td>
</tr>
</table>
<table  border="1" class="tab3">
    <tr>
        <td HEIGHT="65" WIDTH="170"> No alumnos</td>
    </tr>
</table>

<table class="tab4" border="1" WIDTH="70" HEIGHT="70">
    <tr>
        <td>Inicio parcial</td><td>Final parcial</td><td>Diferencia</td>
    </tr>
</table>
<table border="1" class="tab5">
    <tr>
        <td HEIGHT="130" WIDTH="30" >Desercion</td> <td HEIGHT="130" WIDTH="30" >Reprobacion </td>
    </tr>
</table>
<table class="tab6" border="1">
    <tr>
        <td  HEIGHT="65" WIDTH="115"> No Alumnos UAAs</td><td  HEIGHT="65" WIDTH="115">No Alumnos Canalizados</td>
    </tr>
</table>
<table  class="tab7" border="1" WIDTH="60" HEIGHT="70">
    <tr>
        <td>inicio parcial</td><td>Final Parcial</td><td>psicologia</td><td>medicina</td>
    </tr>
</table>
<table class="tab8" border="1" WIDTH="760" HEIGHT="70">
    <tr>
        <td>1º</td><td>10</td> <td>10</td> <td>20</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td>
        <td>10</td> <td>10</td>
    </tr>
</table>
<table class="tab9" border="1" WIDTH="760" HEIGHT="70">
        <tr>
            <td>2º</td><td>10</td> <td>10</td> <td>20</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td>
            <td>10</td> <td>10</td>
        </tr>
    </table>
    <table class="tab10" border="1" WIDTH="760" HEIGHT="70">
            <tr>
                <td>3º</td><td>10</td> <td>10</td> <td>20</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td> <td>10</td>
                <td>10</td> <td>10</td>
            </tr>
        </table>
    </body>
</html>
