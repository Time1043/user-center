package com.time1043.usercenterjava;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.time1043.usercenterjava.mapper")
public class UserCenterJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterJavaApplication.class, args);
    }

}
