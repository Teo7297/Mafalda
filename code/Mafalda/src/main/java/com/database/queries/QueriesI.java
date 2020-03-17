package com.database.queries;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.application.mafalda.Config;
import com.database.classes.Bug;
import com.database.classes.Commit;
import com.database.classes.Feature;
import com.database.classes.LoginToken;
import com.database.classes.Project;
import com.database.classes.User;

//TODO add wrong values exceptions


/**
 * @author teo
 *
 */
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
		return mongoOperation.findById(projectId, Project.class);
	}

	@Override
	public Bug[] getBugs(ObjectId projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("projectId").is(projectId));
		List<Bug> result = (List<Bug>) mongoOperation.find(query, Bug.class);
		return result.toArray(new Bug[result.size()]);
	}

	@Override
	public User getUser(String email) {
		query = new Query();
		query.addCriteria(Criteria.where("email").is(email));
		return mongoOperation.findOne(query, User.class);	
	}

	@Override
	public User getUser(ObjectId id) {
		return mongoOperation.findById(id, User.class);
	}

	@Override
	public Feature[] getFeatures(ObjectId projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("projectId").is(projectId));
		List<Feature> result = (List<Feature>) mongoOperation.find(query, Feature.class);
		return result.toArray(new Feature[result.size()]);
	}

	@Override
	public Commit[] getCommits(ObjectId projectId) {
		query = new Query();
		query.addCriteria(Criteria.where("projectId").is(projectId));
		List<Commit> result = (List<Commit>) mongoOperation.find(query, Commit.class);
		return result.toArray(new Commit[result.size()]);
	}
	
	@Override
	public LoginToken getLoginToken(ObjectId tokenId) {
		return mongoOperation.findById(tokenId, LoginToken.class);
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
	public void addLoginToken(LoginToken loginToken) {
		mongoOperation.insert(loginToken);
		
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
		mongoOperation.remove(project);
	}

	@Override
	public void removeBug(Bug bug) {
		mongoOperation.remove(bug);

	}

	@Override
	public void removeFeature(Feature feature) {
		mongoOperation.remove(feature);

	}

	@Override
	public void removeCommit(Commit commit) {
		mongoOperation.remove(commit);

	}
	
	@Override
	public void removeLoginToken(LoginToken loginToken) {
		mongoOperation.remove(loginToken);
		
	}

	@Override
	public void updateUser(ObjectId id, User newUser) {
		// TODO add
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
	public void updateLoginToken(ObjectId tokenId, LoginToken newToken) {
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
