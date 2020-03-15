package com.database.queries;

import com.database.classes.Bug;
import com.database.classes.Commit;
import com.database.classes.Feature;
import com.database.classes.Project;
import com.database.classes.User;

public interface Queries {
	//getters
	public Project getProject(int projectId);
	public Bug[] getBugs(int projectId);
	public User getUser(String email);
	public User getUser(int id);
	public Feature[] getFeatures(int projectId);
	public Commit[] getCommits(int projectId);

	//setters
	public void addUser(User user);
	public void addBug(Bug bug);
	public void addFeature(Feature feature);
	public void addCommit(Commit commit);
	public void addProject(Project project);
	
	//removers
	public void removeUser(User user);
	public void removeAllBugs(int projectId);
	public void removeBug(Bug bug);
	public void removeAllFeatures(int projectId);
	public void removeAllProjects();
	public void removeFeature(Feature feature);
	public void removeProject(Project project);
	public void removeAllCommits(int projectId);
	public void removeCommit(Commit commit);
	
	//updaters
	public void updateUser(int id, User newUser);
	public void updateBugs(int projectId, Bug[] bugs);
	public void updateFeatures(int projectId, Feature[] feature);
	public void updateProject(int projectId, Project project);
	public void updateCommits(int projectId, Commit[] commits);
	
	public void dropCollection(Class<?> cls);
	
}
