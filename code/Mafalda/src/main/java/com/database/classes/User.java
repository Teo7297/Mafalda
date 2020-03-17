package com.database.classes;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * @author teo
 *
 */
public class User {

	@Id
	private ObjectId id;
	
	private String username;
	private String email;
	private List<Integer> projects;
	
	/**
	 * @param username
	 * @param email
	 */
	public User(String username, String email) {
		this.username = username;
		this.email = email;
		this.projects = new ArrayList<>();
		this.id = new ObjectId();
	}
	
	public ObjectId getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void addProject(int projectId) {
		projects.add(projectId);
	}
	
	public void removeProject(int projectId) {
		projects.remove(projectId);
	}

}
