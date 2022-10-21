package com.ge.test_parent.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ge
 * @date: 2022/10/21
 * @description:
 **/
@Configuration
@MapperScan("com.ge.test_parent")
public class TestConfig {
}
