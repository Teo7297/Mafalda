package com.database.mock;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.database.classes.Personnel;
import com.database.classes.User;
import com.support.classes.Enums.Role;

public class Personnels {
	public static ArrayList<Personnel> personnels;
	
	public static void generate(int population) {
		personnels = new ArrayList<>();
		RandomUtils random = new RandomUtils();
		for (int i = 0; i < population; i++) {
			User user = random.randomElement(Users.users);
			Role role = random.randomBoolean()? Role.TESTER : Role.DEVELOPER;
			Date assignment = random.randomDate(2018, 2020, 1, 12, 1, 28);
			Personnel p = new Personnel(user.getUsername(), role, assignment);
			if (random.randomBoolean()) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(assignment);
				p.setRemoved(random.randomDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.YEAR) + random.randomInt(3), calendar.get(Calendar.MONTH), 12, calendar.get(Calendar.DAY_OF_MONTH), 28));
			}
			personnels.add(p);
		}
	}

}
