package com.xiaobudiankeji.biz;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xiaobudiankeji.base.dao"})
public class BizApplication {

	public static void main(String[] args) {
		SpringApplication.run(BizApplication.class, args);
	}
}
