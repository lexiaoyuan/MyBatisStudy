package com.mybatis.dao;

import com.mybatis.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    //获得所有老师
    @Select("select * from teacher;")
    List<Teacher> getTeacher();


    //获得指定老师及其所有学生信息--按结果嵌套查询
    Teacher getTeacherAndStudent(@Param("tid") int id);

    //按查询嵌套查询
    Teacher getTeacherAndStudent2(@Param("tid") int id);
}
