package com.hgkj.modal.dao.Impl;

import com.hgkj.modal.dao.OrdersDao;
import com.hgkj.modal.entity.Orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdersDaoImpl implements OrdersDao {
    @Override
    public boolean addListOrdersDao(List<Orders> list) {
        boolean execute=false;
        Connection connection = DBManager.getConnection();
        String sql = "INSERT INTO orders (orders.orderNum,orders.orderPrice,orders.orderTime,orders.orderAdress,orders.userID) VALUES(?,?,?,?,?)";
        PreparedStatement statement = null;
        ResultSet resultSet=null;
        try {
            statement = connection.prepareStatement(sql);
            for (Orders orders : list) {
                statement.setObject(1,orders.getOrderNum());
                statement.setObject(2,orders.getOrderPrice());
                statement.setObject(3,orders.getOrderTime());
                statement.setObject(4,orders.getOrderAddress());
                statement.setObject(5,orders.getUserID());
                execute = statement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBManager.closeAll(connection,statement,resultSet);
        }


        return execute;
    }

    @Override
    public List <Orders> getAllOrdersDao() {
        PreparedStatement statement=null;
        ResultSet resultSet=null;

        List<Orders> lists = new ArrayList<>();
        Connection connection = DBManager.getConnection();
        String sql="SELECT * FROM orders ";
        try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                int orderId = resultSet.getInt("orderId");
                int orderNum = resultSet.getInt("orderNum");
                double orderPrice = resultSet.getDouble("orderPrice");
                String orderTime = resultSet.getString("orderTime");
                String orderAdress = resultSet.getString("orderAdress");
                int userID = resultSet.getInt("userID");
                Orders order = new Orders(orderId,orderNum,orderPrice,orderTime,orderAdress,userID);
                lists.add(order);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBManager.closeAll(connection,statement,resultSet);
        }
        return lists;
    }
}
