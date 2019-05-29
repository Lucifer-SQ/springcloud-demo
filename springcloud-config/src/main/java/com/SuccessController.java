package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SuccessController {

	  @RequestMapping(value = "/check/success")
	  public String success() {
		System.out.println("Enter springcould-common1 SuccessController");
		return "success";
	  }
}

