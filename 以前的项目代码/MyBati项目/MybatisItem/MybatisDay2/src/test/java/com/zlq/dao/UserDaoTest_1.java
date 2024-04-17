package com.zlq.dao;


import com.zlq.entity.User;
import com.zlq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import java.util.List;


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

}
