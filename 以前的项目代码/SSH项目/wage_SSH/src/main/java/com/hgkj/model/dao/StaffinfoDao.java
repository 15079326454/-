package com.hgkj.model.dao;

import com.hgkj.model.entity.Staffinfo;

import java.util.List;

public interface StaffinfoDao {
    public List<Staffinfo> allStaffDao(Staffinfo staffinfo);
    public boolean addStaffDao(Staffinfo staffinfo);
    public boolean deletStaffDao(int staffId);
    public boolean updateStaffDao(Staffinfo staffinfo);
    public Staffinfo staffByIdDao(int staffId);
}
