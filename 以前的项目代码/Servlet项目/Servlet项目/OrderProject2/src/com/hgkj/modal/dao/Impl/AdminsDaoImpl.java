package com.hgkj.modal.dao.Impl;

import com.hgkj.modal.dao.AdminsDao;
import com.hgkj.modal.entity.Admins;
import com.hgkj.modal.entity.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminsDaoImpl implements AdminsDao {
    @Override
    public boolean AdminLogin(Admins admins) {
        boolean flag = false;
        Connection connection = DBManager.getConnection();
        String sql = "select * from admins where adminName= ? AND adminPwd=?";
        PreparedStatement statement=null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, users.getUserFirstName());
            statement.setString(1, admins.getAdminName());
            statement.setString(2, admins.getAdminPwd());
//            preparedStatement.setString(3, users.getUserEmail());
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                if (resultSet.getInt(1) > 0) {
                    flag = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, statement, resultSet);
        }
        return flag;
    }

    /* @Override
    public boolean adminLoginDao(Admins admin) {
          boolean flag = false;
          Connection connection = DBManager.getConnection();
          PreparedStatement preparedStatement = null;
          ResultSet resultSet = null;
          String sql = "select * from admins where adminName=? and adminPwd=?";
          try {
              preparedStatement = connection.prepareStatement(sql);
    //            preparedStatement.setString(1, users.getUserFirstName());
              preparedStatement.setString(1, admin.getAdminName());
              preparedStatement.setString(2, admin.getAdminPwd());
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
    */
    @Override
    public List<Admins> allAdminsDao() {
        List<Admins> adminsList = new ArrayList<>();
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql="select * from admins ";

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Admins admins=new Admins();
                admins.setAdminId(resultSet.getInt("adminId"));
                /* users.setUserFirstName(resultSet.getString("userFirstName"));*/
                admins.setAdminName(resultSet.getString("adminName"));
                admins.setAdminPwd(resultSet.getString("adminPwd"));
                adminsList.add(admins);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, preparedStatement, resultSet);
        }
        return adminsList;
}

    @Override
    public boolean addAdminDao(Admins admins) {
        String sql="insert into admins (adminName,adminPwd) values(?,?)";
        Object[] objects={admins.getAdminName(),admins.getAdminPwd()};
        return DBManager.executeUpdate(sql,objects);
    }

    @Override
    public boolean delAdminDao(int adminId) {
        String sql="delete from admins where adminId=?";
        Object [] objects={adminId};
        return DBManager.executeUpdate(sql,objects);
    }

    @Override
    public boolean updateAdminDao(Admins admins) {
        String sql="update admins set adminName=?,adminPwd=? where adminId=?";
        Object[] objects={admins.getAdminName(),admins.getAdminPwd(),admins.getAdminId()};
        return DBManager.executeUpdate(sql,objects);
}

    @Override
    public Admins getAdminByIdDao(int adminId) {
        Admins admins = new Admins();
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from admins where adminId=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, adminId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                admins.setAdminId(resultSet.getInt("adminId"));
                admins.setAdminName(resultSet.getString("adminName"));
                admins.setAdminPwd(resultSet.getString("adminPwd"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, preparedStatement, resultSet);
        }
        return admins;
}

    @Override
    public List <Admins> getAdminByIdDao2(int adminId) {
        List<Admins> adminsList = new ArrayList<>();
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql="select * from admins where adminId=? ";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,adminId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Admins admins=new Admins();
                admins.setAdminId(resultSet.getInt("adminId"));
                /* users.setUserFirstName(resultSet.getString("userFirstName"));*/
                admins.setAdminName(resultSet.getString("adminName"));
                admins.setAdminPwd(resultSet.getString("adminPwd"));
                adminsList.add(admins);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, preparedStatement, resultSet);
        }
        return adminsList;}
}