package com.hgkj.modal.dao.Impl;

import com.hgkj.modal.dao.UsersDao;
import com.hgkj.modal.entity.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersDaoImpl  implements UsersDao {

    @Override
    public boolean usersLoginDao(Users users) {
        boolean flag = false;
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select count(*) from users where userEmail=? and userPwd=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, users.getUserFirstName());
            preparedStatement.setString(1, users.getUserEmail());
            preparedStatement.setString(2, users.getUserPwd());
//            preparedStatement.setString(3, users.getUserEmail());
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
        String sql="select count(*) from users where userEmail=? and userPwd=?";

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Users users = new Users();
                users.setUserID(resultSet.getInt("userID"));
               /* users.setUserFirstName(resultSet.getString("userFirstName"));*/
                users.setUserEmail(resultSet.getString("userEmail"));
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
        String sql="insert into users(userFirstName,userLastName,userEmail,userPwd) values(?,?,?,?)";
        Object[] objs={users.getUserFirstName(),users.getUserLastName(),users.getUserEmail(),users.getUserPwd()};
        return DBManager.executeUpdate(sql,objs);
    }
}
