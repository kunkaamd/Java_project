/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generator;

import com.model.Table;
import freemarker.template.TemplateException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import static org.apache.struts2.ServletActionContext.getServletContext;

/**
 *
 * @author LOC
 */
public class Generation {
    private List<Table> table;
    private String nameProject;
    private String nameFolder;
    private String localFolder;
    private String dbDriver;
    private String dbUrl;
    private String dbUser;
    private String dbPass;

    public Generation(List<Table> table, String nameProject, String dbDriver, String dbUrl, String dbUser, String dbPass) {
        this.table = table;
        this.nameProject = nameProject;
        this.nameFolder = getDateTime() + "_" + getTimeMinutes() + "_" + nameProject;
        this.localFolder = getServletContext().getRealPath("/GENERATED/"+nameFolder);
        this.dbDriver = dbDriver;
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
    }
    

    
    public void run() throws TemplateException{
        FolderService.setLocalFolder(localFolder);
        FolderService.createFolder();
        GenerationService.jsp(table);
        GenerationService.generateDAO(table, dbDriver, dbUrl, dbUser, dbPass);
    }
    
    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime());
    }

    private String getTimeMinutes() {
        Calendar cal = Calendar.getInstance();
        return Long.toString(cal.getTimeInMillis());
    }
}
