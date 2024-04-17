package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.EmployeeDao;
import com.hgkj.model.entity.Employee;
import com.hgkj.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
   @Autowired
   private EmployeeDao employeeDao;

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public Employee LoginService(Employee employee) {
        return employeeDao.LoginDao (employee);
    }


}
