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
}
