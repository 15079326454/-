package com.hgkj.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Deparment {
    private int dId;
    private String dName;
    private String dDesc;
    //员工集合
    private Set<Employee> employeeSet=new HashSet<Employee> ();

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdDesc() {
        return dDesc;
    }

    public void setdDesc(String dDesc) {
        this.dDesc = dDesc;
    }

}
