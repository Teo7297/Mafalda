package com.application.mafalda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.database.queries.QueriesI;

/*
 * 
 * there are multiple ways to execute code here:
 * -  using @PostConstruct, executes method after dependencies injection
 * -  using CommandLineRunner, with @Bean or @Component
 * -  using ApplicationRunner, CommandLineRunner does not provide access to ApplicationArguments
 * -  using ApplicationEvent
 *   it's possible to set an order of execution of beans with @Order
 */

@SpringBootApplication
public class MafaldaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MafaldaApplication.class, args);
		QueriesI.connect(); //creates database query controller
		
	}

}
