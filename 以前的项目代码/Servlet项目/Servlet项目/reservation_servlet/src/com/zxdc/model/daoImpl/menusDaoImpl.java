package com.zxdc.model.daoImpl;

import com.zxdc.model.daoInf.menusDaoInf;
import com.zxdc.model.entity.Menus;
import com.zxdc.model.entity.RestMenus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/8.
 */
public class menusDaoImpl implements menusDaoInf {

    @Override
    public List<Menus> queryMenusById(int retId) {
        List<Menus> list = new ArrayList<>();

        Connection connection = BaseDao.getConnection();
        String ssql = "SELECT * FROM `menus` WHERE menus.ret_Id=?";
        PreparedStatement statement=null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(ssql);
            statement.setInt(1,retId);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                Menus menus = new Menus();
                int id = resultSet.getInt("menusId");
                String menusName = resultSet.getString("menusName");
                double menusPrice = resultSet.getDouble("menusPrice");
                int ret_id = resultSet.getInt("ret_Id");
                menus.setMenusid(id);
                menus.setMenusname(menusName);
                menus.setMenusprice(menusPrice);
                menus.setRetId(ret_id);
                list.add(menus);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }
        return list;

    }

    @Override
    public boolean delMenusByRetIdDao(int retId) {
        String sql = "DELETE FROM menus WHERE menus.ret_Id=?";
        Object[] objects={retId};
        boolean b = BaseDao.excuteAddDelUp(sql, objects);
        return b;
    }

    @Override
    public boolean addMenusDao(Menus menus) {
        String sql = "INSERT INTO menus (menus.menusName,menus.menusPrice,menus.ret_Id) VALUES(?,?,?)";
        Object[] objects={menus.getMenusname(),menus.getMenusprice(),menus.getRetId()};
        boolean b = BaseDao.excuteAddDelUp(sql, objects);
        return b;
    }

    @Override
    public  RestMenus queryRsetMenusByIdDao(int parseInt) {
        RestMenus menus=null;

        Connection connection = BaseDao.getConnection();
        String ssql = "SELECT * FROM menus LEFT JOIN resturants ON menus.ret_Id=resturants.ret_Id WHERE resturants.ret_Id=?";
        PreparedStatement statement=null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(ssql);
            statement.setInt(1,parseInt);
            resultSet = statement.executeQuery();
            while (resultSet.next()){

                int id = resultSet.getInt("menusId");
                String menusName = resultSet.getString("menusName");
                double menusPrice = resultSet.getDouble("menusPrice");
                int ret_id = resultSet.getInt("ret_Id");
                String retName = resultSet.getString("ret_Name");
                String ret_adress = resultSet.getString("ret_Address");
                String ret_pic = resultSet.getString("ret_Pic");
                 menus = new RestMenus(ret_id,retName,ret_pic,ret_adress,id,menusName,menusPrice);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }
        return menus;
    }

    @Override
    public List<Menus> getMenusAll() {
        List<Menus> list = new ArrayList<>();

        Connection connection = BaseDao.getConnection();
        String ssql = "SELECT * FROM `menus`";
        PreparedStatement statement=null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(ssql);

            resultSet = statement.executeQuery();
            while (resultSet.next()){
                Menus menus = new Menus();
                int id = resultSet.getInt("menusId");
                String menusName = resultSet.getString("menusName");
                double menusPrice = resultSet.getDouble("menusPrice");
                int ret_id = resultSet.getInt("ret_Id");
                menus.setMenusid(id);
                menus.setMenusname(menusName);
                menus.setMenusprice(menusPrice);
                menus.setRetId(ret_id);
                list.add(menus);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }
        return list;
    }
}
