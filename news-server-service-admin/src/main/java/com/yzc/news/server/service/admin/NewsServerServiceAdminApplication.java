package com.yzc.news.server.service.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yzc.news.server.mapper")
public class NewsServerServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsServerServiceAdminApplication.class, args);
    }
}
