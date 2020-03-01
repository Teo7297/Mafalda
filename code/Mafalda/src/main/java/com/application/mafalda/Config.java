package com.application.mafalda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;

@Configuration
public class Config {
	public @Bean MongoClient mongoClient() {
	       return new MongoClient("66.119.18:27017");
	   }
}
