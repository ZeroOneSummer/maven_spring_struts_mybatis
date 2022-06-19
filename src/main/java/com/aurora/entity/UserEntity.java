package com.aurora.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserEntity {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String phone;
}