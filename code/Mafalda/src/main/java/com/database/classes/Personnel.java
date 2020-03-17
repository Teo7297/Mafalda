package com.database.classes;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import com.support.classes.Enums.Role;

public class Personnel {
	
	@Id
	private ObjectId id;
	
	private String username;
	private Role role;
	private Date assignment;
	private Date removed;
	
	public Personnel(String username, Role role, Date assignment) {
		this.username = username;
		this.role = role;
		this.assignment = assignment;
		this.id = new ObjectId();
	}
	
	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Date getRemoved() {
		return removed;
	}

	public void setRemoved(Date removed) {
		this.removed = removed;
	}

	public ObjectId getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public Date getAssignment() {
		return assignment;
	}
	
	
}
