package com.database.login;

import com.database.classes.SUser;

public interface UsersQueries {
	public SUser getSUser(String email);
	public void addSUser(SUser user);
	public void removeSUser(SUser user);
}
