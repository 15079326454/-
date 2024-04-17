package com.zxdc.model.daoImpl;

import com.zxdc.model.daoInf.UserDaoInf;
import com.zxdc.model.entity.Resturants;
import com.zxdc.model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public class UserDaoImpl implements UserDaoInf {

    /**
     * 用户登录
     * @param user
     * @return
     */
    @Override
    public User userLoginDao(User user) {
        Connection connection = BaseDao.getConnection();
        String ssql = "select * from user where `user`.`userFristName` = ? AND `user`.`userPwd`=?";
        PreparedStatement statement=null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(ssql);
            statement.setString(1,user.getUserfristname());
            statement.setString(2,user.getUserpwd());
            resultSet = statement.executeQuery();
            if(resultSet.next()){
                int id = resultSet.getInt("userID");
                String password = resultSet.getString("userPwd");
                String name = resultSet.getString("userFristName");
                user.setUserid(id);
                user.setUserfristname(name);
                user.setUserpwd(password);

            }else {
                user=null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }
        return user;
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @Override
    public boolean userRegistDao(User user) {
        Connection connection = BaseDao.getConnection();
       boolean flag = false;
        String sql = "INSERT INTO `user` (`user`.userFristName,`user`.userEmail,`user`.userPwd,`user`.userTel,`user`.userAddress) VALUES(?,?,?,?,?)";
        PreparedStatement statement = null;
        ResultSet resultSet=null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1,user.getUserfristname());
            statement.setObject(2,user.getUseremail());
            statement.setObject(3,user.getUserpwd());
            statement.setObject(4,user.getUsertel());
            statement.setObject(5,user.getUseraddress());
            flag = statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }
        return flag;
    }
}
