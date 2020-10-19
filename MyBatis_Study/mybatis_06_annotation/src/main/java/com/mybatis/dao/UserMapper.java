package com.mybatis.dao;
import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import	java.util.List;
public interface UserMapper {

    @Select("select * from user")
    List <User> getUserAll();

    //注：SQL语句中取的参数为@Param()注解中指定的参数
    @Select("select * from user where id=#{uid}")
    User getUserById(@Param("uid") int id );

    //注：引用类型的参数不使用@Param()注解，SQL中通过#{}取出的参数为实体类中的属性
    @Insert("insert into user(id, name, pwd) values(#{id},#{name},#{password})")
    int insertUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);
}
