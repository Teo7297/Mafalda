package com.database.queries;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.application.mafalda.Config;
import com.database.classes.Bug;
import com.database.classes.Commit;
import com.database.classes.Feature;
import com.database.classes.Project;
import com.database.classes.User;

public class QueriesI implements Queries{
	
	private static MongoOperations mongoOperation;
	private Query query;
	
	public static void connect() {
		try(
				AnnotationConfigApplicationContext ctx = 
		                new AnnotationConfigApplicationContext(Config.class);		
				){
					 mongoOperation = 
		                (MongoOperations) ctx.getBean("mongoTemplate");
					}
	}
	
	
	@Override
	public Project getProject(int projectId) {		
		query = new Query();
		query.addCriteria(Criteria.where("id").is(projectId).in("Project"));
		List<Project> result = (List<Project>) mongoOperation.find(query, Project.class);
		if (result.size() == 1){
			return result.get(0);
		}else {
			return null;
		}
	}

	@Override
	public Bug[] getBugs(int projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("id").is(projectId).in("Bug"));
		List<Bug> result = (List<Bug>) mongoOperation.find(query, Bug.class);
		return (Bug[]) result.toArray();
	}

	@Override
	public User getUser(String email) {
		query = new Query();
		query.addCriteria(Criteria.where("email").is(email).in("User"));
		List<User> result = (List<User>) mongoOperation.find(query, User.class);
		if (result.size() == 1){
			return result.get(0);
		}else {
			return null;
		}
	}
	
	@Override
	public User getUser(int id) {
		query = new Query();
		query.addCriteria(Criteria.where("id").is(id).in("User"));
		List<User> result = (List<User>) mongoOperation.find(query, User.class);
		if (result.size() == 1){
			return result.get(0);
		}else {
			return null;
		}
	}

	@Override
	public Feature[] getFeatures(int projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("id").is(projectId).in("Feature"));
		List<Feature> result = (List<Feature>) mongoOperation.find(query, Feature.class);
		return (Feature[]) result.toArray();
	}

	@Override
	public Commit[] getCommits(int projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("id").is(projectId).in("Commit"));
		List<Commit> result = (List<Commit>) mongoOperation.find(query, Commit.class);
		return (Commit[]) result.toArray();
	}

	@Override
	public void addUser(User user) {
		mongoOperation.insert(user, "User");
	}

	@Override
	public void addBug(Bug bug) {
		mongoOperation.insert(bug, "Bug");
	}

	@Override
	public void addFeature(Feature feature) {
		mongoOperation.insert(feature, "Feature");
	}

	@Override
	public void addCommit(Commit commit) {
		mongoOperation.insert(commit, "Commit");
	}

	@Override
	public void addProject(Project project) {
		mongoOperation.insert(project, "Project");		
	}

	@Override
	public void removeUser(User user) {
		mongoOperation.remove(user, "User");		
	}

	@Override
	public void removeAllBugs(int projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("id").is(projectId).in("Bug"));
		mongoOperation.findAllAndRemove(query, Bug.class);
	}

	@Override
	public void removeAllFeatures(int projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("id").is(projectId).in("Feature"));
		mongoOperation.findAllAndRemove(query, Feature.class);		
	}


	@Override
	public void removeAllCommits(int projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("id").is(projectId).in("Commit"));
		mongoOperation.findAllAndRemove(query, Commit.class);		
	}
	
	
	
	@Override
	public void removeAllProjects() {
		mongoOperation.dropCollection("Project");		 		//deletes all projects in the db, only for testing
	}															//TODO: REMOVE BEFORE RELEASE
	
	@Override
	public void removeProject(Project project) {
		mongoOperation.remove(project, "Project");
	}
	
	@Override
	public void removeBug(Bug bug) {
		mongoOperation.remove(bug, "Bug");
		
	}


	@Override
	public void removeFeature(Feature feature) {
		mongoOperation.remove(feature, "Feature");
		
	}


	@Override
	public void removeCommit(Commit commit) {
		mongoOperation.remove(commit, "Commit");
		
	}

	@Override
	public void updateUser(int id, User newUser) {
		query = new Query();
		query.addCriteria(Criteria.where("id").is(id).in("User"));
		mongoOperation.findAndReplace(query, newUser);
	}

	@Override
	public void updateBugs(int projectId, Bug[] bugs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFeatures(int projectId, Feature[] feature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProject(int projectId, Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCommits(int projectId, Commit[] commits) {
		// TODO Auto-generated method stub
		
	}


	
	
}
