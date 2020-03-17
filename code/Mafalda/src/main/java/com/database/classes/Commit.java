package com.database.classes;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.support.classes.Enums.Priority;

/**
 * @author teo
 *
 */
@Document
public class Commit {
	
	@Id
	private ObjectId id;
	
	private String username;
	private String message;
	private Priority priority;
	private Date date;
	private ObjectId projectId; 
	
	/**
	 * @param username
	 * @param message
	 * @param priority
	 * @param date
	 * @param projectId
	 */
	public Commit(
			String username,
			String message,
			Priority priority,
			Date date,
			ObjectId projectId) {
		
		this.username = username;
		this.message = message;
		this.priority = priority;
		this.date = date;
		this.projectId = projectId;
		this.id = new ObjectId();
	}

	public ObjectId getId() {
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
	
	
}
