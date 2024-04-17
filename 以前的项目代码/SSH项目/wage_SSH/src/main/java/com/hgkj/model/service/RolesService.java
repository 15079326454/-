package com.hgkj.model.service;

import com.hgkj.model.entity.Roles;

import java.util.List;

public interface RolesService {
    public List<Roles> allRolesService(Roles roles);
    public boolean addRolesService(Roles roles);
    public boolean deletRolesService(int rolesId);
    public boolean updateRolesService(Roles roles);
    public  Roles rolesByIdService(int rolesId);
}
