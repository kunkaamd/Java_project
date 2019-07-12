/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var myapp = angular.module("myapp",[]);
myapp.controller("mycontroller",function ($scope){
    $scope.ten = "loc"; 
    $scope.ho = "le";
    $scope.tenlot = "thai";
    $scope.changename = function(){
        $scope.ten = "loc dep trai thi vkl";
    };
});
