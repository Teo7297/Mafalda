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
<<<<<<< HEAD
		this.username = user.getUsername();
=======
		this.username = user.getUsername;
>>>>>>> 130f2bd6133cd3d82cf1246584a703deddb91ec7
		this.registration = registration;
		this.visible = visible;
		this.deployment = deployment;
		this.developers = developers;
		this.history = history;
		this.state = state;
	}
<<<<<<< HEAD

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public Date getDeployment() {
		return deployment;
	}

	public void setDeployment(Date deployment) {
		this.deployment = deployment;
	}

	public List<Personnel> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Personnel> developers) {
		this.developers = developers;
	}

	public List<Commit> getHistory() {
		return history;
	}

	public void setHistory(List<Commit> history) {
		this.history = history;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public Date getRegistration() {
		return registration;
	}
	
	
=======
>>>>>>> 130f2bd6133cd3d82cf1246584a703deddb91ec7
}
