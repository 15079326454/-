package com.hgkj.model.dao.impl;

import com.hgkj.model.dao.GoodDao;
import com.hgkj.model.entity.Good;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class GoodDaoImpl implements GoodDao {

    //查询所有
    @Override
    public List <Good> allGoodDao() {

        List<Good> goodList=new ArrayList <>();
        Connection conn=DBManager.getConnection();
        PreparedStatement pst=null;
        ResultSet rs=null;

        String sql="select * from good";
        try {
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()){
                Good good=new Good();
                good.setGoodId(rs.getInt("goodId"));
                good.setGoodName(rs.getString("goodName"));
                good.setGoodPrice(rs.getDouble("goodPrice"));
                good.setGoodAddress(rs.getString("goodAddress"));
                good.setGoodDesp(rs.getString("goodDesp"));
                goodList.add(good);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            DBManager.closeAll(conn,pst,rs);
        }
        return goodList;
    }

    @Override
    public Good getGoodByIdDao(int goodId) {
        Good good=new Good();
        Connection conn=DBManager.getConnection();
        PreparedStatement pst=null;
        ResultSet rs=null;
        String sql="select * from good where goodId=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setInt(1,goodId);

            rs=pst.executeQuery();
            while (rs.next()){
                good.setGoodId(rs.getInt("goodId"));
                good.setGoodName(rs.getString("goodName"));
                good.setGoodPrice(rs.getDouble("goodPrice"));
                good.setGoodAddress(rs.getString("goodAddress"));
                good.setGoodDesp(rs.getString("goodDesp"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DBManager.closeAll(conn,pst,rs);
        }
        return good;
    }
}
