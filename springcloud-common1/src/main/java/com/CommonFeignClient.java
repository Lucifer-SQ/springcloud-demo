package com;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name ="springcloud-common")
public interface CommonFeignClient {
	@RequestMapping(value = "/success")
	public String success();
}
