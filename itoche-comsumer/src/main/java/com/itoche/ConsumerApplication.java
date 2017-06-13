package com.itoche;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 全局配置服务器
 *
 */
@EnableDiscoveryClient
@EnableFeignClients
@EnableAutoConfiguration
@SpringBootApplication
public class ConsumerApplication
{
	public static void main(String[] args)
	{
		new SpringApplicationBuilder(ConsumerApplication.class).web(true).run(args);
	}
}
