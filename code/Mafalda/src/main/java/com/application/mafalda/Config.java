package com.application.mafalda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

@Configuration
public class Config {
	/*public @Bean MongoClient mongoClient() {
	       //return new MongoClient("66.119.18:27017");
		return new MongoClient("localhost");
	   }*/
	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		
		@SuppressWarnings("deprecation")
		MongoTemplate mongoTemplate = 
			new MongoTemplate(new MongoClient("localhost"),"test");
		return mongoTemplate;
		
	}
}
