package com.mybatis.dao;

import com.mybatis.pojo.Teacher;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherMapperTest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher();
        System.out.println(teacher);
        sqlSession.close();
    }
}
