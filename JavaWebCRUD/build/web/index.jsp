<%-- 
    Document   : index
    Created on : Sep 11, 2016, 3:50:12 PM
    Author     : LOC
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            ul{
                list-style:none;
                background-color: #ff3333;
                width:100px;
            }
            span{
                margin-left: -20px;
            }
        </style>
    </head>
    <body>
        <s:fielderror />
        <form action="upload" method="post" enctype="multipart/form-data">
            Upload your file<br>
           <input type="file" name="myFile" /><br>
           <input type="submit" value="Upload"/>
           
        </form>
    </body>
</html>
