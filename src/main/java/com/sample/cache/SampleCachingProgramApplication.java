package com.sample.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SampleCachingProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleCachingProgramApplication.class, args);
	}

}
