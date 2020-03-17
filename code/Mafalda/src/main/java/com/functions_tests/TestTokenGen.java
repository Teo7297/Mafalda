package com.functions_tests;

import com.database.classes.LoginToken;
import com.support.classes.LoginTokenGenerator;

public class TestTokenGen {
	public static void main(String[] args) {
		LoginToken t = new LoginToken("name");
		System.out.println(t.getExpiration());
	}
}
