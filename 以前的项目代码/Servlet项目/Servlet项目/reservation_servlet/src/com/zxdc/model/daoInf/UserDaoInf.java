package com.zxdc.model.daoInf;

import com.zxdc.model.entity.User;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public interface UserDaoInf {
    User userLoginDao(User user);
    boolean userRegistDao(User user);
}
