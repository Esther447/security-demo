package com.example.springsecuritylab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringSecurityLabApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityLabApplication.class, args);
    }
}


