package com.hgkj.model.service;

import com.hgkj.model.entity.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> allDeptService(Department department);
    public  boolean addDeptService(Department department);
    public  boolean delDeptService(int depId);
    public  boolean updDeptService(Department department);
    public  Department deptByIdService(int depId);
}
