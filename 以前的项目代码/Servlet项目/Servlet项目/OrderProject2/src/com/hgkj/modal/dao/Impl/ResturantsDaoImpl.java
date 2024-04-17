package com.hgkj.modal.dao.Impl;

import com.hgkj.modal.dao.ResturantsDao;
import com.hgkj.modal.entity.Resturants;
import com.hgkj.modal.entity.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResturantsDaoImpl implements ResturantsDao {
    @Override
    public List<Resturants> allresturantsDao() {
        List<Resturants> resturantsList = new ArrayList<>();
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql="select * from resturants ";

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Resturants resturants = new Resturants();
                resturants.setRet_Id(resultSet.getInt("ret_Id"));
               resturants.setRet_Name(resultSet.getString("ret_Name"));
                resturants.setRet_Address(resultSet.getString("ret_Address"));
              resturants.setRet_Path(resultSet.getString("ret_Path"));
                resturants.setRet_Introduce(resultSet.getString("ret_Introduce"));
                resturantsList.add(resturants);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, preparedStatement, resultSet);
        }
        return resturantsList;
    }

    @Override
    public boolean addResturants(Resturants resturants) {
        String sql="insert into resturants(ret_Name,ret_Address,ret_Path,ret_Introduce) values (?,?,?,?)";
        Object[] objects={resturants.getRet_Name(),resturants.getRet_Address(),resturants.getRet_Path(),resturants.getRet_Introduce()};
        return DBManager.executeUpdate(sql,objects);
    }

    @Override
    public boolean updateResturantsByIdDao(Resturants resturants) {
        String sql="update resturants set ret_Name=?,ret_Address=?,ret_Path=?,ret_Introduce=? where ret_Id=?";
        Object[] objects={resturants.getRet_Name(),resturants.getRet_Address(),resturants.getRet_Path(),resturants.getRet_Introduce(),resturants.getRet_Id()};
        return DBManager.executeUpdate(sql,objects);
    }

    @Override
    public boolean delResturantsByIdDao(int ret_Id) {
        String sql="delete from resturants where ret_Id=?";
        Object[] objects={ret_Id,};
        return DBManager.executeUpdate(sql,objects);
    }

    @Override
    public Resturants getRestByIdDao(int ret_Id) {
        Resturants resturants = new Resturants();
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from resturants where ret_Id=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ret_Id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                resturants.setRet_Id(resultSet.getInt("ret_Id"));
                resturants.setRet_Name(resultSet.getString("ret_Name"));
                resturants.setRet_Address(resultSet.getString("ret_Address"));
                resturants.setRet_Introduce(resultSet.getString("ret_Introduce"));
                resturants.setRet_Path(resultSet.getString("ret_Path"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, preparedStatement, resultSet);
        }
        return resturants;

    }


    ////根据id查找对应的商店
//    @Override
//    public Resturants getResturantsByIdDao(int retId) {
//        Resturants resturants = new Resturants();
//        Connection connection = DBManager.getConnection();
//        String sql = "select * from resturants where ret_Id=?";
//        PreparedStatement statement = null;
//        try {
//            statement = connection.prepareStatement(sql);
//            statement.setObject(1, retId);
//
//
//            ResultSet resultSet = statement.executeQuery();
//            if (resultSet.next()) {
//                int ret_Id = resultSet.getInt("ret_Id");
//                String ret_Name = resultSet.getString("ret_Name");
//                String ret_Address = resultSet.getString("ret_Address");
//                String ret_Path = resultSet.getString("ret_Path");
//                String  ret_Introduce=resultSet.getString("ret_Introduce");
//                resturants = new Resturants(ret_Id, ret_Name, ret_Address, ret_Path,ret_Introduce);
//
//            } else {
//                resturants = null;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return resturants;
//    }
//查询单个商家根据商店的名称和地址来查找
    @Override
    public Resturants getResturantByAdrName(String retName, String retAddress) {
        Connection connection = DBManager.getConnection();
        Resturants resturants = new Resturants();
        String sql = "SELECT * FROM resturants where ret_Name=? and ret_Address=?";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1, retName);
            statement.setObject(2, retAddress);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int ret_Id = resultSet.getInt("ret_Id");
                String ret_Name = resultSet.getString("ret_Name");
                String ret_Address = resultSet.getString("ret_Address");
                String ret_Path = resultSet.getString("ret_Path");
                String ret_Introduce=resultSet.getString("ret_Introduce");
                resturants = new Resturants(ret_Id, ret_Name, ret_Address,ret_Path,ret_Introduce);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resturants;
    }
}
