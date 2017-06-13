package com.itoche.comtroller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ZHANGHANYI5 on 2017/6/13.
 */
@RestController
public class ComputeController
{
	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
	public Integer add(@PathVariable Integer a, @PathVariable Integer b)
	{
		ServiceInstance instance = client.getLocalServiceInstance();
		Integer r = a + b;
		logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
		return r;
	}
}
