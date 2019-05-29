package com;
 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
 
@EnableDiscoveryClient
@SpringBootApplication //spring-boot 启动注解
@EnableFeignClients(basePackages="com")
public class APPMain{
     public static void main(String [] args) {
    	 new SpringApplicationBuilder(APPMain.class).web(true).run(args);
     }
     
     
}

