package com.database.queries;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.application.mafalda.Config;
import com.database.classes.Bug;
import com.database.classes.Commit;
import com.database.classes.Feature;
import com.database.classes.Project;
import com.database.classes.User;

public class QueriesI implements Queries{
	
	private static MongoOperations mongoOperation;
	
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
		
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is("Eric"));
		List<User> users = mongoTemplate.find(query, User.class);
	}

	@Override
	public Bug[] getBugs(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feature[] getFeatures(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commit[] getCommits(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUSer(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBug(Bug bug) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFeature(Feature feature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCommit(Commit commit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBugs(int projectId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFeatures(int projectId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProject(Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCommits(int projectId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(int id, User newUser) {
		// TODO Auto-generated method stub
		
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
