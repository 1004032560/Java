package com.looper.domain;

import java.io.Serializable;

public class Admin implements Serializable {

    private static final long serialVersionUID = 3688953657499545226L;

    private int adminId;
    private String adminName;
    private String adminPassword;
    private String adminRole;

    public Admin() {
    }

    public Admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    public Admin(String adminName, String adminPassword, String adminRole) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminRole = adminRole;
    }

    public Admin(int adminId, String adminName, String adminPassword, String adminRole) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminRole = adminRole;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "  管理员ID" + adminId +
                ", 姓名:" + adminName +
                ", 密码:'" + adminPassword +
                ", 角色:'" + adminRole +
                " }";
    }
}
