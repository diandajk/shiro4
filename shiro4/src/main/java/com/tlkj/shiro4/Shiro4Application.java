package com.tlkj.shiro4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.tlkj.shiro4.dao")
public class Shiro4Application {

    public static void main(String[] args) {
        SpringApplication.run(Shiro4Application.class, args);
    }

}
