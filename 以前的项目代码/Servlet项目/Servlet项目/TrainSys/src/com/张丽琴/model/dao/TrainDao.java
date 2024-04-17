package com.张丽琴.model.dao;

import com.张丽琴.model.entity.TrainInfo;

import java.util.List;

public interface TrainDao {
    public List<TrainInfo> getAllTrain();
    public boolean delTrainDao(String[] trainId);
    public TrainInfo findTrain(String no);

}
