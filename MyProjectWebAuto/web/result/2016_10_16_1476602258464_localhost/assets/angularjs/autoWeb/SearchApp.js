var app = angular.module('SearchApp', ['ngSanitize']);
app.controller('SearchController', function($scope, $http) {
    $scope.param = getUrlParameter('search');
    $http.get('Searchgetdata?search='+$scope.param).success(function(data){
    $scope.theloai = data.theloai;
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