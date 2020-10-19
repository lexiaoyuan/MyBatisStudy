package com.mybatis.dao;

import com.mybatis.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    @Select("select * from teacher")
    Teacher getTeacher();
}
