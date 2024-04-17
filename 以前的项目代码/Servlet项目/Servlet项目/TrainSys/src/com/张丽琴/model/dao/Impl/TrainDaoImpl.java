package com.张丽琴.model.dao.Impl;

import com.张丽琴.model.dao.TrainDao;
import com.张丽琴.model.entity.TrainInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrainDaoImpl implements TrainDao {
    TrainInfo trainInfo=new TrainInfo();

    @Override
    public List<TrainInfo> getAllTrain() {
        List<TrainInfo> trainInfoList=new ArrayList<>();
        Connection connection=DBManager.getConnection();
        PreparedStatement pst=null;
        ResultSet rs=null;
        String sql="select * from train_info ";
        try {
            pst=connection.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()){
                TrainInfo trainInfo=new TrainInfo();
                trainInfo.setTrain_no(rs.getString("train_no"));
               trainInfo.setStart_station(rs.getString("start_station"));
               trainInfo.setArrival_station(rs.getString("arrival_station"));
               trainInfo.setStart_time(rs.getString("start_time"));
               trainInfo.setArrival_time(rs.getString("arrival_time"));
               trainInfo.setType(rs.getString("type"));
               trainInfo.setRuntime(rs.getString("runtime"));
               trainInfo.setMile(rs.getDouble("mile"));
               trainInfoList.add(trainInfo);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBManager.closeAll(connection,pst,rs);
        }
        return trainInfoList;
    }

    @Override
    public boolean delTrainDao(String[] trainId) {
        boolean result=true;
        for(String trainNo:trainId){
            String sql="delete from train_info where train_no=?";
            Object[] objects={trainNo};
            result= DBManager.executeUpdate(sql,objects);
        }
        return result;
    }


    @Override
    public TrainInfo findTrain(String no) {
        TrainInfo trainInfo=new TrainInfo();
        Connection connection= DBManager.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet rs=null;
        String sql="select * from train_info";
        try {
            preparedStatement=connection.prepareStatement(sql);
            rs=preparedStatement.executeQuery();
            while (rs.next()){
                trainInfo.setTrain_no(rs.getString("train_no"));
                trainInfo.setStart_station(rs.getString("start_station"));
                trainInfo.setArrival_station(rs.getString("arrival_station"));
                trainInfo.setStart_time(rs.getString("start_time"));
                trainInfo.setArrival_time(rs.getString("arrival_time"));
                trainInfo.setType(rs.getString("type"));
                trainInfo.setRuntime(rs.getString("runtime"));
                trainInfo.setMile(rs.getDouble("mile"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            com.hgkj.model.dao.impl.DBManager.closeAll(connection,preparedStatement,rs);
        }
        return trainInfo;

    }
}
