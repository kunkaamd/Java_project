<%-- 
    Document   : error
    Created on : Sep 11, 2016, 4:09:35 PM
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
        <h1></h1>
        <s:if test="hasActionErrors()">
            <div class="errors">
               <s:actionerror/>
            </div>
         </s:if>
    </body>
</html>
