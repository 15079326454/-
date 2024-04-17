package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.StaffinfoDao;
import com.hgkj.model.entity.Staffinfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class StaffinfoDaoImpl implements StaffinfoDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List <Staffinfo> allStaffDao(Staffinfo staffinfo) {
        Query query=getSession().createQuery("from Staffinfo ");
         return query.list();
    }

    @Override
    public boolean addStaffDao(Staffinfo staffinfo) {
        getSession().save(staffinfo);
        return false;
    }

    @Override
    public boolean deletStaffDao(int staffId) {
        Staffinfo staffinfo=new Staffinfo();
        staffinfo.setStaffId(staffId);
        getSession().delete(staffinfo);
        return false;
    }

    @Override
    public boolean updateStaffDao(Staffinfo staffinfo) {
        getSession().update(staffinfo);
        return false;
    }

    @Override
    public Staffinfo staffByIdDao(int staffId) {
        Staffinfo staffinfo=getSession().get(Staffinfo.class,staffId);
        return staffinfo;
    }
}
