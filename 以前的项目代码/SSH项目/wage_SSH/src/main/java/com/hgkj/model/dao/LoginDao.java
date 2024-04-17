package com.hgkj.model.dao;

import com.hgkj.model.entity.Roles;
import com.hgkj.model.entity.Staffinfo;

import java.util.List;

public interface LoginDao {
    public Staffinfo LoginDao(Staffinfo staffinfo);
    public boolean updateDao(Staffinfo staffinfo);



}
