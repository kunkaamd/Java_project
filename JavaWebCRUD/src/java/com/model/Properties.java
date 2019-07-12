/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author LOC
 */
public class Properties {
    private String name;
    private String type;
    private boolean required;
    private boolean unique;

    public Properties() {
    }

    public Properties(String name, String type, boolean required, boolean unique) {
        this.name = name;
        this.type = type;
        this.required = required;
        this.unique = unique;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }
    
}
