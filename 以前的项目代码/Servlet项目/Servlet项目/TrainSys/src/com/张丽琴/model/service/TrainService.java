package com.张丽琴.model.service;

import com.张丽琴.model.entity.TrainInfo;

import java.util.List;

public interface TrainService {
    public List<TrainInfo> getAllTrainService();
    public boolean delTrainService(String[] trainId);
    public TrainInfo findTrainService(String no);
}
