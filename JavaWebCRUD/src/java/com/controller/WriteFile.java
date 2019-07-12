/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Table;
import com.generator.Generation;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LOC
 */
public class WriteFile extends ActionSupport {
    private String nameProject;
    private String dbUrl;
    private String dbUser;
    private String dbPass;
    private String dbDriver;

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }
    
    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        List<Table> table = (List<Table>) session.get("table");
        Generation generatorService = new Generation(table,nameProject,dbDriver, dbUrl, dbUser, dbPass);
        generatorService.run();
        return "success";
    }
    
}
