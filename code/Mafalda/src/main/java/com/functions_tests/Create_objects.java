package com.functions_tests;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class Create_objects {

	public static void main(String[] args) {
		SpringApplication.run(Create_objects.class, args);
	}
	
	@PostConstruct
    public void init(){
		//add init method
    }

}
