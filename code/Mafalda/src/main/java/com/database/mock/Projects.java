package com.database.mock;

import java.util.ArrayList;

import com.database.classes.Personnel;
import com.database.classes.Project;
import com.database.classes.User;

public class Projects {
	public static ArrayList<Project> projects;
	
	public static void generate(int population) {
		projects = new ArrayList<>();
		RandomUtils random = new RandomUtils();
		for (int i = 0; i < population; i++) {
			User owner = random.randomElement(Users.users);
			String name = random.randomElement(new String[] {"prova", "test", "aahahahahahah"});
			String description = random.randomString(random.randomInt(10, 100));
			ArrayList<String> referral = new ArrayList<>();
			ArrayList<Personnel> personnel = new ArrayList<>();
			for (int j = 0; j < random.randomInt(2); j++) {
				personnel.add(random.randomElement(Personnels.personnels));
			}
			Project p = new Project(owner.getUsername(), name, description, referral, personnel);
			projects.add(p);
		}
	}

}
