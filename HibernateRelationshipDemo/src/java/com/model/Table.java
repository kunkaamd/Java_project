package com.model;
// Generated Nov 13, 2016 2:24:56 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Table generated by hbm2java
 */
public class Table  implements java.io.Serializable {


     private Integer id;
     private Sqlfile sqlfile;
     private String name;
     private Set propertieses = new HashSet(0);

    public Table() {
    }

	
    public Table(Sqlfile sqlfile, String name) {
        this.sqlfile = sqlfile;
        this.name = name;
    }
    public Table(Sqlfile sqlfile, String name, Set propertieses) {
       this.sqlfile = sqlfile;
       this.name = name;
       this.propertieses = propertieses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Sqlfile getSqlfile() {
        return this.sqlfile;
    }
    
    public void setSqlfile(Sqlfile sqlfile) {
        this.sqlfile = sqlfile;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getPropertieses() {
        return this.propertieses;
    }
    
    public void setPropertieses(Set propertieses) {
        this.propertieses = propertieses;
    }




}

