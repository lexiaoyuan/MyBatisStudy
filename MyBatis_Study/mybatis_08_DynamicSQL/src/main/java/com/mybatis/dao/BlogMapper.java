package com.mybatis.dao;
import com.mybatis.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入博客
    int addBlog(Blog blog);

    //查询博客--使用if
    List<Blog> queryBlogIf(Map map);

    //查询博客--使用choose
    List<Blog> queryBlogChoose(Map map);

    //查询博客--使用where
    List<Blog> queryBlogWhere(Map map);

    //查询博客--使用foreach
    List<Blog> queryBlogForeach(Map map);

    //更新博客
    int updateBlogSet(Map map);

}
