<%-- 
    Document   : index
    Created on : Oct 27, 2016, 3:21:08 PM
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
        
        cách 1:viết trực tiếp href="name.action?param=value"
        <p><a href="test.action?name=Loc">test.action?name=Loc</a></p>
        cách 2:viết bằng thẻ s:url<br>
        <s:url action="test" var="myurl">
            <s:param name="name">Loc</s:param>
        </s:url>
        <a href='<s:property value="#myurl"/>'>
<s:property value="#myurl"/></a>
    </body>
</html>
