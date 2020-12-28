package com.shiyanlou.upms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class UpmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(UpmsApplication.class,args);
        System.out.println("Welcome to shiyanlou upms!");
    }
}
