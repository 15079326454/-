package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.EmployeeDao;
import com.hgkj.model.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;								 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Employee LoginDao(Employee employee) {
        String  hql="from employee where username=? and password=?" ;
        employee= (Employee) getSession().createQuery (hql).setParameter (0,employee.getUsername ()).setParameter (1,employee.getPassword ()).uniqueResult ();
        return employee;
    }


}
