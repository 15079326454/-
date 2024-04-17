package com.zxdc.model.daoImpl;

import java.sql.*;

/**
 * user@Bright Rain .
 * 2019/4/15.
 */
public class BaseDao {

    public static Connection getConnection() { //获取数据库连接
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//1.注册驱动
            String url = "jdbc:mysql://localhost:3306/reservation";
            String user = "root";
            String userpsd = "root";
            conn = DriverManager.getConnection(url, user, userpsd);
        } catch (Exception ex) {
            System.out.println(ex + "数据库连接失败");
        }
        return conn;
    }

    public static boolean excuteAddDelUp(String sql,Object[] objects){
        boolean f= false;
        Connection connection = BaseDao.getConnection();
        PreparedStatement statement=null;
        try {
             statement = connection.prepareStatement(sql);
            for (int i=0;i<objects.length;i++){
                statement.setObject(i+1,objects[i]);
            }
            int i = statement.executeUpdate();
            if(i>0){
                f=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement);
        }

        return f;
    }

    public static void classAll(Connection connection,Statement statement,ResultSet resultSet){

        try {
            if(resultSet!=null){
                resultSet.close();
            }
            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public static void classAll(Connection connection,Statement statement){

        try {

            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
