<%-- 
    Document   : PassLogin
    Created on : Oct 18, 2015, 6:11:42 PM
    Author     : LOC
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <% 
        User user= new User();
        %>
        <title>Welcome</title>
    </head>
    <body>
        <h3 style="margin: auto" >Welcome to website <%= pageContext.getAttribute("User",PageContext.SESSION_SCOPE) %> </h3>
        <%
        ArrayList<String> al = user.allUser();
        for(String string : al){
            out.println(string);
        }
        %>
    </body>
</html>
