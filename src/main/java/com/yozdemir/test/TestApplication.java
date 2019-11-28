package com.yozdemir.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;

import com.yozdemir.app.Application;

@SpringBootApplication(scanBasePackages= {"com.yozdemir.test.service","com.yozdemir.test.service", "com.yozdemir.test.service.crud"})
@ComponentScan(basePackages= {"com.yozdemir.test"})
@ContextConfiguration(classes = {Application.class })
@Import({ Application.class})
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
}
