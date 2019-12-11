package org.hg.cloud.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author huangggang6135@gmail.com
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class CommonApplicationBoot {
    public static void main(String[] args) {
        SpringApplication.run(CommonApplicationBoot.class);
    }
}
