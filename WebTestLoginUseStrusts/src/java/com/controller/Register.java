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
public class Register extends ActionSupport {
    private String username;
    private String password;
    private String name;

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String execute() throws Exception {
        
        return "Success";
    }
    public String register(){
        UserDAO userDAO = new UserDAO();
        users = userDAO.getAll();
        if(this.username.isEmpty()){
            return "fail";
        }
        else{
            userDAO.addUser(new User(this.username, this.password, this.name));
            return "success";
        }
    }
}
