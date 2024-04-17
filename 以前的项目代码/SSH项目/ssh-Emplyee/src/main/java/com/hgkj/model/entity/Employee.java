package com.hgkj.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Employee {
    private int eId;
    private String eName;
    private String sex;
    private Timestamp birthday;
    private Timestamp joinDate;
    private String eNo;
    private String username;
    private String password;
    private int did;
//多对一的关系
    private Deparment deparment;

    public Deparment getDeparment() {
        return deparment;
    }


    public void setDeparment(Deparment deparment) {
        this.deparment = deparment;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public Timestamp getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Timestamp joinDate) {
        this.joinDate = joinDate;
    }

    public String geteNo() {
        return eNo;
    }

    public void seteNo(String eNo) {
        this.eNo = eNo;
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

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }
}
