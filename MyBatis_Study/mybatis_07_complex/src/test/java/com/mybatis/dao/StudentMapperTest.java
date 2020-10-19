package com.mybatis.dao;

import com.mybatis.pojo.Student;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {
    @Test
    public void getStudentInfoTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentInfo = mapper.getStudentInfo();
        for (Student student : studentInfo) {
            System.out.println(student);
        }
    }

    @Test
    public void getStudentInfoTest2(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentInfo = mapper.getStudentInfo2();
        for (Student student : studentInfo) {
            System.out.println(student);
        }
    }

}
