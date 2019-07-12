<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <s:form method="post" action="dangnhap">
            <s:textfield name="username" label="Username"></s:textfield><br>
            <s:password name="password" label="Password"></s:password><br>
            <s:submit value="Login"></s:submit>
        </s:form>
        
    </body>
</html>
