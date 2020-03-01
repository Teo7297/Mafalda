package com.database.classes;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Project {
	
	@Id
	private int id;
	
	private String owner;
	private String name;
	private String description;
	private List<String> referral;
	private List<Personnel> personnel;
	private List<Bug> bugs;
	private List<Feature> features;
	
	public Project(
			User owner,
			String name,
			String description,
			List<String> referral,
			List<Personnel> personnel,
			List<Bug> bugs,
			List<Feature> features){
		
		this.owner = owner.getUsername();
		this.name = name;
		this.description = description;
		this.referral = referral;
		this.personnel = personnel;
		this.bugs = bugs;
		this.features = features;
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

	public List<Bug> getBugs() {
		return bugs;
	}

	public void setBugs(List<Bug> bugs) {
		this.bugs = bugs;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public int getId() {
		return id;
	}

	public String getOwner() {
		return owner;
	}

	public String getName() {
		return name;
	}
	
	
}
