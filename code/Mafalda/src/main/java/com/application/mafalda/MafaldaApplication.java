package com.application.mafalda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.mongodb.core.MongoOperations;

import com.database.classes.Bug;
import com.database.classes.User;

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
		
		
		
	}

}
