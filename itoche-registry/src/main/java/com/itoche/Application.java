
package com.itoche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 全局配置服务器
 *
 * http://localhost:1111/
 */
@EnableEurekaServer
@SpringBootApplication
public class Application
{
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
