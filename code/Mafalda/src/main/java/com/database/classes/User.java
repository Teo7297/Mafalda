package com.database.classes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private int id;
	
	private String username;
	private String email;
	private List<Integer> projects;
	
	public User(String username, String email) {
		this.username = username;
		this.email = email;
		this.projects = new ArrayList<>();
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
