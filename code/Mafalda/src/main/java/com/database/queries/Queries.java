package com.database.queries;

import org.bson.types.ObjectId;

import com.database.classes.Bug;
import com.database.classes.Commit;
import com.database.classes.Feature;
import com.database.classes.Project;
import com.database.classes.User;

public interface Queries {
	//getters
	public Project getProject(ObjectId projectId);
	public Bug[] getBugs(ObjectId projectId);
	public User getUser(String email);
	public User getUser(ObjectId id);
	public Feature[] getFeatures(ObjectId projectId);
	public Commit[] getCommits(ObjectId projectId);

	//setters
	public void addUser(User user);
	public void addBug(Bug bug);
	public void addFeature(Feature feature);
	public void addCommit(Commit commit);
	public void addProject(Project project);
	
	//removers
	public void removeUser(User user);
	public void removeAllBugs(ObjectId projectId);
	public void removeBug(Bug bug);
	public void removeAllFeatures(ObjectId projectId);
	public void removeFeature(Feature feature);
	public void removeProject(Project project);
	public void removeAllCommits(ObjectId projectId);
	public void removeCommit(Commit commit);
	
	//updaters
	public void updateUser(ObjectId id, User newUser);
	public void updateBugs(ObjectId projectId, Bug[] bugs);
	public void updateFeatures(ObjectId projectId, Feature[] feature);
	public void updateProject(ObjectId projectId, Project project);
	public void updateCommits(ObjectId projectId, Commit[] commits);
	
	public void dropCollection(Class<?> cls);
	public void dropCollection(String collectionName);
	
}
