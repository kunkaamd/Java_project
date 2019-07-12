<%-- 
    Document   : dangky
    Created on : Oct 25, 2016, 3:00:15 PM
    Author     : LOC
--%>
<%@taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        commandName tên attribute với đối tượng không đối số và spring tự động gán các đối số vào từ dữ liệu trong form
        <spr:form method="post" action="register" commandName="user" >
            username<spr:input path="username" /><br>
            password<spr:password path="password"/><br>
            <input type="submit" value="Đăng Ký">
        </spr:form>
    </body>
</html>
