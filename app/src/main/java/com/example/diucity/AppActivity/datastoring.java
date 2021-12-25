package com.example.diucity.AppActivity;

public class datastoring {

    String username;
    String email;
    String phonenum;
    String password;


    public datastoring(String email, String username, String phonenum, String password) {
        this.email = email;
        this.username = username;
        this.phonenum=phonenum;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
}
