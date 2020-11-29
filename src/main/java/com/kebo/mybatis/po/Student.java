package com.kebo.mybatis.po;

import java.io.Serializable;

/**
 * @description:
 * @author: kb
 * @create: 2020-11-25 21:18
 **/
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Double sal;

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
