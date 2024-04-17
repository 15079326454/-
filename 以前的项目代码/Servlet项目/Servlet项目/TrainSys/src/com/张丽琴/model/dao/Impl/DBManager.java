package com.张丽琴.model.dao.Impl;

import java.sql.*;

/**
 * @author China
 * @create 2019/4/19/09:25
 **/
public class DBManager {
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/train?useUnicode=true&characterEncoding=utf8&useSSL=false";
    private static final String USER="root";
    private static final String PASSWORD="zlq520529";
    public static Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName(DRIVER);
            connection= DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static boolean executeUpdate(String sql,Object[] objs){
        boolean flag=false;
        Connection connection=getConnection();
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=connection.prepareStatement(sql);
            for (int i = 0; i <objs.length; i++) {
                preparedStatement.setObject(i+1,objs[i]);
            }
            int count=preparedStatement.executeUpdate();
            if (count>0){
                flag=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(connection,preparedStatement);
        }
        return flag;
    }



    public static void closeAll(Connection connection, Statement statement, ResultSet resultSet) {

        try {
            if (resultSet!=null){
                resultSet.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void closeAll(Connection connection,Statement statement) {

        try {
            if (statement!=null){
                statement.close();}
            if (connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
