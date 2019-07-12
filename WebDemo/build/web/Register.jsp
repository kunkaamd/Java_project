<%-- 
    Document   : Register
    Created on : Oct 18, 2015, 7:19:05 PM
    Author     : LOC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <form method="POST" action="registerSever">
            NEW USERNAME <input type="text" name="txtUser" value="" placeholder="User"/><br>
            NEW PASSWORD <input style="margin-left: 2px " type="password" name="txtPass" value="" placeholder="******"/>
            <br>
            <input type="submit" value="Register" name="btnRegister" />
        </form>
        
    </body>
</html>
