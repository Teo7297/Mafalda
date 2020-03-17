package com.database.classes;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import com.database.queries.QueriesI;

//created during user registration

public class SUser {
	@Id
	private ObjectId id;
	
	private String username;
	private String password;
	private String email;
	
	public SUser(String username, String password, String email) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.id = new ObjectId();
	
		//create User and add it to main db
		User user = new User(username, email);
		QueriesI query = new QueriesI();
		query.addUser(user);
	}
	public ObjectId getId() {
		return id;
	}
	
}