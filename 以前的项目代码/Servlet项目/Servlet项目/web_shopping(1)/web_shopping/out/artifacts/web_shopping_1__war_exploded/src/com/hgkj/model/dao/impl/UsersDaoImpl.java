package com.hgkj.model.dao.impl;

import com.hgkj.model.dao.UsersDao;
import com.hgkj.model.entity.Users;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class UsersDaoImpl implements UsersDao {
    @Override
    public boolean userLoginDao(Users users) {
        boolean flag = false;
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select count(*) from users where userName=? and userPwd=?";
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
}

