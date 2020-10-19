package com.mybatis.dao;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User queryUserById(@Param("id") int id);

    int updateUser(User user);

}
