package com.cc.service;


import com.cc.bean.Student;

import java.util.List;


public interface StudentService {
    List<Student> selectAll();

    Student getStudent(String numberCode);

    int delete(String numberCode);

    int update(Student student);

    int insert(Student student);

}
