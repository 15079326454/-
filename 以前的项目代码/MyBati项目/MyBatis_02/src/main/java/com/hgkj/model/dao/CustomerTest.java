package com.hgkj.model.dao;

import com.hgkj.model.entity.Orders;
import com.hgkj.model.entity.Tcustomer;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CustomerTest {
    /*多对一添加客户同时添加订单并指定给新添加的客户*/
    @Test
    public void manyToOne(){
        /*得到SqlSession*/
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TcustomerMapper tcustomerMapper=sqlSession.getMapper(TcustomerMapper.class);
        OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
        Tcustomer tcustomer=new Tcustomer("张三","12","123121");
        Orders orders=new Orders("00001","22",tcustomer);
       tcustomerMapper.insertCmd(tcustomer);
       ordersMapper.insertOrders(orders);
        sqlSession.commit();
        sqlSession.close();
    }
/*一对多通过订单，查询对应的客户信息*/
    @Test
    public void selectCust() {
        //*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //*实例化接口*//*
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
        Orders orders = ordersMapper.selectOrderById(2);
        System.out.println("客户:"+orders.getTcustomer().getName());
        System.out.println("订单编号:" + orders.getOrderNumber());
        System.out.println("订单价格：" + orders.getOrderPrice());
        System.out.println("===============客户信息===================");
        System.out.println(orders.getTcustomer().getName());
        System.out.println(orders.getTcustomer().getAge());
        System.out.println(orders.getTcustomer().getTel());
    }





    /*添加*/
@Test
    public void custAdd(){
    /*得到SqlSession*/
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    TcustomerMapper tcustomerMapper=sqlSession.getMapper(TcustomerMapper.class);
    Tcustomer tcustomer=new Tcustomer();
    tcustomer.setName("jack");
    tcustomer.setAge("21");
    tcustomer.setTel("23232323");
    int rowNum=tcustomerMapper.insertCmd(tcustomer);
    System.out.println("rowNum="+rowNum);
    sqlSession.commit();
    sqlSession.close();
}
/*根据Id查询指定的内容*/
@Test
    public void seletcByIdCust(){
    /*得到SqlSession*/
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    TcustomerMapper tcustomerMapper=sqlSession.getMapper(TcustomerMapper.class);
    Tcustomer tcustomer=tcustomerMapper.selectById(2);
    System.out.println("姓名:"+tcustomer.getName());
    System.out.println("年龄:"+tcustomer.getAge());
    System.out.println("电话:"+tcustomer.getTel());
}
/*查询所有*/
    @Test
    public void seletcAllCust(){
        /*得到SqlSession*/
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TcustomerMapper tcustomerMapper=sqlSession.getMapper(TcustomerMapper.class);
        List<Tcustomer> tcustomerList=tcustomerMapper.selecteAllCmd();
        for (Tcustomer tcustomer:tcustomerList){
            System.out.println("姓名:"+tcustomer.getName());
            System.out.println("年龄:"+tcustomer.getAge());
            System.out.println("电话:"+tcustomer.getTel());
            System.out.println("-----------------------------");
        }
    }
    /*删除*/
    @Test
    public void delectCust(){
        /*得到SqlSession*/
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TcustomerMapper tcustomerMapper=sqlSession.getMapper(TcustomerMapper.class);
        int rowNum=tcustomerMapper.deleteCmd(2);
        System.out.println("rowNum="+rowNum);
        sqlSession.commit();
        sqlSession.close();
    }
    /*修改*/
    @Test
    public void updateCust(){
        /*得到SqlSession*/
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TcustomerMapper tcustomerMapper=sqlSession.getMapper(TcustomerMapper.class);
        Tcustomer tcustomer=tcustomerMapper.selectById(1);
       tcustomer.setTel("1243");
        int rowNum=tcustomerMapper.updateCmd(tcustomer);
        System.out.println("rowNum="+rowNum);
        sqlSession.commit();
        sqlSession.close();
    }
    /*模糊查询*/
    @Test
    public void seletcLikeCust(){
        /*得到SqlSession*/
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TcustomerMapper tcustomerMapper=sqlSession.getMapper(TcustomerMapper.class);
        List<Tcustomer> tcustomerList=tcustomerMapper.selectLike("张");
        for (Tcustomer tcustomer:tcustomerList){
            System.out.println("姓名:"+tcustomer.getName());
            System.out.println("年龄:"+tcustomer.getAge());
            System.out.println("电话:"+tcustomer.getTel());
            System.out.println("==================================");
        }
    }
    /*分页查询*/
    @Test
    public void blogFenYetest(){
        //*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //*实例化接口*//*
        TcustomerMapper tcustomerMapper=sqlSession.getMapper(TcustomerMapper.class);
        int pageIndex=2;
        int pageSize=2;
       List<Tcustomer> tcustomerList=tcustomerMapper.selectFenYe((pageIndex-1)*pageSize,pageSize);
        for (Tcustomer tcustomer:tcustomerList){
            System.out.println("姓名:"+tcustomer.getName());
            System.out.println("年龄："+tcustomer.getAge());
            System.out.println("电话："+tcustomer.getTel());
            System.out.println("-------------------------------------");
        }}
}
