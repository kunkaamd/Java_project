/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author LOC
 */
public class Database extends Config{
    
    public void themLoaiPT(int id,String tenLoaiPT){
        String insertSQL = "INSERT INTO LOAIPT(ID_LOAI_PT,TEN_LOAI_PT) VALUES(?,?)";
        try {
            openConnection();
            PreparedStatement preparedStatement = cnn.prepareStatement(insertSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, tenLoaiPT);
            preparedStatement.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoaLoaiPT(int ID){
        try {
            String deleteSQL = "DELETE FROM LOAIPT WHERE ID_LOAI_PT=?";
            openConnection();
            PreparedStatement preparedStatement = cnn.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, ID);
            preparedStatement.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList getAllLoaiPT(){
        ArrayList<String> arrayList = new ArrayList<>();
        String getALlSQL = "SELECT*FROM LOAIPT";
        try {
            openConnection();
            PreparedStatement preparedStatement = cnn.prepareStatement(getALlSQL);
            rs = preparedStatement.executeQuery();
            while(rs.next()){
                arrayList.add(rs.getInt("ID_LOAI_PT")+","+rs.getString("TEN_LOAI_PT"));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }
}