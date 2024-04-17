package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.DepartmentDao;
import com.hgkj.model.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class DepartmentDaoImpl implements DepartmentDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public List<Department> allDeptDao(Department department) {
        Query query=getSession().createQuery("from Department ");
        return query.list();
    }

    @Override
    public boolean addDeptDao(Department department) {
        getSession().save(department);
        return false;
    }

    @Override
    public boolean delDeptDao(int depId) {
        Department department=new Department();
        department.setDepId(depId);
        getSession().delete(department);
        return false;
    }

    @Override
    public boolean updDeptDao(Department department) {
        getSession().update(department);
        return false;
    }

    @Override
    public Department deptByIdDao(int depId) {
        Department department=getSession().get(Department.class,depId);
        return department;
    }
}
