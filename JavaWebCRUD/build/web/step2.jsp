<%-- 
    Document   : success
    Created on : Sep 11, 2016, 4:10:14 PM
    Author     : LOC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        File:<s:property value="myFileFileName"/>
        <br>
        <hr>
        <form action="generator" method="post">
            Name project: <input type="text" name="nameProject" value="${myFileFileName}" required><br>
            DB_DRIVER: <input type="text" name="dbDriver" required><br>
            DB_URL : <input type="text" name="dbUrl" required><br>
            DB_USER: <input type="text" name="dbUser" required><br>
            DB_PASS: <input type="password" name="dbPass" required><br>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
