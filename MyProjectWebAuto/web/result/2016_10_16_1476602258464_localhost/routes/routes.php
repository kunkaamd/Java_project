<?php
Route::get('theloai',['as' => 'theloai','uses' => 'autoWeb\theloaiController@view']);
Route::get('theloaidata',['as' => 'theloaidata','uses' => 'autoWeb\theloaiController@getdata']);
Route::get('sanpham',['as' => 'sanpham','uses' => 'autoWeb\sanphamController@view']);
Route::get('sanphamdetail',['as' => 'sanphamdetail','uses' => 'autoWeb\sanphamController@viewdetail']);
Route::get('sanphamdataid',['as' => 'sanphamdataid','uses' => 'autoWeb\sanphamController@getdataid']);
Route::get('sanphamdata',['as' => 'sanphamdata','uses' => 'autoWeb\sanphamController@getdata']);
Route::get('Search',['as' => 'search','uses' => 'autoWeb\SearchController@view']);
Route::get('Searchgetdata',['as' => 'Searchgetdata','uses' => 'autoWeb\SearchController@getdatasearch']);
Route::post('signin',['as' => 'signin','uses' => 'autoWeb\SigninController@signin']);
Route::get('signout',['as' => 'signout','uses' => 'autoWeb\SigninController@signout']);
Route::post('registeruser',['as' => 'registeruser','uses' => 'autoWeb\RegisterController@registeruser']);

Route::get('/home', function () {
    return view('autoWeb.index');
});
Route::get('/contact', function () {
    return view('autoWeb.contact');
});
Route::any('{all}', function($uri)
{
    return View::make('autoWeb.error');
})->where('all', '.*');