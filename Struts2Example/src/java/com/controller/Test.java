/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author LOC
 */
public class Test extends ActionSupport{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String execute()  {
        
        return "show";
    }
}
