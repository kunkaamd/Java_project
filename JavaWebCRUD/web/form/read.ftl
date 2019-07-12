<%-- 
    Document   : Read
    Created on : Nov 15, 2016, 4:59:17 PM
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
        <h1>List</h1>
        <table border="0">
            <tr>
                <#list properties as item>
                    <th>${item.name}</th>
                </#list>
            </tr>
        </table>

    </body>
</html>
