package com.database.classes;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.support.classes.Enums.Priority;
import com.support.classes.Enums.State;

/**
 * @author teo
 *
 */
@Document
public class Feature {
	
	@Id
	private ObjectId id;
	
	private Priority priority;
	private String description;
	private String username;
	private Date registration;
	private boolean visible;
	private Date deployment;
	private List<Integer> personnelIds;
	private List<Integer> commitsIds;
	private State state;
	private ObjectId projectId;
	
	
	/**
	 * @param priority
	 * @param description
	 * @param username
	 * @param registration
	 * @param visible
	 * @param deployment
	 * @param personnelIds
	 * @param commitsIds
	 * @param state
	 * @param projectId
	 */
	public Feature(
			Priority priority,
			String description,
			String username,
			Date registration,
			boolean visible,
			Date deployment,
			List<Integer> personnelIds,
			List<Integer> commitsIds,
			State state,
			ObjectId projectId) {
		
		this.priority = priority;
		this.description = description;
		this.username = username;
		this.registration = registration;
		this.visible = visible;
		this.deployment = deployment;
		this.personnelIds = personnelIds;
		this.commitsIds = commitsIds;
		this.state = state;
		this.projectId = projectId;
		this.id = new ObjectId();
		
	}


	
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

	public List<Integer> getDevelopers() {
		return personnelIds;
	}

	public void setDevelopers(List<Integer> developers) {
		this.personnelIds = developers;
	}

	public List<Integer> getHistory() {
		return commitsIds;
	}

	public void setHistory(List<Integer> history) {
		this.commitsIds = history;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public ObjectId getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public Date getRegistration() {
		return registration;
	}
	public ObjectId getProjectId() {
		return projectId;
	}
	

}
