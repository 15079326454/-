package com.hgkj.model.service;

import com.hgkj.model.entity.Staffinfo;

import java.util.List;

public interface StaffinfoService {
    public List<Staffinfo> allStaffService(Staffinfo staffinfo);
    public boolean addStaffService(Staffinfo staffinfo);
    public boolean deletStaffService(int staffId);
    public boolean updateStaffService(Staffinfo staffinfo);
    public Staffinfo staffByIdService(int staffId);
}
