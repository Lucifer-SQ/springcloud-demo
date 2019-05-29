package com;
 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication //spring-boot 启动注解
@ComponentScan(basePackages="com")

public class ZuulMain{
     public static void main(String [] args) {
    	 new SpringApplicationBuilder(ZuulMain.class).web(true).run(args);
     }
}

