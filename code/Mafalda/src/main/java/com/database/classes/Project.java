package com.database.classes;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Project {
	
	@Id
	private int id;
	
	private String owner;		//username
	private String name;
	private String description;
	private List<String> referral;
	private List<Personnel> personnel;
	//private List<Bug> bugs;
	//private List<Feature> features;
	//private List<Commit> commits;
	
	public Project(
			String owner,
			String name,
			String description,
			List<String> referral,
			List<Personnel> personnel
			){
		
		this.owner = owner;
		this.name = name;
		this.description = description;
		this.referral = referral;
		this.personnel = personnel;
		//this.bugs = new ArrayList<>();
		//this.features = new ArrayList<>();
		//this.commits = new ArrayList<>();
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getReferral() {
		return referral;
	}

	public void setReferral(List<String> referral) {
		this.referral = referral;
	}

	public List<Personnel> getPersonnel() {
		return personnel;
	}

	public void setPersonnel(List<Personnel> personnel) {
		this.personnel = personnel;
	}

	/*public List<Bug> getBugs() {
		return bugs;
	}

	public void setBugs(List<Bug> bugs) {
		this.bugs = bugs;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setCommits(List<Commit> commits) {
		this.commits = commits;
	}
	
	public List<Commit> getCommits() {
		return commits;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}*/

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public String getName() {
		return name;
	}
	
	
	

}
