package com.functions_tests;

import com.support.classes.LoginTokenGenerator;

public class TestTokenGen {
	public static void main(String[] args) {
		System.out.println(LoginTokenGenerator.getToken("name"));
	}
}
