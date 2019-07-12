<%-- 
    Document   : registerComplete
    Created on : Nov 24, 2015, 3:21:49 PM
    Author     : LOC
--%>
<%@page import="com.model.User"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome Website</h1>
        <h2>${username}</h2>
        <h2>${password}</h2>
        <h2>${name}</h2>
        <table border="1">
            <th>
                    UserName
            </th>
            <th>
                    Password
            </th>
            <th>
                    Tên người dùng
            </th>
            <s:iterator value="users" status="i">
                <tr>
                    <td>
                        <s:property value="userName"/>
                    </td>
                    <td>
                        <s:property value="userPassword"/>
                    </td>
                    <td>
                        <s:property value="userMyname"/>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
