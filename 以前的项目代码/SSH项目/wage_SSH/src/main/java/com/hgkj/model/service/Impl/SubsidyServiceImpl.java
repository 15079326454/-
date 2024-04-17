package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.SubsidyDao;
import com.hgkj.model.entity.Subsidy;
import com.hgkj.model.service.SubsidyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubsidyServiceImpl implements SubsidyService {
    @Autowired
    private SubsidyDao subsidyDao;

    public SubsidyDao getSubsidyDao() {
        return subsidyDao;
    }

    @Override
    public List<Subsidy> allSubService(Subsidy subsidy) {
        return subsidyDao.allSubDao(subsidy);
    }

    @Override
    public boolean addSubService(Subsidy subsidy) {
        return subsidyDao.addSubDao(subsidy);
    }

    @Override
    public boolean delSubService(int subsidyId) {
        return subsidyDao.delSubDao(subsidyId);
    }

    @Override
    public boolean updSubService(Subsidy subsidy) {
        return subsidyDao.updSubDao(subsidy);
    }

    @Override
    public Subsidy subByIdService(int subsidyId) {
        return subsidyDao.subByIdDao(subsidyId);
    }
}
