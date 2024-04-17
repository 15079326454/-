package com.zlq.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Teacher {
    private int id;
    private String name;
//    一个老师拥有多个学生
    private List<Student> students;
}
