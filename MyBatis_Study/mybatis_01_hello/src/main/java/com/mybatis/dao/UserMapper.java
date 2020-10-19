package com.mybatis.dao;

import com.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    //查-全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //增-插入一个用户
    int addUser(User user);

    // 删-删除一个用户
    int deleteUser(int id);

    // 改
    int updateUser(User user);

    // ...
}
