package com.hgkj.model.service;

import com.hgkj.model.entity.SubsidyLog;

import java.util.List;

public interface SubsidyLogService {
    public List<SubsidyLog> allSubLogService(SubsidyLog subsidyLog);
    public boolean addSubLogService(SubsidyLog subsidyLog);
    public boolean delSubLogService(int sublogId);
    public  boolean updSubLogService(SubsidyLog subsidyLog);
    public SubsidyLog subLogByIdService(int sublogId);
    public List<SubsidyLog> subLogLikeService(SubsidyLog subsidyLog);

}
