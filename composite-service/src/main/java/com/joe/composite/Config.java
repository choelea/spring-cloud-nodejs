package com.joe.composite;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
	
}
