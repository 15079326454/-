package com.hgkj.controller.action;

import com.hgkj.model.entity.Employee;
import com.hgkj.model.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 员工管理的Action
 *
 */
@Controller
@Namespace("/")
@ParentPackage ("struts-default")
class EmployeeAction {

    private Employee employee;
    @Autowired
    private EmployeeService employeeService;

    /**
     * 登录执行方法
     */
    public String Login(){
        System.out.println ("login方法执行了……" );
        return null;
    }


}
