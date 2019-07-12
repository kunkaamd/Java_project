<%-- 
    Document   : Table
    Created on : Nov 15, 2016, 4:51:38 PM
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
        <h1>Update</h1>
        <form action="Update${name}Servlet">
            <#list properties as item>  
                <#if item.type?contains("int")>
                    <input type="number" value="${item.name}"><br>
                <#elseif item.type?contains("datetime")>
                    <input type="datetime" value="${item.name}"><br>
                <#elseif item.type?contains("time")>
                    <input type="time" value="${item.name}"><br>
                <#elseif item.type?contains("date")>
                    <input type="date" value="${item.name}"><br>
                <#else>
                    <input type="text" value="${item.name}"><br>
                </#if>
            </#list>
            <input type="submit" value="Update">
        </form>
    </body>
</html>
