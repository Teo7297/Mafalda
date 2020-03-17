package com.database.queries;

import java.util.List;

import org.bson.types.ObjectId;
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

//TODO add wrong values exceptions


public class QueriesI implements Queries {

	private static MongoOperations mongoOperation;
	private Query query;

	public static void connect() {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {
			mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		}
	}

	@Override
	public Project getProject(ObjectId projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("_id").is(projectId));
		List<Project> result = (List<Project>) mongoOperation.find(query, Project.class);
		if (result.size() == 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

	@Override
	public Bug[] getBugs(ObjectId projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("projectId").is(projectId));
		List<Bug> result = (List<Bug>) mongoOperation.find(query, Bug.class);
		Bug[] resArray = new Bug[result.size()]; 
		return result.toArray(resArray);
	}

	@Override
	public User getUser(String email) {
		query = new Query();
		query.addCriteria(Criteria.where("email").is(email));
		List<User> result = (List<User>) mongoOperation.find(query, User.class);
		if (result.size() == 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

	@Override
	public User getUser(ObjectId id) {
		query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		List<User> result = (List<User>) mongoOperation.find(query, User.class);
		if (result.size() == 1) {
			return result.get(0);
		} else {
			return null;
		}
	}

	@Override
	public Feature[] getFeatures(ObjectId projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("_id").is(projectId));
		List<Feature> result = (List<Feature>) mongoOperation.find(query, Feature.class);
		Feature[] resArray = new Feature[result.size()];
		return result.toArray(resArray);
	}

	@Override
	public Commit[] getCommits(ObjectId projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("_id").is(projectId));
		List<Commit> result = (List<Commit>) mongoOperation.find(query, Commit.class);
		Commit[] resArray = new Commit[result.size()];
		return result.toArray(resArray);
	}

	@Override
	public void addUser(User user) {
		mongoOperation.insert(user);
	}

	@Override
	public void addBug(Bug bug) {
		mongoOperation.insert(bug);
	}

	@Override
	public void addFeature(Feature feature) {
		mongoOperation.insert(feature);
	}

	@Override
	public void addCommit(Commit commit) {
		mongoOperation.insert(commit);
	}

	@Override
	public void addProject(Project project) {
		mongoOperation.insert(project);
	}

	@Override
	public void removeUser(User user) {
		mongoOperation.remove(user);
	}

	@Override
	public void removeAllBugs(ObjectId projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("projectId").is(projectId));
		mongoOperation.findAllAndRemove(query, Bug.class);
	}

	@Override
	public void removeAllFeatures(ObjectId projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("projectId").is(projectId));
		mongoOperation.findAllAndRemove(query, Feature.class);
	}

	@Override
	public void removeAllCommits(ObjectId projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("projectId").is(projectId));
		mongoOperation.findAllAndRemove(query, Commit.class);
	}

	@Override
	public void removeProject(Project project) {
		mongoOperation.remove(project, "project");
	}

	@Override
	public void removeBug(Bug bug) {
		mongoOperation.remove(bug, "bug");

	}

	@Override
	public void removeFeature(Feature feature) {
		mongoOperation.remove(feature, "feature");

	}

	@Override
	public void removeCommit(Commit commit) {
		mongoOperation.remove(commit, "commit");

	}

	@Override
	public void updateUser(ObjectId id, User newUser) {
		query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		mongoOperation.findAndReplace(query, newUser);
	}

	@Override
	public void updateBugs(ObjectId projectId, Bug[] bugs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFeatures(ObjectId projectId, Feature[] feature) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProject(ObjectId projectId, Project project) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCommits(ObjectId projectId, Commit[] commits) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dropCollection(Class<?> cls) {
		mongoOperation.dropCollection(cls);
	}
	
	@Override
	public void dropCollection(String collectionName) {
		mongoOperation.dropCollection(collectionName);
	}

}
