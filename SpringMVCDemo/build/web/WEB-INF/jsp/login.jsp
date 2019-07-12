<%-- 
    Document   : login
    Created on : Sep 2, 2016, 4:25:00 PM
    Author     : LOC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${message}</title>
    </head>
    <body>
        <h1>${message}</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>username</th>
                    <th>password</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${users}" var="key">
                <tr>
                    <td><c:out value="${key.username}"/></td>
                    <td><c:out value="${key.password}"/></td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="login.htm">login and view all user</a>

    </body>
</html>
