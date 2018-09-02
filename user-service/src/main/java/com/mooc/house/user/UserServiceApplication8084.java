package com.mooc.house.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
//@EnableSwagger2
public class UserServiceApplication8084 {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication8084.class, args);
	}
}
