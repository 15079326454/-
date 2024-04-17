package com.hgkj.model.dao;

import com.hgkj.model.entity.Subsidy;

import java.util.List;

public interface SubsidyDao {
    public List<Subsidy> allSubDao(Subsidy subsidy);
    public boolean addSubDao(Subsidy subsidy);
    public  boolean delSubDao(int subsidyId);
    public boolean updSubDao(Subsidy subsidy);
    public Subsidy subByIdDao(int subsidyId);

}
