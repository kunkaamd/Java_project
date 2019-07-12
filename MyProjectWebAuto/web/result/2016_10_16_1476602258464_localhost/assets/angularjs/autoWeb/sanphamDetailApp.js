var app = angular.module('sanphamDetailApp', ['ngSanitize']);
app.controller('sanphamDetailController', function($scope, $http) {
   $scope.param = getUrlParameter('id');
   $http.get('sanphamdataid?id='+$scope.param).success(function(data){
       $scope.sanpham = data.sanpham;
   });
});
function getUrlParameter(param, dummyPath) {
    var sPageURL = dummyPath || window.location.search.substring(1),
        sURLVariables = sPageURL.split(/[&||?]/),
        res;
    for (var i = 0; i < sURLVariables.length; i += 1) {
        var paramName = sURLVariables[i],
            sParameterName = (paramName || '').split('=');
        if (sParameterName[0] === param) {
            res = sParameterName[1];
        }
    }
    return res;
}