package com.xxxy.club.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.stream.Stream;

/**
 * 网关启动器
 * 
 * @author: ChickenWing
 * @date: 2023/10/11
 */
@SpringBootApplication
@ComponentScan("com.xxxy")
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
    }

}
