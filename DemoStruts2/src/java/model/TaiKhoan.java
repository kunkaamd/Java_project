package model;

import com.opensymphony.xwork2.validator.annotations.*;

public class TaiKhoan {

    private String username;
    private String password;
    private String hoten;
    private String email;
    private String website;
    private double dtb;

    @DoubleRangeFieldValidator(minInclusive = "1", maxInclusive = "10", message = "DTB khong hop le")
    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    @UrlValidator(message = "Website khong hop le")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @RequiredStringValidator(message = "Email khong duoc rong")
    @EmailValidator(message = "Email khong hop le")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @RequiredStringValidator(message = "Username khong duoc rong")
    @StringLengthFieldValidator(minLength = "3", maxLength = "20", message = "Username co chieu dai nam trong khoang tu 3 den 20 ki tu")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @RequiredStringValidator(message = "Password khong duoc rong")
    @StringLengthFieldValidator(minLength = "3", maxLength = "20", message = "Password co chieu dai nam trong khoang tu 3 den 20 ki tu")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @RequiredStringValidator(message = "Ho ten khong duoc rong")
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

}
