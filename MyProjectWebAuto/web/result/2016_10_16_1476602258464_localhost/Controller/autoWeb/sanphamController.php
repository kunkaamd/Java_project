<?php

namespace App\Http\Controllers\autoWeb;
use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller;
use App\sanpham;
use Session;
class sanphamController extends Controller
{
    protected function view(){
    	return view('autoWeb.sanpham');
    }
    protected function viewdetail(){
    	return view('autoWeb.detail');
    }
    protected function getdata(Request $req){
    	$id = $req->query('id');
    	$sanpham = sanpham::where('theloai_id', $id)->get();
    	return [
    		'sanpham' => $sanpham
    	];
    }
    protected function getdataid(Request $req){
    	$id = $req->query('id');
    	$sanpham = sanpham::find($id);
    	return [
    		'sanpham' => $sanpham
    	];
    }
}