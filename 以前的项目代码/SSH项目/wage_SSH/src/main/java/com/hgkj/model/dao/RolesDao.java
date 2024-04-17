package com.hgkj.model.dao;

import com.hgkj.model.entity.Roles;

import java.util.List;

public interface RolesDao {
    public List<Roles> allRolesDao(Roles roles);
    public boolean addRolesDao(Roles roles);
    public boolean deletRolesDao(int rolesId);
    public boolean updateRolesDao(Roles roles);
    public  Roles rolesByIdDao(int rolesId);
}
