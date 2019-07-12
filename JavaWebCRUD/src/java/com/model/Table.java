/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.List;

/**
 *
 * @author LOC
 */
public class Table {
    private String name;
    private List<Properties> properties;
    private String foreignKey;
    private String referencesTable;
    private String referencesKey;
    private String primarykey;
    public Table() {
    }

    public Table(String name, List<Properties> properties, String foreignKey, String referencesTable, String referencesKey, String primarykey) {
        this.name = name;
        this.properties = properties;
        this.foreignKey = foreignKey;
        this.referencesTable = referencesTable;
        this.referencesKey = referencesKey;
        this.primarykey = primarykey;
    }

    public String getPrimarykey() {
        return primarykey;
    }

    public void setPrimarykey(String primarykey) {
        this.primarykey = primarykey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Properties> getProperties() {
        return properties;
    }

    public void setProperties(List<Properties> properties) {
        this.properties = properties;
    }

    public String getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(String foreignKey) {
        this.foreignKey = foreignKey;
    }

    public String getReferencesTable() {
        return referencesTable;
    }

    public void setReferencesTable(String referencesTable) {
        this.referencesTable = referencesTable;
    }

    public String getReferencesKey() {
        return referencesKey;
    }

    public void setReferencesKey(String referencesKey) {
        this.referencesKey = referencesKey;
    }
    
    
}
