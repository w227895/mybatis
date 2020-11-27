package com.kebo.mybatis.mapper;

import com.kebo.mybatis.po.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    Student selectById(Integer id);

    Integer insert(Student student);

    List<Student> findAll();

    Integer delete(Integer id);

    Integer update(Student student);

    List<Student> findByCondition(@Param("name") String name, @Param("sal") Double sal);

    Integer updateByConditions(Student student);

    Integer deleteByConditions(List<Integer> ids);

    Integer insertByConditions(Student student);
}
