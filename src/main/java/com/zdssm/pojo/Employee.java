package com.zdssm.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author zd
 * @Date 2020/7/22 9:45
 **/
@Setter
@Getter
public class Employee {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String address;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
