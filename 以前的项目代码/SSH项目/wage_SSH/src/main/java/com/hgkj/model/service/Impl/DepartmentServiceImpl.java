package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.DepartmentDao;
import com.hgkj.model.entity.Department;
import com.hgkj.model.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    public DepartmentDao getDepartmentDao() {
        return departmentDao;
    }

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public List<Department> allDeptService(Department department) {
        return departmentDao.allDeptDao(department);
    }

    @Override
    public boolean addDeptService(Department department) {
        return departmentDao.addDeptDao(department);
    }

    @Override
    public boolean delDeptService(int depId) {
        return departmentDao.delDeptDao(depId);
    }

    @Override
    public boolean updDeptService(Department department) {
        return departmentDao.updDeptDao(department);
    }

    @Override
    public Department deptByIdService(int depId) {
        return departmentDao.deptByIdDao(depId);
    }
}
