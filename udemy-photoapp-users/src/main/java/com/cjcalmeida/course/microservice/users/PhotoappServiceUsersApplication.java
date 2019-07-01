package com.cjcalmeida.course.microservice.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoappServiceUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoappServiceUsersApplication.class, args);
	}

}
