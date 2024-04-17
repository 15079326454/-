package com.hgkj.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private int depId;
    private String depName;
/*员工信息表*/
    private Set<Staffinfo> staffinfo=new HashSet <>();

    public Set <Staffinfo> getStaffinfo() {
        return staffinfo;
    }

    public void setStaffinfo(Set <Staffinfo> staffinfo) {
        this.staffinfo = staffinfo;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (depId != that.depId) return false;
        if (depName != null ? !depName.equals(that.depName) : that.depName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = depId;
        result = 31 * result + (depName != null ? depName.hashCode() : 0);
        return result;
    }
}
