package com.cc.dao;

import com.cc.bean.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentMapper {

    //@Select("select * from student")
    List<Student> selectAll();

    @Select("select * from student where num = #{num}")
    Student getStudent(@Param("num") String num);

    @Delete("delete from student where num = #{num}")
    int delete(@Param("num") String num);

    int update(Student student);

    int insert(Student student);
}

