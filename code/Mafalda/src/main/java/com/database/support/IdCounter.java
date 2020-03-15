package com.database.support;

public class IdCounter {
	private static int counterProject=0;
	private static int counterUser=0;
	private static int counterSUser=0;
	private static int counterBug=0;
	private static int counterFeature=0;
	private static int counterCommit=0;
	private static int counterPersonnel=0;
	

	
	public static long getNewId(String type) {
		switch(type) {
		case "Project" :
			return ++counterProject;
		case "User" :
			return ++counterUser;
		case "SUser" :
			return ++counterSUser;
		case "Bug" :
			return ++counterBug;
		case "Feature" :
			return ++counterFeature;
		case "Commit" :
			return ++counterCommit;
		case "Personnel" :
			return ++counterPersonnel;
		default :
			return 0;
		
		}
		
	}
}
