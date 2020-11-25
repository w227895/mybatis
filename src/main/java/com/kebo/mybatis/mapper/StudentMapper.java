package com.kebo.mybatis.mapper;

import com.kebo.mybatis.po.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    Student selectById(Integer id);

    Integer insert(Student student);

    List<Student> findAll();

    Integer delete(Integer id);

    Integer update(Student student);
}
