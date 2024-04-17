package com.hgkj.model.Service;

import com.hgkj.model.entity.TrainInfo;

import java.util.List;

public interface TrainService {
    public List<TrainInfo> getAllTrainService();
    public boolean delTrainService(String[] trainId);
    public TrainInfo findTrainService(String no);
}
