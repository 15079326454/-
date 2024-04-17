package com.hgkj.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Staffinfo {
    private int staffId;
    private String staffPwd;
    private String staffName;
    private int staffState;
    private String staffSex;
    private String staffAddress;
    private String staffTel;
    private String staffEmail;

    /*补贴记录表*/
    private Set<SubsidyLog> subsidyLogSet=new HashSet <>();
    /*考勤记录表*/
private Set<AttendanceLog> attendanceLogSet=new HashSet <>();
/*获奖记录表*/
    private Set<RewardLog> rewardLogSet=new HashSet <>();
    /*工资记录表*/
private  Set<SalaryLog> salaryLogSet=new HashSet <>();
     /*等级表*/
    private Level level;
    /*角色表*/
    private  Roles roles;
    /*部门表*/
    private Department department;
    /*店铺表*/
    private Shop shop;

    public Set <SalaryLog> getSalaryLogSet() {
        return salaryLogSet;
    }

    public void setSalaryLogSet(Set <SalaryLog> salaryLogSet) {
        this.salaryLogSet = salaryLogSet;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Set <RewardLog> getRewardLogSet() {
        return rewardLogSet;
    }

    public void setRewardLogSet(Set <RewardLog> rewardLogSet) {
        this.rewardLogSet = rewardLogSet;
    }

    public Set <AttendanceLog> getAttendanceLogSet() {
        return attendanceLogSet;
    }

    public void setAttendanceLogSet(Set <AttendanceLog> attendanceLogSet) {
        this.attendanceLogSet = attendanceLogSet;
    }

    public Set <SubsidyLog> getSubsidyLogSet() {
        return subsidyLogSet;
    }

    public void setSubsidyLogSet(Set <SubsidyLog> subsidyLogSet) {
        this.subsidyLogSet = subsidyLogSet;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffPwd() {
        return staffPwd;
    }

    public void setStaffPwd(String staffPwd) {
        this.staffPwd = staffPwd;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getStaffState() {
        return staffState;
    }

    public void setStaffState(int staffState) {
        this.staffState = staffState;
    }



    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

}
