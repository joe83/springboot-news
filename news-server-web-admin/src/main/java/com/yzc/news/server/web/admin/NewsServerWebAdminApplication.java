package com.yzc.news.server.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,})
public class NewsServerWebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsServerWebAdminApplication.class, args);
    }
}
