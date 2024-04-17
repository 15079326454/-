package com.hgkj.model.dao;

import com.hgkj.model.entity.Computer;

import java.util.List;

public interface ComputerDao {
    public List<Computer> allComputerDao();
    public boolean insertComputerDao(Computer computer);
   // public boolean deleteComputerDao(Computer computer);
    public boolean deleteComputerDao(int computerId);
    public boolean updateComputerDao(Computer computer);
    public Computer computerByIdDao(int computerId);
}
