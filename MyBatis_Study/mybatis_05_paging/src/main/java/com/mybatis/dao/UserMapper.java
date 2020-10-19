package com.mybatis.dao;
import com.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //根据id查询用户
    User getUserById(int id);

    //limit分页
    List<User> getUserByLimit(Map<String, Integer> map);
}
