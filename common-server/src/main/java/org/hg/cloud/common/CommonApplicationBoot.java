package org.hg.cloud.common;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @Author huangggang6135@gmail.com
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class CommonApplicationBoot {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
    public static void main(String[] args) {
        SpringApplication.run(CommonApplicationBoot.class);
    }
}
