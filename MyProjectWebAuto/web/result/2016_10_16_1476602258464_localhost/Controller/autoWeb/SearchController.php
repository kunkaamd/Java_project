<?php
namespace App\Http\Controllers\autoWeb;
use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller;
use Session;
use App\theloai;
use App\sanpham;
class SearchController extends Controller
{
    protected function getdatasearch(Request $req){
    	$search = $req->query('search');
        $results = 
    	$theloai = theloai::search($req->query('search'))->get();
    	$sanpham = sanpham::search($req->query('search'))->get();
    	return [
    		'theloai' => $theloai,
    		'sanpham' => $sanpham
    	];
    }
    protected function view(){
    	return view('autoWeb.search');
    }
}