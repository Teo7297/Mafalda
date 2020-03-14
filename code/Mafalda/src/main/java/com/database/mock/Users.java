package com.database.mock;

import java.util.ArrayList;

import com.database.classes.User;

public class Users {
	public static ArrayList<User> users;
	
	public static void generate(int population) {
		users = new ArrayList<>();
		RandomUtils random = new RandomUtils();
		String alfabeto = "1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm_";
		for (int i = 0; i < population; i++) {
			random.randomInt(2, 3);
			users.add(new User(random.randomString(alfabeto, 8), random.randomPassword(12)));
		}
	}
}
