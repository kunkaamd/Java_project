<%-- 
    Document   : register
    Created on : Feb 5, 2016, 1:30:33 PM
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
        <s:form action="Register" method="post">
            <s:textfield name="username" label="Username"></s:textfield><br>
            <s:password name="password" label="Password"></s:password><br>
            <s:textfield name="name" label="Tên User"></s:textfield>
            <s:submit value="Đăng Ký"></s:submit>
        </s:form>
    </body>
</html>
