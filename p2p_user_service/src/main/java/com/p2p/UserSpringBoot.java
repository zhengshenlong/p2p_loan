package com.p2p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserSpringBoot {

    public static void main(String[] args) {
        SpringApplication.run(UserSpringBoot.class,args);
    }
}
