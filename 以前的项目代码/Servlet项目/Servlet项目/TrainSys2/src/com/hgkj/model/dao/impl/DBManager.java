package com.hgkj.model.dao.impl;

import java.sql.*;

public class DBManager {
       private static final String driver="com.mysql.jdbc.Driver";
       private static final String url="jdbc:mysql://localhost:3306/train?characterEncoding=utf-8";
       private static final String userName="root";
       private static final String userPwd="zlq520529";

        /**
         * 获取数据库连接
         * @return
         */
        public static Connection getConnection(){
            Connection conn=null;
            try {
                //加载驱动
                Class.forName(driver);
                //获取数据库连接
                conn=DriverManager.getConnection(url, userName, userPwd);
            } catch (Exception e) {
                System.out.println("数据库连接异常");
                e.printStackTrace();
            }
            return conn;
        }
        /**
         * 使用PrepareStatement封装增删改操作
         * @param sql
         * @return
         */
        public static boolean executeUpdate(String sql,Object[] objs){
            Connection conn=null;
            PreparedStatement pst=null;
            boolean flag=false;
            try {
                conn=getConnection();
                pst=conn.prepareStatement(sql);
                //给参数赋值
                for(int i=0;i<objs.length;i++){
                    pst.setObject(i+1, objs[i]);
                }
                int num=pst.executeUpdate();
                if(num>0){
                    flag=true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally{
                closeAll(conn, pst);
            }

            return flag;
        }
        /**
         * 关闭连接对象
         * @param conn
         * @param state
         * @param rs
         */
        public static void closeAll(Connection conn,Statement state,ResultSet rs){
            try {
                if(rs!=null){
                    rs.close();
                }
                if(state!=null){
                    state.close();
                }
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    public static void closeAll(Connection conn,Statement state) {
        try {
            if (state != null) {
                state.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
