package com.database.classes;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.support.classes.Priority;
import com.support.classes.Enums.State;

public class Feature {
	
	@Id
	private int id;
	
	private Priority priority;
	private String description;
	private String username;
	private Date registration;
	private boolean visible;
	private Date deployment;
	private List<Personnel> developers;
	private List<Commit> history;
	private State state;
	
	public Feature(
			Priority priority,
			String description,
			User user,
			Date registration,
			boolean visible,
			Date deployment,
			List<Personnel> developers,
			List<Commit> history,
			State state) {
		
		this.priority = priority;
		this.description = description;
		this.username = user.getUsername;
		this.registration = registration;
		this.visible = visible;
		this.deployment = deployment;
		this.developers = developers;
		this.history = history;
		this.state = state;
	}
}
