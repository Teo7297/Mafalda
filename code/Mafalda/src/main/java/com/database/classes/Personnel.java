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
	
	public Personnel(User user, Role role, Date assignment, Date removed) {
		this.username = user.getUsername();
		this.role = role;
		this.assignment = assignment;
		this.removed = removed;
	}
}
