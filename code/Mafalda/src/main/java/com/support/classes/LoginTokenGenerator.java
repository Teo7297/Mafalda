package com.support.classes;

/**
 * @author teo
 *
 */
public class LoginTokenGenerator {
	
	/**
	 * @param username
	 * @return the generated token
	 */
	public static String getToken(String username) {
		String randomNumber = Integer.toString((int) (Math.random() * 100000));
		String code = randomNumber + username;
		return MD5.getMd5(code);
	}
}
