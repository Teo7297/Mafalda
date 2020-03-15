package com.database.classes;

import java.util.Date;
import org.springframework.data.annotation.Id;
import com.support.classes.Enums.Role;

public class Personnel {
	
	@Id
	private int id;
	
	private String username;
	private Role role;
	private Date assignment;
	private Date removed;
	
	public Personnel(String username, Role role, Date assignment) {
		this.username = username;
		this.role = role;
		this.assignment = assignment;
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

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public Date getAssignment() {
		return assignment;
	}
	
	
}
