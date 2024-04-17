package com.zlq.dao;


import com.zlq.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
//获取老师
    List<Teacher> getTeacherList();

//    获取指定老师下的所有学生及老师信息
    Teacher getTeacherById(int id);
    Teacher getTeacherById2(int id);
}
