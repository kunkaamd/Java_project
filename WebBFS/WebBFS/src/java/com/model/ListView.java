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
public class ListView {
    private String daduyet;
    private String hangdoi;
    private String dinhconlai;

    public ListView() {
    }

    public ListView(String daduyet, String hangdoi, String dinhconlai) {
        this.daduyet = daduyet;
        this.hangdoi = hangdoi;
        this.dinhconlai = dinhconlai;
    }

    public String getDaduyet() {
        return daduyet;
    }

    public void setDaduyet(String daduyet) {
        this.daduyet = daduyet;
    }

    public String getHangdoi() {
        return hangdoi;
    }

    public void setHangdoi(String hangdoi) {
        this.hangdoi = hangdoi;
    }

    public String getDinhconlai() {
        return dinhconlai;
    }

    public void setDinhconlai(String dinhconlai) {
        this.dinhconlai = dinhconlai;
    }
    
}
