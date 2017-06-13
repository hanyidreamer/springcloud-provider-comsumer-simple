package com.itoche.comtroller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ZHANGHANYI5 on 2017/6/13.
 */
@FeignClient("compute-service")
public interface ConsumerClient {

	@RequestMapping(method = RequestMethod.GET, value = "/add/{a}/{b}")
	Integer test(@PathVariable("a") Integer a, @PathVariable("b") Integer b);

}