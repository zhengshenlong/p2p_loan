package com.p2p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LoanSpringBoot {
    //借款服务
    public static void main(String[] args) {
        SpringApplication.run(LoanSpringBoot.class,args);
    }
}
