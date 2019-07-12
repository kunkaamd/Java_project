<%-- 
    Document   : newjsp
    Created on : Nov 18, 2015, 11:47:04 AM
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
        <% String a="3";%>
        <% String b="5";%>
        <% String c="9";%>
        <a href="newjsp.jsp?aa=<%=a%>&bb=<%=b%>&cc=<%=c%>"><h4>abc ne con</h4></a>
        <%  
            String text1="",text2="",text3="";
            if(request.getParameter("aa")!=null){
            text1=request.getParameter("aa");
            text2=request.getParameter("bb");
            text3=request.getParameter("cc");}
        %>
        <input type="text" name="abc" value="<%= text1%>" />
        <input type="text" name="abc" value="<%= text2%>" />
        <input type="text" name="abc" value="<%= text3%>" />
    </body>
</html>
