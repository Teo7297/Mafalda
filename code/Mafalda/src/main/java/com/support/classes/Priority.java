package com.support.classes;

import com.support.classes.Enums.Level;

public class Priority {
	
	private int code;
	private Level level;
	
	public Priority(Level level) {
		this.level = level;
		switch(level) {
		case LOW : 
			this.code = 01;
			break;
		case HIGH :
			this.code = 02;
			break;
		}
	}
}
