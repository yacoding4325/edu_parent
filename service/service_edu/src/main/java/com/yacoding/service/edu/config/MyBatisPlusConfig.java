package com.yacoding.service.edu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author yaCoding
 * @create 2022-06-26 下午 9:38
 */

@Configuration
@EnableTransactionManagement
@MapperScan("com.yacoding.service.edu.mapper")
public class MyBatisPlusConfig {
}

