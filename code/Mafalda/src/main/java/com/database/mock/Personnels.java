package com.database.mock;

import java.util.ArrayList;
import java.util.Date;

import com.database.classes.Personnel;
import com.database.classes.User;
import com.support.classes.Enums.Role;

public class Personnels {
	public static ArrayList<Personnel> personnels;
	
	public static void generate(int population) {
		RandomUtils random = new RandomUtils();
		for (int i = 0; i < population; i++) {
			User user = random.randomElement(Users.users);
			Role role = random.randomBoolean()? Role.TESTER : Role.DEVELOPER;
			Date assignment = random.randomDate(2018, 2020, 1, 12, 1, 28);
			Personnel p = new Personnel(user, role, assignment);
			if (random.randomBoolean()) {
				p.setRemoved(random.randomDate(assignment.getYear(), assignment.getYear() + random.randomInt(3), assignment.getMonth(), 12, assignment.getDay(), 28));
			}
			personnels.add(p);
		}
	}

}
