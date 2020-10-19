package com.mybatis.utils;

import org.junit.Test;

import java.util.UUID;

public class IdUtil {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void Test(){
        System.out.println(IdUtil.getId());
        System.out.println(IdUtil.getId());
        System.out.println(IdUtil.getId());
    }
}
