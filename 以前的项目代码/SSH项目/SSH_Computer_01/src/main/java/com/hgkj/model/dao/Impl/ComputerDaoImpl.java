package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.ComputerDao;
import com.hgkj.model.entity.Computer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ComputerDaoImpl implements ComputerDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List <Computer> allComputerDao() {
        Query query = getSession().createQuery("from Computer");
        return query.list();
    }

    @Override
    public boolean insertComputerDao(Computer computer) {
        boolean result=false;
        getSession().save(computer);
        return result;
    }

  /*  @Override
    public boolean deleteComputerDao(Computer computer) {

        getSession().delete(computer);
        return false;
    }*/

    @Override
    public boolean deleteComputerDao(int computerId) {
        Computer computer=new Computer();
        computer.setComputerId(computerId);
        getSession().delete(computer);
        return false;
    }

    @Override
    public boolean updateComputerDao(Computer computer) {
        boolean result=false;
        getSession().update(computer);
        return result;
    }

    @Override
    public Computer computerByIdDao(int computerId) {
        Computer computer=getSession().get(Computer.class,computerId);
      return computer;
    }
}
