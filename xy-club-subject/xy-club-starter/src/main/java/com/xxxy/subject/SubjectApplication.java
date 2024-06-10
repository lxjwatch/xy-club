package com.xxxy.subject;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 刷题微服务启动类
 *
 * @author: lxj
 * @date: 2023/10/1
 */
@SpringBootApplication
@ComponentScan("com.xxxy")
@MapperScan("com.xxxy.subject.infra.basic.mapper")
public class SubjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class);
    }

}
