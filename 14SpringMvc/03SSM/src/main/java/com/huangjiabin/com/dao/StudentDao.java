package com.huangjiabin.com.dao;

import com.huangjiabin.com.entity.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
