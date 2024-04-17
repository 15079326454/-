package com.张丽琴.model.service.Impl;

import com.张丽琴.model.dao.Impl.TrainDaoImpl;
import com.张丽琴.model.dao.TrainDao;
import com.张丽琴.model.entity.TrainInfo;
import com.张丽琴.model.service.TrainService;

import java.util.List;

public class TrainServiceImpl implements TrainService {
    TrainDao dao=new TrainDaoImpl();
    @Override
    public List<TrainInfo> getAllTrainService() {
        return dao.getAllTrain();
    }

    @Override
    public boolean delTrainService(String[] trainId) {
        return dao.delTrainDao(trainId);
    }


    @Override
    public TrainInfo findTrainService(String no) {
        return dao.findTrain(no);
    }
}
