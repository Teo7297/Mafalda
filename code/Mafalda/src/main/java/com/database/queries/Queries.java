package com.database.queries;

import org.bson.types.ObjectId;

import com.database.classes.Bug;
import com.database.classes.Commit;
import com.database.classes.Feature;
import com.database.classes.LoginToken;
import com.database.classes.Project;
import com.database.classes.User;

/**
 * @author teo
 *
 */

public interface Queries {
	//getters
	/**
	 * @param projectId
	 * @return the specified Project object
	 */
	public Project getProject(ObjectId projectId);
	/**
	 * @param projectId
	 * @return an Array of Bug objects stored with the referring project ID
	 */
	public Bug[] getBugs(ObjectId projectId);
	/**
	 * @param email
	 * @return the User with the specified email
	 */
	public User getUser(String email);
	/**
	 * @param id
	 * @return the User with the specified ID 
	 */
	public User getUser(ObjectId id);
	/**
	 * @param projectId
	 * @return an Array of Feature objects
	 */
	public Feature[] getFeatures(ObjectId projectId);
	/**
	 * @param projectId
	 * @return an Array of Commit objects
	 */
	public Commit[] getCommits(ObjectId projectId);
	/**
	 * @param tokenId
	 * @return the specified token
	 */
	public LoginToken getLoginToken(ObjectId tokenId);

	//setters
	/**
	 * @param user
	 */
	public void addUser(User user);
	/**
	 * @param bug
	 */
	public void addBug(Bug bug);
	/**
	 * @param feature
	 */
	public void addFeature(Feature feature);
	/**
	 * @param commit
	 */
	public void addCommit(Commit commit);
	/**
	 * @param project
	 */
	public void addProject(Project project);
	/**
	 * @param loginToken
	 */
	public void addLoginToken(LoginToken loginToken);
	
	//removers
	/**
	 * @param user
	 */
	public void removeUser(User user);
	/**
	 * @param projectId
	 */
	public void removeAllBugs(ObjectId projectId);
	/**
	 * @param bug
	 */
	public void removeBug(Bug bug);
	/**
	 * @param projectId
	 */
	public void removeAllFeatures(ObjectId projectId);
	/**
	 * @param feature
	 */
	public void removeFeature(Feature feature);
	/**
	 * @param project
	 */
	public void removeProject(Project project);
	/**
	 * @param projectId
	 */
	public void removeAllCommits(ObjectId projectId);
	/**
	 * @param commit
	 */
	public void removeCommit(Commit commit);
	/**
	 * @param loginToken
	 */
	public void removeLoginToken(LoginToken loginToken);
	
	//updaters
	/**
	 * @param id
	 * @param newUser
	 */
	public void updateUser(ObjectId id, User newUser);
	/**
	 * @param projectId
	 * @param bugs
	 */
	public void updateBugs(ObjectId projectId, Bug[] bugs);
	/**
	 * @param projectId
	 * @param feature
	 */
	public void updateFeatures(ObjectId projectId, Feature[] feature);
	/**
	 * @param projectId
	 * @param project
	 */
	public void updateProject(ObjectId projectId, Project project);
	/**
	 * @param projectId
	 * @param commits
	 */
	public void updateCommits(ObjectId projectId, Commit[] commits);
	/**
	 * @param tokenId
	 * @param newToken
	 */
	public void updateLoginToken(ObjectId tokenId, LoginToken newToken);
	
	//drop collections
	/**
	 * @param cls
	 */
	public void dropCollection(Class<?> cls);
	/**
	 * @param collectionName
	 */
	public void dropCollection(String collectionName);
	
}
