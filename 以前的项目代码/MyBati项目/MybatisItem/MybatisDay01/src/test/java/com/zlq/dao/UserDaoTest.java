package com.zlq.dao;


import com.zlq.entity.User;
import com.zlq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test() {
//        第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //        第二步：执行sql语句
//        方式一：getMapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
//        方式二：
//        List<User> userList = sqlSession.selectList("com.zlq.dao.UserMapper.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //        关闭SqlSession
            sqlSession.close();
        }
    }

    //根据id查询
    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    //根据id查询
    @Test
    public void getUserById2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 2);
        map.put("userName", "郭富城");
        mapper.getUserById2(map);
        System.out.println(mapper);
        sqlSession.close();
    }

    //根据id查询
    @Test
    public void selectLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       List<User> userList = mapper.selectLike("林");
        System.out.println(userList);
        sqlSession.close();
    }




    //    增删改需提交事务
    @Test
    public void insertUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.addUser(new User(7, "lelel", "15345", "浙江宁波", "545878"));
        if (res > 0) {
            System.out.println("插入成功");
        }
//提交事务
        sqlSession.commit();
        sqlSession.close();
    }
//
//    //    增删改需提交事务
//    @Test
//    public void insertUser2() {
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("userId", 8);
//        map.put("userName", "34243");
//        map.put("pwd", "454564");
//        int res = mapper.addUser2(map);
//        if (res > 0) {
//            System.out.println("插入成功");
//        }
////提交事务
//        sqlSession.commit();
//        sqlSession.close();
//    }

    //    增删改需提交事务
    @Test
    public void updatetUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.updateUser(new User(6, "可口", "00000", "浙江绍兴", "12346789456"));
        if (res > 0) {
            System.out.println("修改成功");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //    增删改需提交事务
    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.deleteUser(7);
        if (res > 0) {
            System.out.println("删除成功");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

}
