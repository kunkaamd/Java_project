/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Action;

import com.EntityClass.MainClass;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import static org.apache.struts2.ServletActionContext.getServletContext;

/**
 *
 * @author LOC
 */
public class WriteFile {

    private String nameFolder;
    private MainClass mainClass;
    private String realPath;

    public WriteFile(MainClass mainClass) {
        this.mainClass = mainClass;
        realPath = getServletContext().getRealPath("/").replace("build\\", "");
    }

    public void writeAllFile() {
        /* write folder*/
        writeFolder(mainClass.getNameDatabase());
        /* write migration*/
        copyFileAssets();
        if (mainClass.getNameTable2()!=null) {
            writeFileMigration(mainClass.getNameTable1(), mainClass.getLevel1Name(), mainClass.getLevel1Type(), 1);
            writeFileMigration(mainClass.getNameTable2(), mainClass.getLevel2Name(), mainClass.getLevel2Type(), 2);
            writeFileAngular(mainClass.getNameTable1(),mainClass.getNameTable2());
            writeFileRoutes(mainClass.getNameTable1(), mainClass.getNameTable2(), 2);
            writeFileController(mainClass.getNameTable1(),mainClass.getNameTable2());
        }
        else{
            writeFileMigration(mainClass.getNameTable1(), mainClass.getLevel1Name(), mainClass.getLevel1Type(), 1);
            writeFileAngular(mainClass.getNameTable1());
            writeFileRoutes(mainClass.getNameTable1(), mainClass.getNameTable2(), 1);
            writeFileController(mainClass.getNameTable1());
        }
        writeFileAuth();
        writeFileView(mainClass);
        writeFileSearch(mainClass);
        addToZip(mainClass.getNameDatabase());
    }
/*-----ADD TO ZIP-----*/
    private void addToZip(String name){
        ZipUtils zipUtils = new ZipUtils();
        System.out.println(realPath);
        zipUtils.run(realPath+"result\\"+name+".zip", realPath+"result\\"+nameFolder);
    }
/*-----SEARCH-----*/
    private void writeFileViewSearch(MainClass mc){
        String nameTable1=mc.getNameTable1(),nameTable2=mc.getNameTable2();
        try {
            FileReader reader = new FileReader(realPath + "/form/view/search.blade.php");
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            String string = realPath + "/result/" + nameFolder + "/view/autoWeb/search.blade.php";
            FileWriter writer = new FileWriter(string, true);
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    if (line.equals("<!--content-->")) {
                        writer.write("<article class=\"search-result row\" ng-repeat=\"item in "+nameTable1+"\">\n" +
"                                        <div class=\"col-xs-12 col-sm-12 col-md-3\">\n" +
"                                            <a href=\"#\" title=\"Lorem ipsum\" class=\"thumbnail\">"+insertImage(mc.getLevel1Type(), mc.getLevel1Name(), nameTable1)+"</a>\n" +
"                                        </div>\n" +
"                                        <div class=\"col-xs-12 col-sm-12 col-md-2\">\n" +
"                                            <ul class=\"meta-search\">\n" +
"                                                <li><i class=\"fa fa-calendar\"></i> <span>02/15/2014</span></li>\n" +
"                                                <li><i class=\"fa fa-clock-o\"></i> <span>4:28 pm</span></li>\n" +
"                                                <li><i class=\"fa fa-tags\"></i> <span>People</span></li>\n" +
"                                            </ul>\n" +
"                                        </div>\n" +
"                                        <div class=\"col-xs-12 col-sm-12 col-md-7 excerpet\">\n" +
"                                            <h3><a href=\"#\" title=\"\">@{{item.name}}</a></h3>\n" +
"                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem, exercitationem, suscipit, distinctio, qui sapiente aspernatur molestiae non corporis magni sit sequi iusto debitis delectus doloremque.</p>						\n" +
"                                            <span class=\"plus\"><a href=\"#\" title=\"Lorem ipsum\"><i class=\"glyphicon glyphicon-plus\"></i></a></span>\n" +
"                                        </div>\n" +
"                                        <span class=\"clearfix borda\"></span>\n" +
"                                   </article>");
                        if (!nameTable1.equalsIgnoreCase(nameTable2)) {
                            writer.write("<article class=\"search-result row\" ng-repeat=\"item in "+nameTable1+"\">\n" +
                            "                                        <div class=\"col-xs-12 col-sm-12 col-md-3\">\n" +
                            "                                            <a href=\"#\" title=\"Lorem ipsum\" class=\"thumbnail\">"+insertImage(mc.getLevel2Type(), mc.getLevel2Name(), nameTable2)+"</a>\n" +
                            "                                        </div>\n" +
                            "                                        <div class=\"col-xs-12 col-sm-12 col-md-2\">\n" +
                            "                                            <ul class=\"meta-search\">\n" +
                            "                                                <li><i class=\"fa fa-calendar\"></i> <span>02/15/2014</span></li>\n" +
                            "                                                <li><i class=\"fa fa-clock-o\"></i> <span>4:28 pm</span></li>\n" +
                            "                                                <li><i class=\"fa fa-tags\"></i> <span>People</span></li>\n" +
                            "                                            </ul>\n" +
                            "                                        </div>\n" +
                            "                                        <div class=\"col-xs-12 col-sm-12 col-md-7 excerpet\">\n" +
                            "                                            <h3><a href=\"#\" title=\"\">@{{item.name}}</a></h3>\n" +
                            "                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem, exercitationem, suscipit, distinctio, qui sapiente aspernatur molestiae non corporis magni sit sequi iusto debitis delectus doloremque.</p>						\n" +
                            "                                <span class=\"plus\"><a href=\"#\" title=\"Lorem ipsum\"><i class=\"glyphicon glyphicon-plus\"></i></a></span>\n" +
                            "                                        </div>\n" +
                            "                                        <span class=\"clearfix borda\"></span>\n" +
                            "                                </article>");
                        }
                        writer.write("\r\n");
                    }
                    else {
                        writer.write(line);
                        writer.write("\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void writeFileAngularSearch(String nameTable1,String nameTable2){
        FileWriter writer = null;
        try {
            String string = realPath + "/result/" + nameFolder + "/assets/angularjs/autoWeb/SearchApp.js";
            writer = new FileWriter(string, true);
            writer.write("var app = angular.module('SearchApp', ['ngSanitize']);\n" +
                        "app.controller('SearchController', function($scope, $http) {\n" +
                        "    $scope.param = getUrlParameter('search');\n" +
                        "    $http.get('Searchgetdata?search='+$scope.param).success(function(data){\n");
            if (nameTable1.equalsIgnoreCase(nameTable2)) {
                writer.write("    $scope."+nameTable1+" = data."+nameTable1+";\n");
            }
            else{
                writer.write("    $scope."+nameTable1+" = data."+nameTable1+";\n" +
                            "    $scope."+nameTable2+" = data."+nameTable2+";\n");
            }
                        
            writer.write("  });\n" +
                        "});\n" +
                        "function getUrlParameter(param, dummyPath) {\n" +
                        "    var sPageURL = dummyPath || window.location.search.substring(1),\n" +
                        "        sURLVariables = sPageURL.split(/[&||?]/),\n" +
                        "        res;\n" +
                        "    for (var i = 0; i < sURLVariables.length; i += 1) {\n" +
                        "        var paramName = sURLVariables[i],\n" +
                        "            sParameterName = (paramName || '').split('=');\n" +
                        "        if (sParameterName[0] === param) {\n" +
                        "            res = sParameterName[1];\n" +
                        "        }\n" +
                        "    }\n" +
                        "    return res;\n" +
                        "}");
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void writeFileControllerSearch(String nameTable1,String nameTable2){
        FileWriter writer = null;
        try {
            String string = realPath + "/result/" + nameFolder + "/Controller/autoWeb/SearchController.php";
            writer = new FileWriter(string, true);
            writer.write("<?php\n" +
                        "namespace App\\Http\\Controllers\\autoWeb;\n" +
                        "use Illuminate\\Http\\Request;\n" +
                        "use App\\Http\\Requests;\n" +
                        "use App\\Http\\Controllers\\Controller;\n" +
                        "use Session;\n");
            if (nameTable1.equalsIgnoreCase(nameTable2)) {
                writer.write("use App\\"+nameTable1+";\n");
            }
            else{
                writer.write("use App\\"+nameTable1+";\n");
                writer.write("use App\\"+nameTable2+";\n");
            }
            writer.write("class SearchController extends Controller\n" +
                        "{\n" +
                        "    protected function getdatasearch(Request $req){\n" +
                        "    	$search = $req->query('search');\n");
            if (nameTable1.equalsIgnoreCase(nameTable2)) {
                writer.write("    	$"+nameTable1+" = "+nameTable1+"::where('name', 'like',\"%\".$search.\"%\")->get();\n" +
                            "    	return [\n" +
                            "    		'"+nameTable1+"' => $"+nameTable1+",\n" +
                            "    	];");
            }else{
                writer.write("    	$"+nameTable1+" = "+nameTable1+"::where('name', 'like',\"%\".$search.\"%\")->get();\n" +
                            "    	$"+nameTable2+" = "+nameTable2+"::where('name', 'like',\"%\".$search.\"%\")->get();\n" +
                            "    	return [\n" +
                            "    		'"+nameTable1+"' => $"+nameTable1+",\n" +
                            "    		'"+nameTable2+"' => $"+nameTable2+"\n" +
                            "    	];");
            }
            writer.write("    }\n" +
                        "    protected function view(){\n" +
                        "    	return view('autoWeb.search');\n" +
                        "    }\n" +
                        "}");
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void writeFileSearch(MainClass mc){
        writeFileControllerSearch(mc.getNameTable1(), mc.getNameTable2());
        writeFileAngularSearch(mc.getNameTable1(), mc.getNameTable2());
        writeFileViewSearch(mc);
    }
/*-----END SEARCH-----*/

/*-----VIEW-----*/
    private void writeFileViewDetail(String[] type,String[] name,String nameTable){
        try {
            FileReader reader = new FileReader(realPath + "/form/view/detail.blade.php");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            String string = realPath + "/result/" + nameFolder + "/view/autoWeb/detail.blade.php";
            FileWriter writer = new FileWriter(string, true);
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    if (line.equals("<!--html-->")) {
                        writer.write("<html lang=\"en\" class=\"no-js\" ng-app=\""+nameTable+"DetailApp\" ng-controller=\""+nameTable+"DetailController\">");
                        writer.write("\r\n");
                    }
                    else if(line.equals("<!--title-->")){
                        writer.write("\t<title>@{{"+nameTable+".name}}</title>");
                        writer.write("\r\n");
                    }
                    else if(line.equals("<!--angular-->")){
                        writer.write("\t<script src=\"{{ asset('resources/assets/angularjs/autoWeb/"+nameTable+"DetailApp.js') }}\"></script>");
                        writer.write("\r\n");
                    }
                    else if(line.equals("<!--content-->")){
                        writer.write("				<div class=\"flexslider\">\n" +
"									<ul class=\"slides\">\n" +
"										<li>\n" + insertImage(type, name, nameTable) +"\n"+
"										</li>\n" +
"										<li>\n" +
"											<img alt=\"\" src=\"http://placehold.it/450x250\" />\n" +
"										</li>\n" +
"										<li>\n" +
"											<img alt=\"\" src=\"http://placehold.it/450x250\" />\n" +
"										</li>\n" +
"									</ul>\n" +
"								</div>\n" +
"								<div class=\"single-project-content\">\n" +
"									<h1>"+nameTable+".name</h1>\n" +
"									"+fillContent(nameTable, name, type)+"\n" +
"								</div>");
                        writer.write("\r\n");
                    }
                    else {
                        writer.write(line);
                        writer.write("\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void writeFileViewLevel2(String[] type,String[] name,String nameTable){
        try {
            FileReader reader = new FileReader(realPath + "/form/view/level2.blade.php");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            String string = realPath + "/result/" + nameFolder + "/view/autoWeb/"+firstCharLowerCase(nameTable)+".blade.php";
            FileWriter writer = new FileWriter(string, true);
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    if (line.equals("<!--html-->")) {
                        writer.write("<html lang=\"en\" class=\"no-js\" ng-app=\""+nameTable+"App\" ng-controller=\""+nameTable+"Controller\">");
                        writer.write("\r\n");
                    }
                    else if(line.equals("<!--title-->")){
                        writer.write("\t<title>@{{"+nameTable+".name}}</title>");
                        writer.write("\r\n");
                    }
                    else if(line.equals("<!--angular-->")){
                        writer.write("\t<script src=\"{{ asset('resources/assets/angularjs/autoWeb/"+nameTable+"App.js') }}\"></script>");
                        writer.write("\r\n");
                    }
                    else if(line.equals("<!--content-->")){
                        writer.write("          						<div class=\"blog-post triggerAnimation animated\" data-animate=\"slideInUp\" ng-repeat=\"item in "+nameTable+"\">\n"+insertImage(type, name,"item") +"\n" +
"									<div class=\"post-content\">\n" +
"										<div class=\"post-date\">\n" +
"											<p><span>22</span>apr</p>\n" +
"										</div>\n" +
"										<div class=\"content-data\">\n" +
"											<h2><a href=\""+nameTable+"detail?id=@{{item.id}}\">@{{item.name}}</a></h2>\n" +
"											<p>By: <a href=\"#\">Admin</a> | <a href=\"#\">05 Comments</a></p>\n" +
"										</div>\n" +
"										<p>@{{item.name}}</p>\n" +
"										<a class=\"button-third\" href=\""+nameTable+"detail?id=@{{item.id}}\">Read More</a>\n" +
"									</div>\n" +
"								</div>");
                        writer.write("\r\n");
                    }
                    else {
                        writer.write(line);
                        writer.write("\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void writeFileViewCategory(String[] type,String[] name,String nameTable1,String nameTable2){
        try {
            FileReader reader = new FileReader(realPath + "/form/view/level1.blade.php");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            String string = realPath + "/result/" + nameFolder + "/view/autoWeb/"+firstCharLowerCase(nameTable1)+".blade.php";
            FileWriter writer = new FileWriter(string, true);
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    if (line.equals("<!--html-->")) {
                        writer.write("<html lang=\"en\" class=\"no-js\" ng-app=\""+nameTable1+"App\" ng-controller=\""+nameTable1+"Controller\">");
                        writer.write("\r\n");
                    }
                    else if(line.equals("<!--title-->")){
                        writer.write("\t<title>"+nameTable1+"</title>");
                        writer.write("\r\n");
                    }
                    else if(line.equals("<!--angular-->")){
                        writer.write("\t<script src=\"{{ asset('resources/assets/angularjs/autoWeb/"+nameTable1+"App.js') }}\"></script>");
                        writer.write("\r\n");
                    }
                    else if(line.equals("<!--content-->")){
                        writer.write(
"						<div class=\"project-post web-design branding\" style=\"display: inline-block;\" ng-repeat=\"item in "+nameTable1+"\">\n" +
"							<div class=\"project-gal\">\n" +insertImage(type, name,"item")+
"								<div class=\"hover-box\">\n" +
"									<a class=\"zoom\" href=\"\"><i class=\"fa fa-search-plus\"></i></a>\n" +
"									<a class=\"link\" href=\""+nameTable2+"?id=@{{item.id}}\"><i class=\"fa fa-link\"></i></a>\n" +
"								</div>\n" +
"							</div>\n" +
"							<div class=\"project-content\">\n" +
"								<h2>@{{item.name}}</h2>\n" +
"								<p>@{{item.name}}</p>\n" +
"							</div>\n" +
"						</div>\n");
                        writer.write("\r\n");
                    }
                    else {
                        writer.write(line);
                        writer.write("\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void writeFileMasterpage(String nameTable){
        try {
            FileReader reader = new FileReader(realPath + "/form/view/masterpage/masterpage.blade.php");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            String string = realPath + "/result/" + nameFolder + "/view/autoWeb/masterpage/masterpage.blade.php";
            FileWriter writer = new FileWriter(string, true);
            writer.write("<?php $nametable=\""+nameTable+"\" ?>");
            writer.write("\r\n");
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.write("\r\n");
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*-----END VIEW-----*/
    
    private void writeFileController(String nameTable){
        FileWriter writer = null;
        try {
            String string = realPath + "/result/" + nameFolder + "/Controller/autoWeb/"+nameTable+"Controller.php";
            writer = new FileWriter(string, true);
            writer.write("<?php\n" +
                        "\n" +
                        "namespace App\\Http\\Controllers\\autoWeb;\n" +
                        "use Illuminate\\Http\\Request;\n" +
                        "use App\\Http\\Requests;\n" +
                        "use App\\Http\\Controllers\\Controller;\n" +
                        "use App\\"+nameTable+";\n" +
                        "use Session;\n" +
                        "class "+nameTable+"Controller extends Controller\n" +
                        "{\n" +
                        "    protected function view(){\n" +
                        "    	return view('autoWeb."+firstCharLowerCase(nameTable)+"');\n" +
                        "    }\n" +
                        "    protected function viewdetail(){\n" +
                        "    	return view('autoWeb.detail');\n" +
                        "    }\n" +
                        "    protected function getdata(){\n" +
                        "        $"+nameTable+" = "+nameTable+"::paginate(15);\n" +
                        "        return [\n" +
                        "            '"+nameTable+"' => $"+nameTable+"\n" +
                        "        ];\n" +
                        "    }\n" +
                        "protected function getdataid(Request $req){\n" +
                        "    	$id = $req->query('id');\n" +
                        "    	$"+nameTable+" = "+nameTable+"::find($id);\n" +
                        "    	return [\n" +
                        "    		'"+nameTable+"' => "+nameTable+"\n" +
                        "    	];\n" +
                        "    }\n"+
                        "}");
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void writeFileController(String nameTable1,String nameTable2) {
        FileWriter writer = null;
        try {
            String string = realPath + "/result/" + nameFolder + "/Controller/autoWeb/"+nameTable1+"Controller.php";
            writer = new FileWriter(string, true);
            writer.write("<?php\n" +
                        "\n" +
                        "namespace App\\Http\\Controllers\\autoWeb;\n" +
                        "use Illuminate\\Http\\Request;\n" +
                        "use App\\Http\\Requests;\n" +
                        "use App\\Http\\Controllers\\Controller;\n" +
                        "use App\\"+nameTable1+";\n" +
                        "use Session;\n" +
                        "class "+nameTable1+"Controller extends Controller\n" +
                        "{\n" +
                        "    protected function view(){\n" +
                        "    	return view('autoWeb."+firstCharLowerCase(nameTable1)+"');\n" +
                        "    }\n" +
                        "    protected function getdata(){\n" +
                        "        $"+nameTable1+" = "+nameTable1+"::paginate(15);\n" +
                        "        return [\n" +
                        "            '"+nameTable1+"' => $"+nameTable1+"\n" +
                        "        ];\n" +
                        "    }\n" +
                        "}");
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            String string = realPath + "/result/" + nameFolder + "/Controller/autoWeb/"+nameTable2+"Controller.php";
            writer = new FileWriter(string, true);
            writer.write("<?php\n" +
                        "\n" +
                        "namespace App\\Http\\Controllers\\autoWeb;\n" +
                        "use Illuminate\\Http\\Request;\n" +
                        "use App\\Http\\Requests;\n" +
                        "use App\\Http\\Controllers\\Controller;\n" +
                        "use App\\"+nameTable2+";\n" +
                        "use Session;\n" +
                        "class "+nameTable2+"Controller extends Controller\n" +
                        "{\n" +
                        "    protected function view(){\n" +
                        "    	return view('autoWeb."+firstCharLowerCase(nameTable2)+"');\n" +
                        "    }\n" +
                        "    protected function viewdetail(){\n" +
                        "    	return view('autoWeb.detail');\n" +
                        "    }\n" +
                        "    protected function getdata(Request $req){\n" +
                        "    	$id = $req->query('id');\n" +
                        "    	$"+nameTable2+" = "+nameTable2+"::where('"+firstCharLowerCase(nameTable1)+"_id', $id)->get();\n" +
                        "    	return [\n" +
                        "    		'"+nameTable2+"' => $"+nameTable2+"\n" +
                        "    	];\n" +
                        "    }\n" +
                        "    protected function getdataid(Request $req){\n" +
                        "    	$id = $req->query('id');\n" +
                        "    	$"+nameTable2+" = "+nameTable2+"::find($id);\n" +
                        "    	return [\n" +
                        "    		'"+nameTable2+"' => $"+nameTable2+"\n" +
                        "    	];\n" +
                        "    }\n"+
                        "}");
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void writeFileAuth(){
        try {
            FileReader reader = new FileReader(realPath + "/form/requests/RegisterRequest.php");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            String string = realPath + "/result/" + nameFolder + "/Requests/autoWeb/RegisterRequest.php";
            FileWriter writer = new FileWriter(string, true);
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.write("\r\n");
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader reader = new FileReader(realPath + "/form/controller/RegisterController.php");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            String string = realPath + "/result/" + nameFolder + "/Controller/autoWeb/RegisterController.php";
            FileWriter writer = new FileWriter(string, true);
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.write("\r\n");
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader reader = new FileReader(realPath + "/form/controller/SigninController.php");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            String string = realPath + "/result/" + nameFolder + "/Controller/autoWeb/SigninController.php";
            FileWriter writer = new FileWriter(string, true);
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.write("\r\n");
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFileAngular(String nameTable){
        FileWriter writer = null;
        try {
            String string = realPath + "/result/" + nameFolder + "/assets/angularjs/autoWeb/"+nameTable+"App.js";
            writer = new FileWriter(string, true);
            writer.write("var app = angular.module('"+nameTable+"App', ['ngSanitize']);\n" +
                        "app.controller('"+nameTable+"Controller', function($scope, $http) {\n" +
                        "	$http.get('"+nameTable+"data').success(function(data){\n" +
                        "	$scope."+nameTable+" = data."+nameTable+".data;\n" +
                        "	});\n" +
                        "});");
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            String string = realPath + "/result/" + nameFolder + "/assets/angularjs/autoWeb/"+nameTable+"DetailApp.js";
            writer = new FileWriter(string, true);
            writer.write("var app = angular.module('"+nameTable+"DetailApp', ['ngSanitize']);\n" +
                        "app.controller('"+nameTable+"DetailController', function($scope, $http) {\n" +
                        "   $scope.param = getUrlParameter('id');\n"+
                        "   $http.get('"+nameTable+"dataid?id='+$scope.param).success(function(data){\n" +
                        "       $scope."+nameTable+" = data."+nameTable+";\n" +
                        "   });\n" +
                        "});\n"+
                        "function getUrlParameter(param, dummyPath) {\n" +
                        "    var sPageURL = dummyPath || window.location.search.substring(1),\n" +
                        "        sURLVariables = sPageURL.split(/[&||?]/),\n" +
                        "        res;\n" +
                        "    for (var i = 0; i < sURLVariables.length; i += 1) {\n" +
                        "        var paramName = sURLVariables[i],\n" +
                        "            sParameterName = (paramName || '').split('=');\n" +
                        "        if (sParameterName[0] === param) {\n" +
                        "            res = sParameterName[1];\n" +
                        "        }\n" +
                        "    }\n" +
                        "    return res;\n" +
                        "}");
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void writeFileAngular(String nameTable1,String nameTable2){
        FileWriter writer = null;
        try {
            String string = realPath + "/result/" + nameFolder + "/assets/angularjs/autoWeb/"+nameTable1+"App.js";
            writer = new FileWriter(string, true);
            writer.write("var app = angular.module('"+nameTable1+"App', ['ngSanitize']);\n" +
                        "app.controller('"+nameTable1+"Controller', function($scope, $http) {\n" +
                        "	$http.get('"+nameTable1+"data').success(function(data){\n" +
                        "	$scope."+nameTable1+" = data."+nameTable1+".data;\n" +
                        "	});\n" +
                        "});");
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            String string = realPath + "/result/" + nameFolder + "/assets/angularjs/autoWeb/"+nameTable2+"DetailApp.js";
            writer = new FileWriter(string, true);
            writer.write("var app = angular.module('"+nameTable2+"DetailApp', ['ngSanitize']);\n" +
                        "app.controller('"+nameTable2+"DetailController', function($scope, $http) {\n" +
                        "   $scope.param = getUrlParameter('id');\n"+
                        "   $http.get('"+nameTable2+"dataid?id='+$scope.param).success(function(data){\n" +
                        "       $scope."+nameTable2+" = data."+nameTable2+";\n" +
                        "   });\n" +
                        "});\n"+
                        "function getUrlParameter(param, dummyPath) {\n" +
                        "    var sPageURL = dummyPath || window.location.search.substring(1),\n" +
                        "        sURLVariables = sPageURL.split(/[&||?]/),\n" +
                        "        res;\n" +
                        "    for (var i = 0; i < sURLVariables.length; i += 1) {\n" +
                        "        var paramName = sURLVariables[i],\n" +
                        "            sParameterName = (paramName || '').split('=');\n" +
                        "        if (sParameterName[0] === param) {\n" +
                        "            res = sParameterName[1];\n" +
                        "        }\n" +
                        "    }\n" +
                        "    return res;\n" +
                        "}");
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            String string = realPath + "/result/" + nameFolder + "/assets/angularjs/autoWeb/"+nameTable2+"App.js";
            writer = new FileWriter(string, true);
            writer.write("var app = angular.module('"+nameTable2+"App', ['ngSanitize']);\n" +
                        "app.controller('"+nameTable2+"Controller', function($scope, $http) {\n" +
                        "   $scope.param = getUrlParameter('id');\n"+
                        "   $http.get('"+nameTable2+"data?id='+$scope.param).success(function(data){\n" +
                        "	$scope."+nameTable2+" = data."+nameTable2+";\n" +
                        "   });\n"+
                        "});\n"+
                        "function getUrlParameter(param, dummyPath) {\n" +
                        "    var sPageURL = dummyPath || window.location.search.substring(1),\n" +
                        "        sURLVariables = sPageURL.split(/[&||?]/),\n" +
                        "        res;\n" +
                        "    for (var i = 0; i < sURLVariables.length; i += 1) {\n" +
                        "        var paramName = sURLVariables[i],\n" +
                        "            sParameterName = (paramName || '').split('=');\n" +
                        "        if (sParameterName[0] === param) {\n" +
                        "            res = sParameterName[1];\n" +
                        "        }\n" +
                        "    }\n" +
                        "    return res;\n" +
                        "}");
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void writeFileMigration(String nameTable, String[] name, String[] type, int lvl) {
        try {
            FileReader reader = new FileReader(realPath + "/form/migration/create_table.php");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            String string = realPath + "/result/" + nameFolder + "/migration/" + getDateTime() + "_000000_create_" + nameTable + ".php";
            FileWriter writer = new FileWriter(string, true);
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    if (line.contains("nametable")) {
                        if (line.trim().equals("class Createnametable extends Migration")) {
                            writer.write("class Create" + nameTable + " extends Migration");
                            writer.write("\r\n");
                        } else {
                            writer.write(line.replace("nametable", nameTable));
                            writer.write("\r\n");
                        }
                    } else if (line.trim().equals("// container")) {

                        for (int i = 0; i < name.length; i++) {
                            if (type[i].trim().equals("image")) {
                                writer.write("\t\t$table->string('"+name[i]+"');");
                                writer.write("\r\n");
                            }else if(type[i].trim().equals("decimal")){
                                writer.write("\t\t$table->decimal('"+name[i]+"',15,2);");
                                writer.write("\r\n");
                            }
                            else{
                                writer.write("\t\t$table->"+type[i]+"('"+name[i]+"');");
                                writer.write("\r\n");
                            }
                        }
                        if (lvl == 2) {
                            writer.write("\t\t$table->integer('" + mainClass.getNameTable1() + "_id')->references('id')->on('" + mainClass.getNameTable1() + "');");
                            writer.write("\r\n");
                        }
                    } else {
                        writer.write(line);
                        writer.write("\r\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

/*-----ROUTES-----*/
    private void writeFileRoutes(String nameTable1,String nameTable2,int lvl){
        FileWriter writer = null;
        try {
            String string = realPath + "/result/" + nameFolder + "/routes/"+"web.php";
            writer = new FileWriter(string, true);
            if (lvl==2) {
                writer.write("<?php\n" +
                        "Route::get('"+nameTable1+"',['as' => '"+nameTable1+"','uses' => 'autoWeb\\"+nameTable1+"Controller@view']);\n" +
                        "Route::get('"+nameTable1+"data',['as' => '"+nameTable1+"data','uses' => 'autoWeb\\"+nameTable1+"Controller@getdata']);\n"+
                        //view
                        "Route::get('"+nameTable2+"',['as' => '"+nameTable2+"','uses' => 'autoWeb\\"+nameTable2+"Controller@view']);\n" +
                        "Route::get('"+nameTable2+"detail',['as' => '"+nameTable2+"detail','uses' => 'autoWeb\\"+nameTable2+"Controller@viewdetail']);\n" +
                        //getdata
                        "Route::get('"+nameTable2+"dataid',['as' => '"+nameTable2+"dataid','uses' => 'autoWeb\\"+nameTable2+"Controller@getdataid']);\n"+
                        "Route::get('"+nameTable2+"data',['as' => '"+nameTable2+"data','uses' => 'autoWeb\\"+nameTable2+"Controller@getdata']);\n"+
                        
                        "Route::get('Search',['as' => 'search','uses' => 'autoWeb\\SearchController@view']);\n" +
                        "Route::get('Searchgetdata',['as' => 'Searchgetdata','uses' => 'autoWeb\\SearchController@getdatasearch']);\n"+
                        
                        "Route::post('signin',['as' => 'signin','uses' => 'autoWeb\\SigninController@signin']);\n" +
                        "Route::get('signout',['as' => 'signout','uses' => 'autoWeb\\SigninController@signout']);\n" +
                        "Route::post('registeruser',['as' => 'registeruser','uses' => 'autoWeb\\RegisterController@registeruser']);\n" +
                        "\n" +
                        "Route::get('/home', function () {\n" +
                        "    return view('autoWeb.index');\n" +
                        "});\n" +
                        "Route::get('/contact', function () {\n" +
                        "    return view('autoWeb.contact');\n" +
                        "});\n" +
                        "Route::any('{all}', function($uri)\n" +
                        "{\n" +
                        "    return View::make('autoWeb.error');\n" +
                        "})->where('all', '.*');");
            }
            else{
                writer.write("<?php\n" +
                        "Route::get('"+nameTable1+"',['as' => '"+nameTable1+"','uses' => 'autoWeb\\"+nameTable1+"Controller@view']);\n" +
                        "Route::get('"+nameTable1+"detail',['as' => '"+nameTable1+"detail','uses' => 'autoWeb\\"+nameTable1+"Controller@viewdetail']);\n" +
                        
                        "Route::get('"+nameTable1+"data',['as' => '"+nameTable1+"data','uses' => 'autoWeb\\"+nameTable1+"Controller@getdata']);\n" +
                        "Route::get('"+nameTable1+"dataid',['as' => '"+nameTable1+"dataid','uses' => 'autoWeb\\"+nameTable1+"Controller@getdataid']);\n" +
                        
                        "Route::get('Search',['as' => 'search','uses' => 'autoWeb\\SearchController@view']);\n" +
                        "Route::get('Searchgetdata',['as' => 'Searchgetdata','uses' => 'autoWeb\\SearchController@getdatasearch']);\n"+
                        
                        "Route::post('signin',['as' => 'signin','uses' => 'autoWeb\\SigninController@signin']);\n" +
                        "Route::get('signout',['as' => 'signout','uses' => 'autoWeb\\SigninController@signout']);\n" +
                        "Route::post('registeruser',['as' => 'registeruser','uses' => 'autoWeb\\RegisterController@registeruser']);\n" +
                        "\n" +
                        "Route::get('/home', function () {\n" +
                        "    return view('autoWeb.index');\n" +
                        "});\n" +
                        "Route::get('/contact', function () {\n" +
                        "    return view('autoWeb.contact');\n" +
                        "});\n" +
                        "Route::any('{all}', function($uri)\n" +
                        "{\n" +
                        "    return View::make('autoWeb.error');\n" +
                        "})->where('all', '.*');");
            }
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
/*-----END ROUTES-----*/
    
    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime()).toString();
    }

    private String getTimeMinutes() {
        Calendar cal = Calendar.getInstance();
        return Long.toString(cal.getTimeInMillis());
    }

    private void writeFolder(String name) {
        nameFolder =getDateTime() + "_" + getTimeMinutes() + "_" + name;
        new File(realPath+"result/"+nameFolder).mkdirs();
        new File(realPath+"result/"+nameFolder + "/migration").mkdirs();
        new File(realPath+"result/"+nameFolder + "/Controller/autoWeb").mkdirs();
        new File(realPath+"result/"+nameFolder + "/routes").mkdirs();
        new File(realPath+"result/"+nameFolder + "/Requests/autoWeb").mkdirs();
        new File(realPath+"result/"+nameFolder + "/model").mkdirs();
        new File(realPath+"result/"+nameFolder + "/view/autoWeb").mkdirs();
        new File(realPath+"result/"+nameFolder + "/assets").mkdirs();
    }

    private void copyFileAssets() {
        String locationsource = realPath + "/form/assets";
        String locationdest = realPath + "/result/" + nameFolder + "/assets";
        File source = new File(locationsource);
        File dest = new File(locationdest);
        try {
            FileUtils.copyDirectory(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String firstCharLowerCase(String str){
        return str.substring(0, 1).toLowerCase()+ str.substring(1);
    }
    private String insertImage(String[] type,String[] name,String nameTable){
        for (int i = 0; i < type.length; i++) {
            if (type[i].equals("image")) {
                return "								<img alt=\"\" src=\"public/uploads/@{{"+nameTable+"."+name[i]+"}}\">\n";
            }
        }
        return "";
    }
    private String fillContent(String nameTable,String[] name,String[] type){
        String s = "";
        for (int i = 1; i < type.length; i++) {
            if (type[i].equals("image")) {
                s = s+fillContentImage(nameTable, name[i]);
            }
            else{
                s = s+"@{{"+nameTable+"."+name[i]+"}}\n";
            }
        }
        return s;
    }
    private String fillContentImage(String nameTable,String nameImage){
        String temp = "@{{"+nameTable+"."+nameImage+"}}";
        return  "<img alt=\"\" src=\"public/uploads/"+temp+"\" />\n";
    }
    private void writeFileView(MainClass mainClass) {
        copyFile(realPath + "/form/viewCopy", realPath + "/result/" + nameFolder + "/view/autoWeb");
        if (mainClass.getNameTable2()!=null){
            //lvl2
            writeFileViewDetail(mainClass.getLevel2Type(), mainClass.getLevel2Name(), mainClass.getNameTable2());
            writeFileViewLevel2(mainClass.getLevel2Type(), mainClass.getLevel2Name(), mainClass.getNameTable2());
            writeFileViewCategory(mainClass.getLevel1Type(), mainClass.getLevel1Name(),mainClass.getNameTable1(),mainClass.getNameTable2());
            writeFileMasterpage(mainClass.getNameTable1());
        }
        else{
            writeFileViewDetail(mainClass.getLevel1Type(), mainClass.getLevel1Name(), mainClass.getNameTable1());
            writeFileViewLevel2(mainClass.getLevel1Type(), mainClass.getLevel1Name(), mainClass.getNameTable1());
            writeFileMasterpage(mainClass.getNameTable1());
        }
        
    }
    
    private void copyFile(String locationsource,String locationdest) {
        File source = new File(locationsource);
        File dest = new File(locationdest);
        try {
            FileUtils.copyDirectory(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
