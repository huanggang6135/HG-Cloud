package org.hg.cloud.account;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @Author huangggang6135@gmail.com
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("org.hg.cloud.*.rest")
@ComponentScan("org.hg.cloud.*.rest")
public class AccountApplicationBoot {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(AccountApplicationBoot.class);
    }
}
