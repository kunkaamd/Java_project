var app = angular.module('theloaiApp', ['ngSanitize']);
app.controller('theloaiController', function($scope, $http) {
	$http.get('theloaidata').success(function(data){
	$scope.theloai = data.theloai.data;
	});
});