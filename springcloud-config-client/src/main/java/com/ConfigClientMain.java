package com;
 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages="com")
public class ConfigClientMain{

     public static void main(String [] args) {
    	 new SpringApplicationBuilder(ConfigClientMain.class).web(true).run(args);
     } 
     

}

