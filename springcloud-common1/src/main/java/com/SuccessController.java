package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SuccessController {
	  @Autowired
	  private CommonFeignClient commonFeignClient; 
	  
	  @RequestMapping(value = "/common1fegin/success")
	  public String success() {
		System.out.println("Enter springcould-common1 SuccessController");
	    return commonFeignClient.success();
	  }
	  
	  @RequestMapping(value = "/common1/success")
	  public String testCommon1() {
	    return "common1 success";
	  }
}

