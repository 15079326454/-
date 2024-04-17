package com.hgkj.model.service;

import com.hgkj.model.entity.Subsidy;

import java.util.List;

public interface SubsidyService {
    public List<Subsidy> allSubService(Subsidy subsidy);
    public boolean addSubService(Subsidy subsidy);
    public  boolean delSubService(int subsidyId);
    public boolean updSubService(Subsidy subsidy);
    public Subsidy subByIdService(int subsidyId);

}
