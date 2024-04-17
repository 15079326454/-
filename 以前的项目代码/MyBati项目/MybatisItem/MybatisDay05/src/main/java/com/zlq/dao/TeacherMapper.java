package com.zlq.dao;

import com.zlq.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
@Select("select * from teacher where id=#{tId}")
    Teacher getTeacher(@Param("tId") int id);

}
