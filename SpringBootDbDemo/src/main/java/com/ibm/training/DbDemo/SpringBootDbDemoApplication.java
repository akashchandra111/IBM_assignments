package com.ibm.training.DbDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ibm.training.UserDb")
public class SpringBootDbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDbDemoApplication.class, args);
	}

}
