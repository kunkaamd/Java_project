<%-- 
    Document   : show
    Created on : Oct 27, 2016, 3:21:28 PM
    Author     : LOC
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        hello : 
        <s:property value="name" />
        <br>
        ${name}
    </body>
</html>
