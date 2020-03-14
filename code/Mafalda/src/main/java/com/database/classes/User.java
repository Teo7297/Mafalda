package com.database.classes;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String username;
	private String email;
	private List<Project> projects;
	
	public User(String username, String email) {
		this.username = username;
		this.email = email;
		this.projects = new ArrayList<>();
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void addProject(Project project) {
		projects.add(project);
	}
	
	public void removeProject(Project project) {
		projects.remove(project);
	}

}
