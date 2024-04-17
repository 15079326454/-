package com.hgkj.model.service.impl;

import com.hgkj.model.dao.TrainDao;
import com.hgkj.model.dao.impl.TrainDaoImpl;
import com.hgkj.model.entity.TrainInfo;
import com.hgkj.model.service.TrainService;

import java.util.List;

public class TrainServiceImpl implements TrainService {
    private TrainDao trainDao=new TrainDaoImpl();
    @Override
    public List<TrainInfo> getAllTrainService() {
        return trainDao.getAllTrainDao();
    }

    @Override
    public boolean delTrainService(String[] trainId) {
        return trainDao.delTrainDao(trainId);
    }

    @Override
    public TrainInfo findTrainService(String no) {
        return trainDao.findTrainDao(no);
    }
}
