<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Danh sach san pham</h1>
        <c:forEach var="sp" items="${dssp}">
            Ma san pham: ${sp.masp}<br>
            Ten san pham: ${sp.tensp}<br>
            Gia: ${sp.gia}<br>
            ==================================<br>
        </c:forEach>
    </body>
</html>
