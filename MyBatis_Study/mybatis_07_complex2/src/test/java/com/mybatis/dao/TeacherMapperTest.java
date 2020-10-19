package com.mybatis.dao;

import com.mybatis.pojo.Teacher;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherMapperTest {
    @Test
    public void getTeacherTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher();
        System.out.println(teacher);

        sqlSession.close();

    }

    @Test
    public void getTeacherAndStudentTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherAndStudent = mapper.getTeacherAndStudent(2);
        System.out.println(teacherAndStudent);
        sqlSession.close();
    }

    @Test
    public void getTeacherAndStudent2Test(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacherAndStudent = mapper.getTeacherAndStudent2(1);
        System.out.println(teacherAndStudent);
        sqlSession.close();
    }
}
