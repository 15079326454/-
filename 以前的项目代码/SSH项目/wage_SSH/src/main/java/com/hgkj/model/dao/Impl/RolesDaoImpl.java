package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.RolesDao;
import com.hgkj.model.entity.Roles;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class RolesDaoImpl implements RolesDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Roles> allRolesDao(Roles roles) {
        Query query=getSession().createQuery("from Roles ");
        return query.list();
    }

    @Override
    public boolean addRolesDao(Roles roles) {
        getSession().save(roles);
        return false;
    }

    @Override
    public boolean deletRolesDao(int rolesId) {
        Roles roles=new Roles();
        roles.setRolesId(rolesId);
        getSession().delete(roles);
        return false;
    }

    @Override
    public boolean updateRolesDao(Roles roles) {
        getSession().update(roles);
        return false;
    }

    @Override
    public Roles rolesByIdDao(int rolesId) {
        Roles roles=getSession().get(Roles.class,rolesId);
        return roles;
    }
}
