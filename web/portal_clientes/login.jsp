<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    
<%@ include file="/WEB-INF/navbar.html" %>
    <head>
        <link href="login.css" rel="stylesheet" id="bootstrap-css">
    </head>
    <body>
         <br><br>
        <form action="/ihealth_v2/servletLoginCliente" method="post">
        <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Ingresar</label>
		<input id="tab-2" type="radio" name="tab" class="for-pwd"><label for="tab-2" class="tab">Olvide mi contrase�a</label>
                
                
                
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Usuario</label>
					<input id="user" name="usuario" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Contrase�a</label>
					<input id="pass" name = "contrasenia" type="password" class="input" data-type="password">
				</div>
                            
				<div class="group">
					<input type="submit" class="button" value="Ingresar">
				</div>
				<div class="hr"></div>
			</div>
			<div class="for-pwd-htm">
				<div class="group">
					<label for="user" class="label">Usuario o email</label>
					<input id="user" type="text" class="input">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Restaurar contrase�a">
				</div>
				<div class="hr"></div>
			</div>
		</div>
                    
               
	</div>
        </div>
            <br><br>
             <br><br>
            
        </form>
    </body>
    <%@ include file="/WEB-INF/footer.jsp" %>
</html>
