/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import com.db.Database;
import java.util.ArrayList;

/**
 *
 * @author LOC
 */
public class LoaiPT {
    private int id;
    private String loaiPT;
    private Database db;
    public LoaiPT() {
        db = new Database();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoaiPT() {
        return loaiPT;
    }

    public void setLoaiPT(String loaiPT) {
        this.loaiPT = loaiPT;
    }
    public void addPT(){
        db.themLoaiPT(id, loaiPT);
    }
    public void deletePT(){
        db.xoaLoaiPT(id);
    }
    public ArrayList getAll(){
        return db.getAllLoaiPT();

    }
}
