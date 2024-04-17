package com.hgkj.model.dao;

import com.hgkj.model.entity.TrainInfo;

import java.util.List;

public interface TrainDao {
    public List<TrainInfo> getAllTrainDao();
    public boolean delTrainDao(String[] trainId);
    public TrainInfo findTrainDao(String no);
}
