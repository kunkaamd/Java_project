/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.DAO.UserDAO;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author LOC
 */
public class Login extends ActionSupport {
    
    public Login() {
    }
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String execute() throws Exception {
        UserDAO userDAO = new UserDAO();
        List<User> users= userDAO.getAll();
        for(User user : users){
            if(this.password.trim().equals(user.getUserPassword())&&this.username.trim().equals(user.getUserName())){
                return "welcome";
            }
        }
        return "fail";
    }
    
}
