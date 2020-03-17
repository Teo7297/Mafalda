package com.database.classes;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.support.classes.LoginTokenGenerator;;

/**
 * @author teo
 *
 */
@Document
public class LoginToken {
	
	@Id
	private ObjectId id;
	
	@Indexed(name="expirationIndex", expireAfterSeconds=7200) //set to 2 hours //document expires and is deleted from db after X seconds starting from the date value
	private Date expiration;
	
	private String token;
	private String username;
	
	/**
	 * 
	 * @param username
	 */
	public LoginToken(String username) {
		this.token = LoginTokenGenerator.getToken(username);
		this.username = username;
		this.id = new ObjectId();
		this.expiration = new Date();
		
	}
	
	//getters
	public String getToken() {
		return token;
	}

	public Date getExpiration() {
		return expiration;
	}

	public ObjectId getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	
	
}
