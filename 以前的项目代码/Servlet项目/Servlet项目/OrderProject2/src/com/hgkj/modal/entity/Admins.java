package com.hgkj.modal.entity;

public class Admins {
    private  int adminId;
    private String adminName;
    private String adminPwd;

    public Admins() {}

    public Admins(String adminName, String adminPwd) {
        this.adminName = adminName;
        this.adminPwd = adminPwd;
    }


    public Admins(int adminId, String adminName, String adminPwd) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPwd = adminPwd;
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

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public String toString() {
        return "Admins{" + "adminName='" + adminName + '\'' + ", adminPwd='" + adminPwd + '\'' + '}';
    }
}
