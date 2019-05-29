package com;
 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
@EnableDiscoveryClient
@SpringBootApplication //spring-boot 启动注解
@ComponentScan(basePackages="com")
//允许断路器
@EnableCircuitBreaker
public class APPMain{
     public static void main(String [] args) {
    	 new SpringApplicationBuilder(APPMain.class).web(true).run(args);
     }
     @Bean
     public IRule ribbonRule(){
         return new RandomRule();
     }

     @Bean
     @LoadBalanced
     public RestTemplate restTemplate(){
         return new RestTemplate();
     }
}

