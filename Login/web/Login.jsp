<%-- 
    Document   : index
    Created on : 18/10/2018, 10:27:00 AM
    Author     : MIRSHA
--%>
<%@page session ="true"%>
<%@page import="clases.Conectar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link href="css/stilo.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script>
      
          $(document).ready(function(){
          $('.imagen').hide().show("slow");
           });           
       </script>
        
       
     
       
        <title>Login</title>
    </head>
    
    <body> 
 <div class="imagen">
<img src="Imagen/hola.jpg" />

</div>       
        <h1>Formulario de acceso</h1>
<form id="form" name="form" action="Login.jsp" method="post">
	<div id="block">
		<label id="user" for="name">p</label>
		<input type="text" name="txtusuario" id="name" placeholder="Username" required/>
		<label id="pass" for="password">k</label>
		<input type="password" name="txtcontra" id="password" placeholder="Password" required />
		<input type="submit" id="submit" name="submit" value="a"/>
	</div>
</form>
        
        <% 
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
        
        %>        
    </body>
</html>
