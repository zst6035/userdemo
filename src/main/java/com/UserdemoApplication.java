package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.bjsxt.mapper")
@SpringBootApplication
public class UserdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserdemoApplication.class, args);
    }

}
