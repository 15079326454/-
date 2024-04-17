package com.zxdc.model.daoImpl;

import com.zxdc.model.daoInf.OrdersDaoInf;
import com.zxdc.model.entity.Order;
import com.zxdc.model.entity.Resturants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * user@Bright Rain .
 * 2019/5/9.
 */
public class OrdersDaoImpl implements OrdersDaoInf {


    @Override
    public boolean addListOrdersService(List<Order> list) {
        boolean execute=false;
        Connection connection = BaseDao.getConnection();
        String sql = "INSERT INTO `order` (`order`.orderNum,`order`.orderPrice,`order`.orderTime,`order`.orderAdress,`order`.userId) VALUES(?,?,?,?,?)";
        PreparedStatement statement = null;
        ResultSet resultSet=null;
        try {
            statement = connection.prepareStatement(sql);
            for (Order order : list) {
                statement.setObject(1,order.getOrdernum());
                statement.setObject(2,order.getOrderprice());
                statement.setObject(3,order.getOrdertime());
                statement.setObject(4,order.getOrderadress());
                statement.setObject(5,order.getUserid());
                execute = statement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }


        return execute;
    }

    @Override
    public List<Order> getAllOrdersDao() {
        PreparedStatement statement=null;
        ResultSet resultSet=null;

        List<Order> lists = new ArrayList<>();
        Connection connection = BaseDao.getConnection();
        String sql="SELECT * FROM `order` ";
        try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                int orderId = resultSet.getInt("orderId");
                int orderNum = resultSet.getInt("orderNum");
                double orderPrice = resultSet.getDouble("orderPrice");
                String orderTime = resultSet.getString("orderTime");
                String orderAdress = resultSet.getString("orderAdress");
                int userId = resultSet.getInt("userId");
                Order order = new Order(orderId,orderNum,orderPrice,orderTime,orderAdress,userId);
                lists.add(order);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }
        return lists;
    }
}
