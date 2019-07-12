/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function whitespace(){
    $('input').keypress(function( e ) {
    if(e.which === 32) 
        return false;
    });
}
$(document).ready(function(){
//          ------level1
    whitespace();
var counter = 2;
$("#addButtonlv1").click(function () {
    var newTextBoxDiv = $(document.createElement('div'))
         .attr("id", 'Level1Div' + counter).attr("class",'row');
    newTextBoxDiv.after().html('<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">\n\
    <select name="level1Type" class="form-control">\n\
        <option value="string">Text field</option>\n\
        <option value="text">Long field</option>\n\
        <option value="integer">Integer</option>\n\
        <option value="decimal">Money</option>\n\
        <option value="image">Image</option>\n\
        <option value="date">Date</option>\n\
    </select>\n\
    </div>\n\
    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">\n\
        <input type="text" class="form-control" name="level1Name" required>\n\
    </div>');
    newTextBoxDiv.appendTo("#BoxesGroupLevel1");
    counter++;
    whitespace();
 });
 $("#removeButtonlv1").click(function () {
    if(counter==2){
      alert("No more textbox to remove");
      return false;
    }   
    counter--;
    $("#Level1Div" + counter).remove();
});
//--------level2
$("#localbuttonlv2").hide();
var flatlv2=0;
$("#addLevel2").click(function (){
    if (flatlv2==0) {
        var htmllv2='\
            <h1>Cấp 2</h1>\n\
            <div class="row">\n\
                <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6"><input type="text" placeholder="Tên bảng cấp 2" id="textbox1" class="form-control" name="nameTable2" required></div>\n\
            </div>\n\
            <div class="row">\n\
                <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">\n\
                    <h3>Kiểu dữ liêu</h3>\n\
                </div>\n\
                <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">\n\
                    <h3>Tên Trường</h3>\n\
                </div>\n\
            </div>\n\
            <div id="Level2Div1" class="row">\n\
                <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">\n\
                    <select name="level2Type" class="form-control" readonly>\n\
                        <option value="Text field">String</option>\n\
                    </select>\n\
                </div>\n\
                <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">\n\
                    <input type="text" class="form-control" value="name" name="level2Name" readonly>\n\
                </div>\n\
            </div>';
        
        //------------------//
        $("#BoxesGroupLevel2").append(htmllv2);
        $("#localbuttonlv2").show();
        whitespace();
        flatlv2=1;
    }
    else {
        return false;
    }

});

$("#removeLevel2").click(function (){
    $("#localbuttonlv2").hide();
    $("#BoxesGroupLevel2").empty();
    flatlv2=0;
});
var counter2 = 2;
$("#addButtonlv2").click(function () {
    var txthtml= '<div id="Level2Div'+counter2+'" class="row">\n\
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">\n\
                        <select name="level2Type" class="form-control">\n\
                            <option value="string">Text field</option>\n\
                            <option value="text">Long field</option>\n\
                            <option value="integer">Integer</option>\n\
                            <option value="decimal">Money</option>\n\
                            <option value="image">Image</option>\n\
                            <option value="date">Date</option>\n\
                        </select>\n\
                    </div>\n\
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">\n\
                        <input type="text" class="form-control" name="level2Name" required>\n\
                    </div>\n\
                </div>';
    $("#BoxesGroupLevel2").append(txthtml);
    counter2++;
    whitespace();
 });
 $("#removeButtonlv2").click(function () {
    if(counter2==2){
      alert("No more textbox to remove");
      return false;
    }
    counter2--;
    $("#Level2Div" + counter2).remove();
});

});
