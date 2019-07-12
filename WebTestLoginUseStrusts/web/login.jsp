<%-- 
    Document   : login
    Created on : Nov 24, 2015, 4:20:34 PM
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
        <h3>Sử dụng form Struts2</h3>
        <s:form action="login" method="post">
            <s:textfield name="username" label="Username"></s:textfield><br>
            <s:password name="password" label="Password"></s:password><br>
            <s:submit value="Đăng Nhập"></s:submit>
        </s:form>
        <a href="register.jsp">Đăng Ký</a>
        <h3>Sử dụng form bình thường</h3>
        <form action="login" method="post">
            <input type="text" name="username" value="" />
            <input type="password" name="password" value="" />
            <input type="submit" value="Dang Nhap" name="b" />
        </form>
        <a href="register.jsp">Đăng Ký</a>
        
    </body>
</html>
