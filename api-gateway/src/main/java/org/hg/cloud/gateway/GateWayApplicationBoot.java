package org.hg.cloud.gateway;

import org.hg.cloud.gateway.filter.PreAccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

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

    @Bean
    PreAccessFilter preAccessFilter(){
        return new PreAccessFilter();
    }
}
