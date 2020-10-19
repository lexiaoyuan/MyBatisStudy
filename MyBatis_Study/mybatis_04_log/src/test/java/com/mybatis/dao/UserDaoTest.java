package com.mybatis.dao;

import com.mybatis.pojo.User;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById(1);
        System.out.println(userById);

        sqlSession.close();
    }

    @Test
    public void getUserLogTest(){
        logger.info("[info]测试方法getUserLogTest成功");
        logger.debug("[debug]测试方法getUserLogTest成功");
        logger.error("[error]测试方法getUserLogTest成功");
    }

}
