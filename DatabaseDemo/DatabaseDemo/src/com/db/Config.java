/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LOC
 */
public class Config {
    protected final String DB_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    protected final String DB_URL = "jdbc:derby://localhost:1527/PhuongTienDB";
    protected final String DB_USER = "kunkaamd";
    protected final String DB_PASS = "cacaica12";
    protected Connection cnn = null;
    protected ResultSet rs = null;

    
    
    public Config() {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    protected Connection openConnection(){
        
        try {
            cnn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnn;
    }
    protected void closeConnection(){
        try {
            if(rs!=null){
                rs.close();
            }
            if(cnn!=null){
                cnn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
