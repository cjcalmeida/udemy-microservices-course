package com.cjcalmeida.course.microservice.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoappServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoappServiceDiscoveryApplication.class, args);
	}

}
