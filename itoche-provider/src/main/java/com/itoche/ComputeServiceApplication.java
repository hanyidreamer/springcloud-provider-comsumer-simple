package com.itoche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 全局配置服务器
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication
{
	public static void main(String[] args)
	{
		new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
	}
}
