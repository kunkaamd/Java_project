<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="lib/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="lib/css/mycss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="container-fluid">
        <form action="write" method="post">
            <div class="container">
                <div id="Level1Div1" class="row">
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <h3>Tên Database</h3>
                        <input type='text' id='textbox1' class="form-control" name="nameDatabase" required>
                    </div>
            </div>
            <div id='BoxesGroupLevel1'>
                <h1>Cấp 1</h1>
                <div class="row">
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6"><input type='text' placeholder="Tên bảng cấp 1" id='textbox1' class="form-control" name="nameTable1" required></div>
                </div>
                <div class="row">
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <h3>Kiểu dữ liêu</h3>
                    </div>
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <h3>Tên Trường</h3>
                    </div>
                </div>
                <div id="Level1Div1" class="row">
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <select name="level1Type" class="form-control" readonly>
                            <option value="Text field">String</option>
                        </select>
                    </div>
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <input type='text' class="form-control" value="name" name="level1Name" readonly>
                    </div>
                </div>
            </div>
            <div id="localbuttonlv1">
                <input type='button' class='btn btn-success' value='Add Field' id='addButtonlv1'>
                <input type='button' class='btn btn-danger' value='Remove Field' id='removeButtonlv1'>
                <input type='button' class='btn btn-success' value='Add Level 2' id='addLevel2'>
                <input type='button' class='btn btn-danger' value='Remove Level 2' id='removeLevel2'>
            </div>
            <!---------LEVEL2--------->
            <div id="BoxesGroupLevel2">
            </div>
            <div id="localbuttonlv2">
                <input type='button' class='btn btn-success' value='Add Field' id='addButtonlv2'>
                <input type='button' class='btn btn-danger' value='Remove Field' id='removeButtonlv2'>
            </div>
            <input type="submit" class="btn btn-warning" style="margin-top: 20px;" value="Submit"/>
            </div>
            
        </form>
        
    </body>
    <script src="lib/js/jquery-1.12.2.min.js" type="text/javascript"></script>
    <script src="lib/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="lib/js/myjavascript.js" type="text/javascript"></script>
</html>
