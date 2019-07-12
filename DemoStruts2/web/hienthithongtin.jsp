<%-- 
    Document   : hienthithongtin
    Created on : Feb 19, 2014, 1:43:47 PM
    Author     : Tri Phan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Thong tin tai khoan</h1>
        Username: ${tk.username}<br>
        Password: ${tk.password}<br>
        Ho ten: ${tk.hoten}<br>
        Email: ${tk.email}<br>
        Website: ${tk.website}<br>
        DTB: ${tk.dtb}<br>
    </body>
</html>
