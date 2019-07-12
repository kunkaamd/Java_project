/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Action.WriteFile;
import com.EntityClass.MainClass;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author LOC
 */
public class MainController extends ActionSupport {
    private String[] level1Name;
    private String[] level1Type;
    private String[] level2Name;
    private String[] level2Type;
    private String nameTable1;
    private String nameTable2;
    private String nameDatabase;

    public String[] getLevel1Name() {
        return level1Name;
    }

    public void setLevel1Name(String[] level1Name) {
        this.level1Name = level1Name;
    }

    public String[] getLevel1Type() {
        return level1Type;
    }

    public void setLevel1Type(String[] level1Type) {
        this.level1Type = level1Type;
    }

    public String[] getLevel2Name() {
        return level2Name;
    }

    public void setLevel2Name(String[] level2Name) {
        this.level2Name = level2Name;
    }

    public String[] getLevel2Type() {
        return level2Type;
    }

    public void setLevel2Type(String[] level2Type) {
        this.level2Type = level2Type;
    }

    public String getNameTable1() {
        return nameTable1;
    }

    public void setNameTable1(String nameTable1) {
        this.nameTable1 = nameTable1;
    }

    public String getNameTable2() {
        return nameTable2;
    }

    public void setNameTable2(String nameTable2) {
        this.nameTable2 = nameTable2;
    }

    public String getNameDatabase() {
        return nameDatabase;
    }

    public void setNameDatabase(String nameDatabase) {
        this.nameDatabase = nameDatabase;
    }
    
    public String execute() {
        MainClass mainClass = new MainClass(level1Name, level1Type, level2Name, level2Type, nameTable1, nameTable2, nameDatabase);
        WriteFile writeFile = new WriteFile(mainClass);
        writeFile.writeAllFile();
        return  "success";
    }
    
    
    
    
}
