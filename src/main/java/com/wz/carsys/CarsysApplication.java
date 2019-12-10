package com.wz.carsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类
@SpringBootApplication //标记  这是SpringBoot项目
public class CarsysApplication {

    //main方法
    public static void main(String[] args) {
        //加载初始信息
        SpringApplication.run(CarsysApplication.class, args);
    }

}
