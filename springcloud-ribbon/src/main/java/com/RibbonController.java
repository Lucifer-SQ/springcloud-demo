package com;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RibbonController {
   @Autowired
    private  RibbonService ribbonService;
	 @RequestMapping("/ribbon/consumer")
	 public String helloConsumer() throws ExecutionException, InterruptedException {

		 return ribbonService.ribbonService();
	 }
}
