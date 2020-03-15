package com.database.classes;

import java.util.Date;
import org.springframework.data.annotation.Id;
import com.support.classes.Enums.Priority;

public class Commit {
	
	@Id
	private int id;
	
	private String username;
	private String message;
	private Priority priority;
	private Date date;
	
	public Commit(
			String username,
			String message,
			Priority priority,
			Date date) {
		
		this.username = username;
		this.message = message;
		this.priority = priority;
		this.date = date;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public String getMessage() {
		return message;
	}

	public Priority getPriority() {
		return priority;
	}

	public Date getDate() {
		return date;
	}
	
	
}
