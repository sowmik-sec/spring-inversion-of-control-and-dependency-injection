package com.sowmik.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//        scanBasePackages = {
//                "com.sowmik.springcoredemo",
//                "com.sowmik.util"
//        }
//)
@SpringBootApplication
public class SpringCoreDemo {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreDemo.class, args);
    }

}
