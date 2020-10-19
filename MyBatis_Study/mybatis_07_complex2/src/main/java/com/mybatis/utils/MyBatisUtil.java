package com.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//得到sqlSession
public class MyBatisUtil {

    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            //使用MyBatis第一步：获取SqlSession（SqlSessionFactory对象）
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //第二步：从 SqlSessionFactory 中获取 SqlSession
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession(true); //参数为true，表示开启自动提交事务
    }

}
