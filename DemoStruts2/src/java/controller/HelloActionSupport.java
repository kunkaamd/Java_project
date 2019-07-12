/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.*;
import java.util.*;

/**
 *
 * @author Tri Phan
 */
public class HelloActionSupport extends ActionSupport {

    private String a;
    private SanPham sp = new SanPham();
    private List<SanPham> dssp = new ArrayList<SanPham>();

    public List<SanPham> getDssp() {
        return dssp;
    }

    public void setDssp(List<SanPham> dssp) {
        this.dssp = dssp;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public HelloActionSupport() {
    }

    @Override
    public String execute() throws Exception {
        this.a = "Nguyen Van A";
        this.sp = new SanPham("sp01", "San pham 1", 1000);
        return "success";
    }

    public String hienthi() {
        this.dssp.add(new SanPham("sp01", "San pham 1", 1000));
        this.dssp.add(new SanPham("sp02", "San pham 2", 2000));
        this.dssp.add(new SanPham("sp03", "San pham 3", 3000));
        return "success";
    }

}
