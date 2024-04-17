package com.zxdc.model.daoImpl;

import com.zxdc.model.daoInf.ResturantsDaoInf;
import com.zxdc.model.entity.Resturants;

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
public class ResturantsDaoImpl implements ResturantsDaoInf {

    /**
     * 添加商家
     * @param resturants
     * @return
     */
    @Override
    public Resturants addResturants(Resturants resturants) {
        Connection connection = BaseDao.getConnection();
        Resturants resturantsRe = new Resturants();
        String sql = "INSERT INTO `resturants` (`resturants`.`ret_Name`,`resturants`.`ret_Address`,`resturants`.`ret_Pic`) VALUES(?,?,?)";
        PreparedStatement statement = null;
        ResultSet resultSet=null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1,resturants.getRetName());
            statement.setObject(2,resturants.getRetAddress());
            statement.setObject(3,resturants.getRetPic());
            statement.execute();
            resturantsRe = selectUserBy(resturants.getRetName(),resturants.getRetAddress());

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }
        return resturantsRe;

    }

    /**
     * 根据当前页码和查询的条数来获取餐馆的信息
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @Override
    public List<Resturants> queryAllResturantsDao(int pageNumber, int pageSize) {
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        int totalCount = goodNumbr(); // 总记录数

        int totalPage=0; //总页码
        if(totalCount%pageSize==0){
            totalPage= totalCount/pageSize;
        }else{
            totalPage = totalCount/pageSize+1;
        }

        //System.out.println(totalPage+"内");
        if(pageNumber>totalPage){
            pageNumber=totalPage;
        }else if(pageNumber<=1){
            pageNumber=1;
        }
        List<Resturants> lists = new ArrayList<>();
        Connection connection = BaseDao.getConnection();
        String sql="SELECT * FROM resturants LIMIT ?,?";
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1,pageNumber-1);
            statement.setObject(2,pageSize);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                Resturants c = new Resturants();
                int id = resultSet.getInt("ret_Id");
                String retName = resultSet.getString("ret_Name");
                String retAddress = resultSet.getString("ret_Address");
                String retPic = resultSet.getString("ret_Pic");
                c.setRetId(id);
                c.setRetName(retName);
                c.setRetAddress(retAddress);
                c.setRetPic(retPic);
                lists.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }

        return lists;
    }

    /**
     * 根据商家id查询商家
     * @param retId
     * @return
     */

    @Override
    public Resturants getResturantsByIdDao(int retId) {
        Resturants resturants = new Resturants();
        Connection connection = BaseDao.getConnection();
        String sql = "SELECT * FROM `resturants` WHERE ret_Id=?";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1, retId);


            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("ret_Id");
                String name1 = resultSet.getString("ret_Name");
                String pwd = resultSet.getString("ret_Address");
                String ret_pic = resultSet.getString("ret_Pic");
                resturants = new Resturants(id, name1, pwd,ret_pic);

            }else {
                resturants=null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resturants;
    }

    /**
     * 根据餐馆id修改信息
     * @param resturants
     * @return
     */
    @Override
    public boolean updateResturantsByIdDao(Resturants resturants) {
        String sql = "UPDATE resturants SET ret_Name=?,ret_Address=?,ret_Pic=? WHERE ret_Id=?";
        Object[] objects={resturants.getRetName(),resturants.getRetAddress(),resturants.getRetPic(),resturants.getRetId()};
        boolean b = BaseDao.excuteAddDelUp(sql, objects);
        return b;
    }

    /**
     * 根据商家id删除
     * @param redId
     * @return
     */

    @Override
    public boolean delResturantsByIdDao(int redId) {
        String sql = "DELETE FROM resturants WHERE resturants.ret_Id=?";
        Object[] objects={redId};
        boolean b = BaseDao.excuteAddDelUp(sql, objects);
        return b;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Resturants> getRestAdressDao() {
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        List<Resturants> lists = new ArrayList<>();
        Connection connection = BaseDao.getConnection();
        String sql="SELECT * FROM resturants";
        try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("ret_Id");
                String retName = resultSet.getString("ret_Name");
                String retAddress = resultSet.getString("ret_Address");
                String retPic = resultSet.getString("ret_Pic");
                Resturants c = new Resturants();
                c.setRetId(id);
                c.setRetName(retName);
                c.setRetAddress(retAddress);
                c.setRetPic(retPic);
                lists.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }

        return lists;
    }


    /**
     * 查询所有的商家数目
     * @return
     */
    public int goodNumbr() {
        int total=0;
        Connection connection = BaseDao.getConnection();
        String sql="SELECT COUNT(*) FROM `resturants`";
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            if(resultSet.next()){
                total = resultSet.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.classAll(connection,statement,resultSet);
        }

        return total;
    }

    /**
     * 查询单个商家根据商店名和地址查询
     * @param
     * @return
     */
    @Override
    public Resturants selectUserBy(String resturantName, String adress){
       // System.out.println(resturants+"22dao");
        Connection connection = BaseDao.getConnection();
        Resturants resturants = new Resturants();
        String sql = "SELECT * FROM `resturants` WHERE `ret_Name`=? AND `ret_Address` =?";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1, resturantName);
            statement.setObject(2, adress);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("ret_Id");
                String name1 = resultSet.getString("ret_Name");
                String pwd = resultSet.getString("ret_Address");
                String ret_pic = resultSet.getString("ret_Pic");
                resturants = new Resturants(id, name1, pwd,ret_pic);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resturants;
    }

}
