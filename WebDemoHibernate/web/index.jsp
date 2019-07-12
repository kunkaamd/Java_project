<%-- 
    Document   : index
    Created on : Oct 22, 2015, 11:09:07 PM
    Author     : LOC
--%>

<%@page import="com.model.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="POST" action="LoginServlet">
            NEW USERNAME <input style="margin-left: 15px " type="text" name="txtUser" value="" placeholder="User"/><br>
            NEW PASSWORD <input style="margin-left: 17px " type="password" name="txtPass" value="" placeholder="******"/>
            <br>
            NEW IDMEMBER <input style="margin-left: 16px " type="text" name="txtId" value="" placeholder="ID MEMBER"/>
            <br>
            <input type="submit" value="Register" name="btnRegister" />
        </form>
            <div class="fb-comments" data-href="http://localhost:8080/WebHiDemo/" data-width="100%" data-numposts="5"></div>
            <div id="fb-root"></div>
            <script>(function(d, s, id) {
              var js, fjs = d.getElementsByTagName(s)[0];
              if (d.getElementById(id)) return;
              js = d.createElement(s); js.id = id;
              js.src = "//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.5";
              fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));</script>
    </body>
</html>
