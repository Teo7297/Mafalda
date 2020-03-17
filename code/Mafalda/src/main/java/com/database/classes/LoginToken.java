package com.database.classes;

import java.util.Date;

import com.support.classes.LoginTokenGenerator;;

/**
 * @author teo
 *
 */
public class LoginToken {
	
	private String token;
	private Date expiration;
	
	private Date halfHour() {
		return new Date(new Date().getTime() + 1800000);	// expires in 30 minutes
	}
	
	//public constructor
	/**
	 * 
	 * @param username
	 */
	public LoginToken(String username) {
		this.token = LoginTokenGenerator.getToken(username);
		this.expiration = halfHour();  
	}
	
	//refresh expiration date (should be every time the user interacts with something)
	public void refreshExpirationDate() {
		this.expiration = halfHour();
	}

	
	//getters
	public String getToken() {
		return token;
	}

	public Date getExpiration() {
		return expiration;
	}
	
	
	
	
}
