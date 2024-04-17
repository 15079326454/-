package com.hgkj.model.Dao.Impl;

import com.hgkj.model.Dao.UsersDao;

import com.hgkj.model.entity.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class UsersDaoImpl implements UsersDao {
    @Override
    public boolean userLoginDao(Users users) {
        boolean flag = false;
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from users where userName=? and userPwd=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, users.getUserName());
            preparedStatement.setString(2, users.getUserPwd());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                if (resultSet.getInt(1) > 0) {
                    flag = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, preparedStatement, resultSet);
        }
        return flag;
    }

    @Override
    public List<Users> allUsersDao() {
        List<Users> usersList = new ArrayList<>();
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql="select count(*) from users where userName=? and userPwd=?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Users users = new Users();
                users.setUserId(resultSet.getInt("userId"));
                users.setUserName(resultSet.getString("userName"));
                users.setUserPwd(resultSet.getString("userPwd"));
                usersList.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, preparedStatement, resultSet);
        }
        return usersList;
    }

    @Override
    public boolean insertUsersDao(Users users) {
             String sql="insert into users(userName,userPwd) values(?,?)";
             Object[] objs={users.getUserName(),users.getUserPwd()};
        return DBManager.executeUpdate(sql,objs);
    }
}

