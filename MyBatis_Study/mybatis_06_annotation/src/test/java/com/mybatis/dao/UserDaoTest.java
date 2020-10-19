package com.mybatis.dao;

import com.mybatis.pojo.User;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void getUserAllTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userAll = mapper.getUserAll();
        for (User user : userAll) {
            System.out.println(user);
        }

        sqlSession.close();

    }

    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById(3);
        System.out.println(userById);

        sqlSession.close();
    }

    @Test
    public void insertUserTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.insertUser(new User(7, "HelloInsert", "insertHello"));

        sqlSession.close();
    }

    @Test
    public void deleteUserTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(6);

        sqlSession.close();
    }
}
