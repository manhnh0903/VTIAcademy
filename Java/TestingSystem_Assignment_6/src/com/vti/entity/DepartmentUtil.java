package com.vti.entity;

import java.util.Random;

public class DepartmentUtil {

	public static Department getRandomDepartment(int max) {
		Department[] departments = getDepartments();
		
		// Lay chi so cua mot phan tu bat ky
		Random random = new Random();
		int i = random.nextInt(max); // 0..5
		
		// Tra ve phan tu co stt i trong Array Department
		return departments[i];
	}
	
	public static Department[] getDepartments() {
		Department[] departments = new Department[6];
		
		departments[0] = new Department();
		departments[0].departmentID = 1;
		departments[0].departmentName = "Sale";

		departments[1] = new Department();
		departments[1].departmentID = 2;
		departments[1].departmentName = "Marketing";

		departments[2] = new Department();
		departments[2].departmentID = 3;
		departments[2].departmentName = "Administration";

		departments[3] = new Department();
		departments[3].departmentID = 4;
		departments[3].departmentName = "Human Resources";

		departments[4] = new Department();
		departments[4].departmentID = 5;
		departments[4].departmentName = "Training";

		departments[5] = new Department();
		departments[5].departmentID = 6;
		departments[5].departmentName = "Accounting";
		
		return departments;
	}
}
