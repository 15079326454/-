package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.SubsidyLogDao;
import com.hgkj.model.entity.SubsidyLog;
import com.hgkj.model.service.SubsidyLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubsidyLogServiceImpl implements SubsidyLogService {
    @Autowired
    private SubsidyLogDao subsidyLogDao;

    public void setSubsidyLogDao(SubsidyLogDao subsidyLogDao) {
        this.subsidyLogDao = subsidyLogDao;
    }

    @Override
    public List<SubsidyLog> allSubLogService(SubsidyLog subsidyLog) {
        return subsidyLogDao.allSubLogDao(subsidyLog);
    }

    @Override
    public boolean addSubLogService(SubsidyLog subsidyLog) {
        return subsidyLogDao.addSubLogDao(subsidyLog);
    }

    @Override
    public boolean delSubLogService(int sublogId) {
        return subsidyLogDao.delSubLogDao(sublogId);
    }

    @Override
    public boolean updSubLogService(SubsidyLog subsidyLog) {
        return subsidyLogDao.updSubLogDao(subsidyLog);
    }

    @Override
    public SubsidyLog subLogByIdService(int sublogId) {
        return subsidyLogDao.subLogByIdDao(sublogId);
    }

    @Override
    public List <SubsidyLog> subLogLikeService(SubsidyLog subsidyLog) {
        return subsidyLogDao.subLogLikeDao(subsidyLog);
    }
}
