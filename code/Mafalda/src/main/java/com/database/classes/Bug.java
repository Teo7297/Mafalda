package com.database.classes;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import com.support.classes.Enums.Priority;
import com.support.classes.Enums.State;

public class Bug {
	
	@Id
	private ObjectId id;
	
	private Priority priority;
	private List<String> tags;
	private String description;
	private String steps;
	private Date registration;
	private boolean visible;
	private String branch;
	private String username;
	private List<Integer> personnelIds;
	private List<String> interested;
	private List<Integer> commitIds;
	private State state;
	private ObjectId projectId;
	
	public Bug( 
			 Priority priority,
			 List<String> tags,
			 String description,
			 String steps,
			 Date registration,
			 boolean visible,
			 String branch,
			 String username,
			 List<Integer> personnelIds,
			 List<String> interested,
			 List<Integer> commitIds,
			 State state,
			 ObjectId projectId) {
		
		this.priority = priority;
		this.tags = tags;
		this.description = description;
		this.steps = steps;
		this.registration = registration;
		this.visible = visible;
		this.branch = branch;
		this.username = username;
		this.personnelIds = personnelIds;
		this.interested = interested;
		this.commitIds = commitIds;
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

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSteps() {
		return steps;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<Integer> getMaintainers() {
		return personnelIds;
	}

	public void setMaintainers(List<Integer> personnelIds) {
		this.personnelIds = personnelIds;
	}

	public List<String> getInterested() {
		return interested;
	}

	public void setInterested(List<String> interested) {
		this.interested = interested;
	}

	public List<Integer> getHistory() {
		return commitIds;
	}

	public void setHistory(List<Integer> commitIds) {
		this.commitIds = commitIds;
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

	public Date getRegistration() {
		return registration;
	}

	public String getUsername() {
		return username;
	}
	public ObjectId getProjectId() {
		return projectId;
	}
}
