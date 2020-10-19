package com.mybatis.dao;
import com.mybatis.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有学生和老师信息
    List <Student> getStudentInfo();

    List <Student> getStudentInfo2();
}
