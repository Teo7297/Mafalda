package com.support.classes;

public class LoginTokenGenerator {
	
	private static String genToken(String username) {
		String randomNumber = Integer.toString((int) (Math.random() * 100000));
		String code = randomNumber + username;
		return MD5.getMd5(code);
	}
	
	public static String getToken(String username) {
		return genToken(username);
	}
}
