package com.xiao.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@ServletComponentScan(basePackages = "com.xiao.admin.servlet")
@SpringBootApplication
@MapperScan("com.xiao.admin.mapper")
public class Boot03WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot03WebAdminApplication.class, args);
    }


}
