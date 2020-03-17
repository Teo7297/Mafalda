package com.functions_tests;

import java.util.Date;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.database.classes.Bug;
import com.database.classes.Feature;
import com.database.classes.Personnel;
import com.database.classes.Project;
import com.database.classes.SUser;
import com.database.classes.User;
import com.database.mock.Personnels;
import com.database.mock.Projects;
import com.database.mock.Users;
import com.database.queries.QueriesI;
import com.support.classes.Enums.Priority;
import com.support.classes.Enums.State;

/*
 * 
 * there are multiple ways to execute code here:
 * -  using @PostConstruct, executes method after dependencies injection
 * -  using CommandLineRunner, with @Bean or @Component
 * -  using ApplicationRunner, CommandLineRunner does not provide access to ApplicationArguments
 * -  using ApplicationEvent
 *   it's possible to set an order of execution of beans with @Order
 */

@SpringBootApplication
public class MafaldaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MafaldaApplication.class, args);
		QueriesI.connect(); //creates database query controller
		
		QueriesI database = new QueriesI();
		database.dropCollection("user");
		database.dropCollection("project");
		database.dropCollection("bug");
		database.dropCollection("feature");
		
		/*Users.generate(100);
		Personnels.generate(20);
		Projects.generate(5);
		for (User u : Users.users)
			database.addUser(u);
		for (Project p : Projects.projects) {
			database.addProject(p);
		}*/
		
		
		Project project = new Project("", "", "", new ArrayList<String>(), new ArrayList<Personnel>());
		Bug bug = new Bug(Priority.HIGH, new ArrayList<String>(), "", "", new Date(), false, "", new User("myName", "myEmail").getUsername(), new ArrayList<Integer>(), new ArrayList<String>(), new ArrayList<Integer>(), State.OPEN, project.getId());
		Feature feature = new Feature(Priority.HIGH, "", "", new Date(), false, new Date(), new ArrayList<Integer>(), new ArrayList<Integer>(), State.CLOSED, project.getId());
		
		database.addProject(project);
		database.addBug(bug);
		database.addFeature(feature);
		
		System.out.println(database.getProject(project.getId()));
		
		System.out.println(database.getBugs(project.getId()));
		
		database.removeProject(project);
		
		System.out.println(database.getUser("notValid"));

	}

}