package com.hgkj.model.entity;

import java.util.HashSet;
import java.util.Set;

public class Roles {
    private int rolesId;
    private String rolesName;
private Set<Staffinfo> staffinfos=new HashSet <>();


    public Set <Staffinfo> getStaffinfos() {
        return staffinfos;
    }

    public void setStaffinfos(Set <Staffinfo> staffinfos) {
        this.staffinfos = staffinfos;
    }

    public int getRolesId() {
        return rolesId;
    }

    public void setRolesId(int rolesId) {
        this.rolesId = rolesId;
    }

    public String getRolesName() {
        return rolesName;
    }

    public void setRolesName(String rolesName) {
        this.rolesName = rolesName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Roles roles = (Roles) o;

        if (rolesId != roles.rolesId) return false;
        if (rolesName != null ? !rolesName.equals(roles.rolesName) : roles.rolesName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rolesId;
        result = 31 * result + (rolesName != null ? rolesName.hashCode() : 0);

        return result;
    }
}
