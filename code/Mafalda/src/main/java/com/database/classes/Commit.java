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
<<<<<<< HEAD

	public int getId() {
		return id;
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
	
	
=======
>>>>>>> 130f2bd6133cd3d82cf1246584a703deddb91ec7
}
