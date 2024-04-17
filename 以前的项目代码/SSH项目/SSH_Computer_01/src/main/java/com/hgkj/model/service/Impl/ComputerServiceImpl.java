package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.ComputerDao;
import com.hgkj.model.entity.Computer;
import com.hgkj.model.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComputerServiceImpl implements ComputerService {
    @Autowired
    private ComputerDao computerDao;

    public void setComputerDao(ComputerDao computerDao) {
        this.computerDao = computerDao;
    }

    public ComputerDao getComputerDao() {
        return computerDao;
    }

    @Override
    public List<Computer> allComputerService() {
        return computerDao.allComputerDao();
    }

    @Override
    public boolean insertComputerService(Computer computer) {
        return computerDao.insertComputerDao(computer);
    }
/*
    @Override
    public boolean deleteComputerDao(Computer computer) {
        return computerDao.deleteComputerDao(computer);
    }*/

    @Override
    public boolean deleteComputerService(int computerId) {
        return computerDao.deleteComputerDao(computerId);
    }

    @Override
    public boolean updateComputerService(Computer computer) { return computerDao.updateComputerDao(computer); }

    @Override
    public Computer computerByIdService(int computerId) {
        return computerDao.computerByIdDao(computerId);
    }
}
