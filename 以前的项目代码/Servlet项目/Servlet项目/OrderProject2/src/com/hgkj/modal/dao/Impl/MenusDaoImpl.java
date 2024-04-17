package com.hgkj.modal.dao.Impl;

import com.hgkj.modal.dao.MenusDao;
import com.hgkj.modal.entity.Admins;
import com.hgkj.modal.entity.Menus;
import com.hgkj.modal.entity.Resturants;
import com.hgkj.modal.entity.RetMenus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenusDaoImpl implements MenusDao {
    @Override
    public List <Menus> MenusByIdDao(int ret_Id) {
        List <Menus> menusList = new ArrayList <>();

        Connection connection = DBManager.getConnection();
        String sql = "SELECT * FROM menus WHERE menus.ret_Id=?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, ret_Id);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Menus menus = new Menus();
                int menusId = resultSet.getInt("menusId");
                String menusName = resultSet.getString("menusName");
                double menusPrice = resultSet.getDouble("menusPrice");
                String menusPhot = resultSet.getString("menusPhot");
                int ret_id = resultSet.getInt("ret_Id");
                menus.setMenusId(menusId);
                menus.setMenusName(menusName);
                menus.setMenusPrice(menusPrice);
                menus.setMenusPhot(menusPhot);
                menus.setRet_Id(ret_id);
                menusList.add(menus);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, statement, resultSet);
        }
        return menusList;
    }

    @Override
    public List <Menus> getMenusAllDao() {
        List <Menus> menusList = new ArrayList <>();

        Connection connection = DBManager.getConnection();
        String sql = "SELECT * FROM menus";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);

            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Menus menus = new Menus();
                int menusId = resultSet.getInt("menusId");
                String menusName = resultSet.getString("menusName");
                double menusPrice = resultSet.getDouble("menusPrice");
                int ret_id = resultSet.getInt("ret_Id");
                String menusPhot = resultSet.getString("menusPhot");
                menus.setMenusId(menusId);
                menus.setMenusName(menusName);
                menus.setMenusPrice(menusPrice);
                menus.setRet_Id(ret_id);
                menus.setMenusPhot(menusPhot);
                menusList.add(menus);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, statement, resultSet);
        }
        return menusList;
    }

    @Override
    public RetMenus RestMenusByIdDao(int parseInt) {
        RetMenus menus = null;

        Connection connection = DBManager.getConnection();
        String sql = "SELECT * FROM menus LEFT JOIN resturants ON menus.ret_Id=resturants.ret_Id WHERE menus.menusId=?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, parseInt);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {

                int id = resultSet.getInt("menusId");
                String menusName = resultSet.getString("menusName");
                double menusPrice = resultSet.getDouble("menusPrice");
                int ret_Id = resultSet.getInt("ret_Id");
                String retName = resultSet.getString("ret_Name");
                String ret_Address = resultSet.getString("ret_Address");
                String ret_Path = resultSet.getString("ret_Path");
                String menusPhot = resultSet.getString("menusPhot");
                menus = new RetMenus(ret_Id, retName, ret_Path, ret_Address, id, menusName, menusPrice, menusPhot);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, statement, resultSet);
        }
        return menus;

    }

    @Override
    public boolean addMenussDao(Menus menus) {
        String sql = "insert into menus(menusName,menusPrice,ret_Id)values(?,?,?)";
        Object[] objects = {menus.getMenusName(), menus.getMenusPrice(), menus.getRet_Id()};
        return DBManager.executeUpdate(sql, objects);
    }

    @Override
    public boolean updateMenusDao(Menus menus) {
        String sql = "update menus set menusName=? ,menusPrice=? ,ret_Id=? where menusId=?";
        Object[] objects = {menus.getMenusName(), menus.getMenusPrice(), menus.getRet_Id(),menus.getMenusId()};
        return DBManager.executeUpdate(sql, objects);
    }

    @Override
    public boolean delMenusByIdDao(int menusId) {
        String sql = "delete from menus where menusId=?";
        Object[] objects = {menusId};
        return DBManager.executeUpdate(sql, objects);
    }

    @Override
    public boolean delMenusAllByIdDao(int ret_Id) {
        String sql = "delete from menus where ret_Id=?";
        Object[] objects = {ret_Id};
        return DBManager.executeUpdate(sql, objects);
    }


    @Override
    public Menus getMenusByIdDao(int menudId) {
        Menus menus = new Menus();
        Connection connection = DBManager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "select * from menus where menusId=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, menudId);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                menus.setMenusId(resultSet.getInt("menusId"));
                menus.setMenusName(resultSet.getString("menusName"));
                menus.setMenusPrice(resultSet.getDouble("menusPrice"));
//                String menusPhot = resultSet.getString("menusPhot");
                menus.setRet_Id(resultSet.getInt("ret_Id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.closeAll(connection, preparedStatement, resultSet);
        }
        return menus;
    }

    @Override
    public Menus getByName(String menuName) {
        Connection connection = DBManager.getConnection();
        Menus menus = new Menus();
        String sql = "SELECT * FROM menus WHERE  menusName=? ";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1, menuName);


            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int menusId = resultSet.getInt("menusId");
             String menusName=resultSet.getString("menusName");
                double menusPrice = Double.parseDouble(resultSet.getString("menusPrice"));
                String menusPhot = resultSet.getString("menusPhot");
                int ret_Id = Integer.parseInt(resultSet.getString("ret_Id"));
                menus = new Menus(menusId, menusName, menusPrice,ret_Id,menusPhot);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return menus;
    }
}