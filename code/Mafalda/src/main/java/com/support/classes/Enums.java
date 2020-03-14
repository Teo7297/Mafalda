package com.support.classes;

public class Enums {
	public enum Role{
		TESTER,
		DEVELOPER,
		OWNER
	}
	public enum State{
		OPEN,
		CLOSED
	}
	public enum Level{
		HIGH,
		LOW
	}
	
	public enum Priority {
		HIGH(2),
		LOW(1);
		
		private int code;
		
		private Priority(int code) {
			this.code = code;
		}
	}
	
	public enum ErrorCode{
		//add error codes
	}
	
}
