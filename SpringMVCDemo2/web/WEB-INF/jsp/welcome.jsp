<%-- 
    Document   : welcome
    Created on : Oct 25, 2016, 3:19:25 PM
    Author     : LOC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Hello ${welcomeuser.username}</h1>
        <h2>Password của bạn là ${welcomeuser.password}</h2>
    </body>
</html>
