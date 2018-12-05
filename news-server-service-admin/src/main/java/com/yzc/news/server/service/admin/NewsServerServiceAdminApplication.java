package com.yzc.news.server.service.admin;

import com.alibaba.dubbo.container.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yzc.news.server.service.admin.mapper")
public class NewsServerServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsServerServiceAdminApplication.class, args);
        Main.main(args);
    }
}
