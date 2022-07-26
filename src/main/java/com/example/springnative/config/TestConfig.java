package com.example.springnative.config;

import com.example.springnative.model.Student;
import com.example.springnative.model.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shanhy
 * @date 2022-07-08 11:30
 */
@Configuration(proxyBeanMethods = true)
public class TestConfig {

    @Bean
    public Student getStudent() {
        System.out.println("同学你好...");
        return new Student();
    }

    @Bean
    public Teacher getTeacher() {
        System.out.println("getTeacher() 方法被执行...");
        return new Teacher(getStudent());
    }

}
