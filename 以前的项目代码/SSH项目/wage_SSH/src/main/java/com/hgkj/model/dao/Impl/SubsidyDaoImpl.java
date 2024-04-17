package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.SubsidyDao;
import com.hgkj.model.entity.Subsidy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class SubsidyDaoImpl implements SubsidyDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public List<Subsidy> allSubDao(Subsidy subsidy) {
        Query query=getSession().createQuery("from Subsidy ");
        return query.list();
    }

    @Override
    public boolean addSubDao(Subsidy subsidy) {
        getSession().save(subsidy);
        return false;
    }

    @Override
    public boolean delSubDao(int subsidyId) {
        Subsidy subsidy=new Subsidy();
        subsidy.setSubsidyId(subsidyId);
        getSession().delete(subsidy);
        return false;
    }

    @Override
    public boolean updSubDao(Subsidy subsidy) {
        getSession().update(subsidy);
        return false;
    }

    @Override
    public Subsidy subByIdDao(int subsidyId) {
        Subsidy subsidy=getSession().get(Subsidy.class,subsidyId);
        return subsidy;
    }
}
