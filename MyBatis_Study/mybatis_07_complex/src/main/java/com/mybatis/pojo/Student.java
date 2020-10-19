package com.mybatis.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;

    //一个学生关联一个老师
    private Teacher teacher;
}
