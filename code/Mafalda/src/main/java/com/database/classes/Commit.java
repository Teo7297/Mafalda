package com.database.classes;

import java.util.Date;
import org.springframework.data.annotation.Id;
import com.support.classes.Priority;

public class Commit {
	
	@Id
	private int id;
	
	private String username;
	private String message;
	private Priority priority;
	private Date date;
	
	public Commit(
			User user,
			String message,
			Priority priority,
			Date date) {
		
		this.username = user.getUsername();
		this.message = message;
		this.priority = priority;
		this.date = date;
	}
}
