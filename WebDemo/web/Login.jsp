<%-- 
    Document   : Login
    Created on : Oct 18, 2015, 5:37:30 PM
    Author     : LOC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form method="POST" action="server">
            USERNAME <input type="text" name="txtUser" value="" placeholder="User"/><br>
            PASSWORD <input style="margin-left: 2px " type="password" name="txtPass" value="" placeholder="******"/>
            <br>
            <input type="submit" value="Login" name="btnLogin"/>
        </form>
        <br>
        <a href="Register.jsp">RegisterUser</a>
        
        
        
    </body>
</html>
