package com.functions_tests;

import com.database.support.IdCounter;

public class TestIdCounter {
	public static void main(String[] args) {
		
		System.out.println(IdCounter.getNewId("Project"));
		System.out.println(IdCounter.getNewId("Project"));
		System.out.println(IdCounter.getNewId("Project"));
		System.out.println(IdCounter.getNewId("Project"));
		System.out.println(IdCounter.getNewId("Project"));
	}
}
