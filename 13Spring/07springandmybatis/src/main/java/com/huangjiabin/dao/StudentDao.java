package com.huangjiabin.dao;

import com.huangjiabin.entity.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student s);
    List<Student> selectStudents();


}
