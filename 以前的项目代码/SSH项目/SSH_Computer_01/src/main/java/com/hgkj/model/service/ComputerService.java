package com.hgkj.model.service;

import com.hgkj.model.entity.Computer;

import java.util.List;

public interface ComputerService {
    public List<Computer> allComputerService();
    public boolean insertComputerService(Computer computer);
   // public boolean deleteComputerDao(Computer computer);
    public boolean deleteComputerService(int computerId);
    public boolean updateComputerService(Computer computer);
    public Computer computerByIdService(int computerId);
}
