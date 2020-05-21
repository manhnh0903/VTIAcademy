package com.vti.entity;

import java.util.Date;

public class Account {

	public int accountID; // định danh của User (auto increment)

	public String email;

	public String userName;

	public String fullName;

	public Gender gender;
	
	public int age;

	public Date createDate; // ngày tạo tài khoản

	public Group[] groups;

	public Department department; // phòng ban của user trong hệ thống

	public Position position; // chức vụ của User

	@Override
	public String toString() {

		String result = "";

		result += "ID: " + accountID + "\n";
		result += "email: " + email + "\n";
		result += "userName: " + userName + "\n";
		result += "fullName: " + fullName + "\n";
		result += "gender: " + gender + "\n";
		result += "createDate: " + createDate + "\n";
		result += "group: " + AccountUtil.belongToGroupCount(accountID) + "\n";
		result += "department: " + department.departmentName + "\n";
		result += "position: " + position.positionName + "\n";

		return result;
	}

	public Account() {

	}

	public Account(int accountID, String userName) {
		super();
		this.accountID = accountID;
		this.userName = userName;
	}

	
	
}
