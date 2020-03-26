package com.looper.work0326.work03.domain;

public class User {

    private int uid;
    private String username;
    private String password;
    private String role = "common";

    public User() {
    }

    public User(int uid, String username, String password, String role) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "用户编号:" + uid + "\t\t 用户名:'" + username + "\t\t 密码:'" + password + "\t\t 角色:'" + role;
    }
}
