package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.RolesDao;
import com.hgkj.model.entity.Roles;
import com.hgkj.model.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesDao rolesDao;

    public RolesDao getRolesDao() {
        return rolesDao;
    }

    public void setRolesDao(RolesDao rolesDao) {
        this.rolesDao = rolesDao;
    }

    @Override
    public List<Roles> allRolesService(Roles roles) {
        return rolesDao.allRolesDao(roles);
    }

    @Override
    public boolean addRolesService(Roles roles) {
        return rolesDao.addRolesDao(roles);
    }

    @Override
    public boolean deletRolesService(int rolesId) {
        return rolesDao.deletRolesDao(rolesId);
    }

    @Override
    public boolean updateRolesService(Roles roles) {
        return rolesDao.updateRolesDao(roles);
    }

    @Override
    public Roles rolesByIdService(int rolesId) {
        return rolesDao.rolesByIdDao(rolesId);
    }
}
