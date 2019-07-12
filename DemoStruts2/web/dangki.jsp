<%-- 
    Document   : dangki
    Created on : Feb 19, 2014, 1:42:30 PM
    Author     : Tri Phan
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
        
        <s:form method="post" action="dangki">
            <s:textfield label="Username" name="tk.username"></s:textfield><br>
            <s:password label="Password" name="tk.password"></s:password><br>
            <s:textfield label="Ho ten" name="tk.hoten"></s:textfield><br>
            <s:textfield label="Email" name="tk.email"></s:textfield><br>
            <s:textfield label="Website" name="tk.website"></s:textfield><br>
            <s:textfield label="DTB" name="tk.dtb"></s:textfield><br>
            <s:submit value="Save"></s:submit>
        </s:form>
        
    </body>
</html>
