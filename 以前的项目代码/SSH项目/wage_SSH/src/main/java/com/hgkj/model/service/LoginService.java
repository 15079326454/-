package com.hgkj.model.service;

import com.hgkj.model.entity.Roles;
import com.hgkj.model.entity.Staffinfo;

import java.util.List;

public interface LoginService {
    public Staffinfo LoginService(Staffinfo staffinfo);
    public boolean updateService(Staffinfo staffinfo);

}
