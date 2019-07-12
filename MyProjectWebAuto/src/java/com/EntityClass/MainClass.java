/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EntityClass;

/**
 *
 * @author LOC
 */
public class MainClass {
    private String[] level1Name;
    private String[] level1Type;
    private String[] level2Name;
    private String[] level2Type;
    private String nameTable1;
    private String nameTable2;
    private String nameDatabase;
    public MainClass() {
    }

    public MainClass(String[] level1Name, String[] level1Type, String[] level2Name, String[] level2Type, String nameTable1, String nameTable2, String nameDatabase) {
        this.level1Name = level1Name;
        this.level1Type = level1Type;
        this.level2Name = level2Name;
        this.level2Type = level2Type;
        this.nameTable1 = nameTable1;
        this.nameTable2 = nameTable2;
        this.nameDatabase = nameDatabase;
    }

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
    
}
