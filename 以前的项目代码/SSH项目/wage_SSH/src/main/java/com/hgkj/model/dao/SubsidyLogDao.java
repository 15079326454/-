package com.hgkj.model.dao;

import com.hgkj.model.entity.SubsidyLog;

import java.util.List;

public interface SubsidyLogDao {
    public List<SubsidyLog> subLogLikeDao(SubsidyLog subsidyLog);
    public List<SubsidyLog> allSubLogDao(SubsidyLog subsidyLog);
    public boolean addSubLogDao(SubsidyLog subsidyLog);
    public boolean delSubLogDao(int sublogId);
    public  boolean updSubLogDao(SubsidyLog subsidyLog);
    public SubsidyLog subLogByIdDao(int sublogId);


}
