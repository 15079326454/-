package com.hgkj.model.dao;

import com.hgkj.model.entity.Department;

import java.util.List;

public interface DepartmentDao {
    public List<Department> allDeptDao(Department department);
    public  boolean addDeptDao(Department department);
    public  boolean delDeptDao(int depId);
    public  boolean updDeptDao(Department department);
    public  Department deptByIdDao(int depId);
}
