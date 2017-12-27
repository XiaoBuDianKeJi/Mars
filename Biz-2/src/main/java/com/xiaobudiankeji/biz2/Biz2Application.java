package com.xiaobudiankeji.biz2;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = {"com.xiaobudiankeji.base.dao"})
public class Biz2Application {

	public static void main(String[] args) {
		SpringApplication.run(Biz2Application.class, args);
	}

	@Bean
	@LoadBalanced
		//开启负载均衡
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
