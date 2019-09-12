package com.wzl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class EurekserverproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekserverproviderApplication.class, args);
	}

}
