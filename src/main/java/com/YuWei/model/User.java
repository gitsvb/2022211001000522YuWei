package com.YuWei.model;

import java.util.Date;

public class User {
    private String username;
    private String password;
    private String email;
    private String gender;
    public  User(){

    }
    public User(String username, String password, String email, String gender, String brithdate) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.brithdate = brithdate;
    }

    private String brithdate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBrithdate() {
        return brithdate;
    }

    public void setBrithdate(String brithdate) {
        this.brithdate = brithdate;
    }

}
