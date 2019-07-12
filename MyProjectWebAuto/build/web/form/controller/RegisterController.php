<?php

namespace App\Http\Controllers\autoWeb;

use Illuminate\Http\Request;

use App\Http\Requests;
use App\User;
use App\Http\Requests\autoWeb\RegisterRequest;
use App\Http\Controllers\Controller;
use Hash;
use Auth;
class RegisterController extends Controller
{
    protected function registeruser(RegisterRequest $req){
    	$user = new User;
    	$user->name = $req->name;
    	$user->email = $req->email;
    	$user->password = Hash::make($req->password);
    	$user->role_id = 2;
    	$user->remember_token = $req->_token;
    	$user->save();
    	Auth::login($user, true);
    	return redirect()->back();
    }
}
