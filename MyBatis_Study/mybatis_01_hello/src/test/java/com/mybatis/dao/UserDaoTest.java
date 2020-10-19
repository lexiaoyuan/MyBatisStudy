package com.mybatis.dao;

import com.mybatis.pojo.User;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUserListTest() {

        //第一步：获取SqlSession对象
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        try {
            //第二步：执行SQL，通过getMapper(接口对象)得到接口对象
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            //调用接口对象的方法
            List<User> userList = mapper.getUserList();

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //第三步：关闭SqlSession
            sqlSession.close();

        }

    }

    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById(1);
        System.out.println(userById);

        sqlSession.close();
    }

    @Test
    public void addUserTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User(4, "徐仕成", "111222"));

        //增删改一定要提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUserTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(2);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateUserTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser(new User(4, "呵呵呵", "word"));

        sqlSession.commit();
        sqlSession.close();

    }
}
