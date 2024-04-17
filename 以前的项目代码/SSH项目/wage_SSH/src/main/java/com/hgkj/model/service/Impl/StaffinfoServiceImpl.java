package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.StaffinfoDao;
import com.hgkj.model.entity.Staffinfo;
import com.hgkj.model.service.StaffinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffinfoServiceImpl implements StaffinfoService {
    @Autowired
    private StaffinfoDao staffinfoDao;

    public StaffinfoDao getStaffinfoDao() {
        return staffinfoDao;
    }

    public void setStaffinfoDao(StaffinfoDao staffinfoDao) {
        this.staffinfoDao = staffinfoDao;
    }

    @Override
    public List<Staffinfo> allStaffService(Staffinfo staffinfo) {
        return staffinfoDao.allStaffDao(staffinfo);
    }

    @Override
    public boolean addStaffService(Staffinfo staffinfo) {
        return staffinfoDao.addStaffDao(staffinfo);
    }

    @Override
    public boolean deletStaffService(int staffId) {
        return staffinfoDao.deletStaffDao(staffId);
    }

    @Override
    public boolean updateStaffService(Staffinfo staffinfo) {
        return staffinfoDao.updateStaffDao(staffinfo);
    }

    @Override
    public Staffinfo staffByIdService(int staffId) {
        return staffinfoDao.staffByIdDao(staffId);
    }
}
