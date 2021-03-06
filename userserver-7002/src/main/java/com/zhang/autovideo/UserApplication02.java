package com.zhang.autovideo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.zhang.autovideo.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class UserApplication02 {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication02.class, args);
	}

}
