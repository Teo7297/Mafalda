package com.database.classes;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.support.classes.Priority;
import com.support.classes.Enums.State;

public class Bug {
	
	@Id
	private int id;
	
	private Priority priority;
	private List<String> tags;
	private String description;
	private String steps;
	private Date registration;
	private boolean visible;
	private String branch;
	private String username;
	private List<Personnel> maintainers;
	private List<String> interested;
	private List<Commit> history;
	private State state;
	
	public Bug( 
			 Priority priority,
			 List<String> tags,
			 String description,
			 String steps,
			 Date registration,
			 boolean visible,
			 String branch,
			 User user,
			 List<Personnel> maintainers,
			 List<String> interested,
			 List<Commit> history,
			 State state) {
		
		this.priority = priority;
		this.tags = tags;
		this.description = description;
		this.steps = steps;
		this.registration = registration;
		this.visible = visible;
		this.branch = branch;
		this.username = user.getUsername();
		this.maintainers = maintainers;
		this.interested = interested;
		this.history = history;
		this.state = state;
		
	}
}
