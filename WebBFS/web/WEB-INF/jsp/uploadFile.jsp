<%-- 
    Document   : uploadSingleFile
    Created on : Oct 25, 2016, 7:38:50 PM
    Author     : LOC
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            tr:hover {
                background-color: chartreuse;
            }
            td{
                width: 350px;
                
            }
        </style>
    </head>
    <body>
            <form:form method="post" action="savefile" enctype="multipart/form-data">  
                <label for="image">File</label>
                <input name="file" id="fileToUpload" type="file" /><br>
                Input đầu<input name="txtDau" type="text" /><br>
                Input cuối<input name="txtCuoi" type="text" /><br>
                <p><input type="submit" value="Upload"></p>  
            </form:form>
                <table border="1">
                    <tr>
                        <th>
                            Các đỉnh đã duyệt
                        </th>
                        <th>
                            Các đỉnh trong hàng đợi
                        </th>
                        <th>
                            Các đỉnh còn lại
                        </th>
                    </tr>
                <c:forEach var="listValue" items="${list}">
                    <tr>
                        <td>
                            ${listValue.daduyet}
                        </td>
                        <td>
                            ${listValue.hangdoi}
                        </td>
                        <td>
                            ${listValue.dinhconlai}
                        </td>
                    </tr>
                </c:forEach>
            </table>
            
    </body>
</html>
