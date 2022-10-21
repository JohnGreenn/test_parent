package com.ge.test_parent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ge.test_parent")
@SpringBootApplication
public class TestParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestParentApplication.class, args);
    }

}
