package com.zlq.dao;

import com.zlq.until.MybatisUtils;
import com.zlq.entity.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class OneToManyTest {
@Test
    public void getTeacherList(){
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
    List<Teacher> teacherList = mapper.getTeacherList();
    for (Teacher teacher : teacherList) {
        System.err.println(teacher);
    }
    sqlSession.close();
}

    @Test
    public void getTeacherById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById = mapper.getTeacherById(1);
            System.err.println(teacherById);

        sqlSession.close();
    }

    @Test
    public void getTeacherById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherById = mapper.getTeacherById2(1);
        System.err.println(teacherById);

        sqlSession.close();
    }
}
