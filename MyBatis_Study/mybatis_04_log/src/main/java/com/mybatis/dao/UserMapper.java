package com.mybatis.dao;

import com.mybatis.pojo.User;

public interface UserMapper {

    //根据id查询用户
    User getUserById(int id);
}
