package com.zlq.dao;

import com.zlq.entity.Student;
import com.zlq.entity.Teacher;
import com.zlq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public  void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.err.println(teacher);;
        sqlSession.close();
    }

    @Test
    public  void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList =mapper.getStudent();
        for (Student student : studentList) {
            System.err.println(student);
        }
        sqlSession.close();
    }

    @Test
    public  void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList =mapper.getStudent2();
        for (Student student : studentList) {
            System.err.println(student);
        }
        sqlSession.close();
    }

}
