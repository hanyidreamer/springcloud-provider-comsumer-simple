package com.itoche.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ZHANGHANYI5 on 2017/6/13.
 */
@RestController
public class ConsumerController
{

	@Autowired
	ConsumerClient computeClient;

	/**
	 * @description: http://localhost:8083/add/4/6
	 * @param
	 * @return
	 * @author: zhanghanyi5
	 * @createTime: 2017/6/13 17:51
	 */
	@RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
	public Integer test(@PathVariable("a") Integer a, @PathVariable("b") Integer b)
	{
		System.out.println("__________consumer");
		return computeClient.test(a, b);
	}

}
