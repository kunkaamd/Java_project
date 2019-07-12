/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.ArrayList;

/**
 *
 * @author LOC
 */
public class Model {

    public Model() {
    }
    public boolean checkLogin(String user,String pass){
        if (user.toString().equals("kunkaamd")&&pass.toString().equals("cacaica12")) {
            return true;
        }else{
            return false;
        }
    }
    public boolean checkRegister(ArrayList<String> al,String user){
        for(String string : al){
            if(user.toString().equals("kunkaamd")) return false;
        }
        return true;
    }
    
}
