package com.joe.springapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SpringApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApigatewayApplication.class, args);
	}
	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
}
