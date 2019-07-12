/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Tri Phan
 */
public class DangNhapActionSupport extends ActionSupport {

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

    public DangNhapActionSupport() {
    }

    public String execute() throws Exception {

        String page = "";
        if (this.username.equals("a") && this.password.equals("b")) {
            page = "welcome";
        } else {
            page = "fail";
        }
        return page;

    }

}
