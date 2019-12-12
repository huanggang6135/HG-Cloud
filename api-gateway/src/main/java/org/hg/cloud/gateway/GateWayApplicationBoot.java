package org.hg.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author huangggang6135@gmail.com
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GateWayApplicationBoot {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplicationBoot.class);
    }
}
