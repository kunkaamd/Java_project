<?php

namespace App\Http\Controllers\autoWeb;
use Illuminate\Http\Request;
use App\Http\Requests;
use App\Http\Controllers\Controller;
use App\theloai;
use Session;
class theloaiController extends Controller
{
    protected function view(){
    	return view('autoWeb.theloai');
    }
    protected function getdata(){
        $theloai = theloai::paginate(15);
        return [
            'theloai' => $theloai
        ];
    }
}