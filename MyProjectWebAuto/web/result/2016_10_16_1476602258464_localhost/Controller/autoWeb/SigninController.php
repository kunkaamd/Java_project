<?php

namespace App\Http\Controllers\autoWeb;

use Illuminate\Http\Request;
use App\Http\Controllers\Controller;
use App\Http\Requests;
use App\User;
use Auth;
class SigninController extends Controller
{
    protected function signin(Request $req){
        if (isset($req->remember)) {
            $remember=true;    
        } else {
            $remember=false;
        }
    	if (Auth::attempt(['email' => $req->email, 'password' => $req->password],$remember)) {
            return redirect()->back();
        }
        else{
            return redirect()->back();	
        }
    }
    protected function signout(Request $req){
    	Auth::logout();
    	return redirect()->back();
    }
}
