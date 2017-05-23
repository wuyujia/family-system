package org.rent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/** Created by wuyujia on 17/3/31. */
// SpringBoot标准注解, 一般写在App入口处
@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
// 开启Servlet扫描
@ServletComponentScan
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
