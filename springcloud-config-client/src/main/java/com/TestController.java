package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//这里面的属性有可能会更新的，git中的配置中心变化的话就要刷新，没有这个注解内，配置就不能及时更新
public class TestController {

//  @Value("${from}")
//  private String from;

  @RequestMapping("/test")
  public String test(){
      return "success" ;
  }
}