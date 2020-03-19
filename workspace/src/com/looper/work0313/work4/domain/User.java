package com.looper.work0313.work4.domain;

public class User {
    private int uid;
    private String username;
    private String password;
    private String role = "common";

    @Override
    public String toString() {
        return  "用户ID:" + uid + ", 用户名:=" + username + ", 密码:" + password + ", 角色:=" + role;
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
        if ("admin".equals(role)||"common".equals(role)){
            this.role = role;
        }
    }

    public User(int uid, String username, String password, String role) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        setRole(role);
    }

    public User() {
    }
}