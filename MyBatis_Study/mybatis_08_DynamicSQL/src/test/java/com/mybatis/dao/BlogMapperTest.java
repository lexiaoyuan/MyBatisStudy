package com.mybatis.dao;
import com.mybatis.pojo.Blog;
import com.mybatis.utils.IdUtil;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class BlogMapperTest {
    @Test
    public void addBlogTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IdUtil.getId());
        blog.setTitle("MyBatis如此简单");
        blog.setAuthor("乐小猿");
        blog.setCreateTime(new Date());
        blog.setViews(20200202);

        mapper.addBlog(blog);

        blog.setId(IdUtil.getId());
        blog.setTitle("Spring如此简单");
        blog.setAuthor("快乐的小小程序猿");
        blog.setCreateTime(new Date());
        blog.setViews(20202020);

        mapper.addBlog(blog);

        blog.setId(IdUtil.getId());
        blog.setTitle("SpringMVC如此简单");
        blog.setAuthor("乐小猿");
        blog.setCreateTime(new Date());
        blog.setViews(20202002);

        mapper.addBlog(blog);

        blog.setId(IdUtil.getId());
        blog.setTitle("Spring Boot如此简单");
        blog.setAuthor("快乐的小小程序猿");
        blog.setCreateTime(new Date());
        blog.setViews(20202222);

        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlogIfTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title","Spring Boot如此简单");
        //map.put("author" , "快乐的小小程序猿");
        map.put("author" , "乐小猿");

        List<Blog> blogList = mapper.queryBlogIf(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void queryBlogChooseTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        //map.put("title","%Spring%");
        map.put("author" , "%快乐%");

        List<Blog> blogList = mapper.queryBlogChoose(map);

        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void queryBlogWhereTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        //map.put("title","Spring Boot如此简单");
        map.put("author" , "乐小猿");

        List<Blog> blogList = mapper.queryBlogWhere(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void updateBlogSetTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("id" , "54f147aa553d4440b565f098495b3e3b");
        map.put("views" , "99999");
        map.put("author" , "徐仕成");
        mapper.updateBlogSet(map);

        sqlSession.close();

    }

    @Test
    public void queryBlogForeachTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        ArrayList<String> list = new ArrayList<String>();

        HashMap<String, Object> map = new HashMap<String, Object>();

        list.add("徐仕成");
        list.add("快乐的小小程序猿");

        map.put("authorList", list);

        List<Blog> blogList = mapper.queryBlogForeach(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }

        sqlSession.close();

    }
}
