/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.*;
import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.validator.annotations.*;

/**
 *
 * @author Tri Phan
 */
public class DangKiActionSupport extends ActionSupport {

    private TaiKhoan tk = new TaiKhoan();

    @VisitorFieldValidator
    public TaiKhoan getTk() {
        return tk;
    }

    public void setTk(TaiKhoan tk) {
        this.tk = tk;
    }

    public DangKiActionSupport() {
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

}
