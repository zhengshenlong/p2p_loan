package com.p2p;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BidSpringBoot {
  //投标服务
    public static void main(String[] args) {
        SpringApplication.run(BidSpringBoot.class,args);
    }
}
