package com.zxdc.model.daoImpl;

import com.zxdc.model.daoInf.RootDaoInf;
import com.zxdc.model.entity.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public class RootDaoImpl implements RootDaoInf {
    /**
     * 管理员登陆
     * @param admin
     * @return
     */
    @Override
    public Admin AdminLogin(Admin admin) {
        Connection connection = BaseDao.getConnection();
        String ssql = "select * from admin where `admin`.`adminName` = ? AND `admin`.`adminPwd`=?";
        PreparedStatement statement=null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(ssql);
            statement.setString(1,admin.getAdminname());
            statement.setString(2,admin.getAdminpwd());
            resultSet = statement.executeQuery();
            if(resultSet.next()){
                int id = resultSet.getInt("adminId");
                String password = resultSet.getString("adminPwd");
                String name = resultSet.getString("adminName");
                admin.setAdminid(id);
                admin.setAdminname(name);
                admin.setAdminpwd(password);

            }else {
                admin=null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }
        return admin;
    }
}
