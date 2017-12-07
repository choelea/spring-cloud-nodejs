package com.joe.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerPeer1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerPeer1Application.class, args);
	}
}
