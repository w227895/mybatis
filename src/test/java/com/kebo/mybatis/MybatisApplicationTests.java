package com.kebo.mybatis;

import com.kebo.mybatis.mapper.StudentMapper;
import com.kebo.mybatis.po.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void testSelectById() {
        Student student = studentMapper.selectById(1);
        System.out.println(student);

    }

    @Test
    void testInsert() {
        Student student = new Student();
        student.setId(2);
        student.setName("kebo");
        student.setSal(22.6);
        Integer number = studentMapper.insert(student);
        System.out.println(number);
    }

    @Test
    void testFindAll() {
        List<Student> studentList = studentMapper.findAll();
        for (Student student:studentList) {
            System.out.println(student);
        }
    }

    @Test
    void testDelete() {
        Integer number = studentMapper.delete(1);
        System.out.println(number);
    }

    @Test
    void testUpdate() {
        Student student = new Student();
        student.setId(2);
        student.setName("kebo2");
        student.setSal(22.6);
        Integer number = studentMapper.update(student);
        System.out.println(number);
    }

}
