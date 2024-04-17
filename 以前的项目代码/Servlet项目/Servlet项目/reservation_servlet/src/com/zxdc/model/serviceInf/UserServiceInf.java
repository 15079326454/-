package com.zxdc.model.serviceInf;

import com.zxdc.model.entity.User;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public interface UserServiceInf {
    User userLoginService(User user);
    boolean userRegistService(User user);
}
