package com.hgkj.model.dao.impl;

import com.hgkj.model.dao.TrainDao;
import com.hgkj.model.entity.TrainInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TrainDaoImpl implements TrainDao {
    @Override
    public List<TrainInfo> getAllTrainDao() {
        List<TrainInfo> trainInfoList=new ArrayList<>();
        Connection connection=DBManager.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        String sql="select * from train_info";
        try {
            preparedStatement=connection.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                TrainInfo trainInfo=new TrainInfo();
                trainInfo.setArrival_station(resultSet.getString("arrival_station"));
                trainInfo.setArrival_time(resultSet.getString("arrival_time"));
                trainInfo.setMile(resultSet.getDouble("mile"));
                trainInfo.setRuntime(resultSet.getString("runtime"));
                trainInfo.setStart_station(resultSet.getString("start_station"));
                trainInfo.setStart_time(resultSet.getString("start_time"));
                trainInfo.setTrain_no(resultSet.getString("train_no"));
                trainInfo.setType(resultSet.getString("type"));
                trainInfoList.add(trainInfo);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBManager.closeAll(connection,preparedStatement,resultSet);
        }
        return trainInfoList;
    }

    @Override
    public boolean delTrainDao(String[] trainId) {
        boolean result=true;
        for (String train_no:trainId){
            String sql="delete from train_info where train_no=?";
            Object[] objects={train_no};
            result=DBManager.executeUpdate(sql,objects);
        }
        return result;
    }

    @Override
    public TrainInfo findTrainDao(String no) {
        TrainInfo trainInfo=new TrainInfo();
        Connection connection=DBManager.getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        String sql="select * from train_info where train_no=?";
        try {
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,no);
            resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                trainInfo.setArrival_station(resultSet.getString("arrival_station"));
                trainInfo.setArrival_time(resultSet.getString("arrival_time"));
                trainInfo.setMile(resultSet.getDouble("mile"));
                trainInfo.setRuntime(resultSet.getString("runtime"));
                trainInfo.setStart_station(resultSet.getString("start_station"));
                trainInfo.setStart_time(resultSet.getString("start_time"));
                trainInfo.setTrain_no(resultSet.getString("train_no"));
                trainInfo.setType(resultSet.getString("type"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBManager.closeAll(connection,preparedStatement,resultSet);
        }
        return trainInfo;
    }
}
