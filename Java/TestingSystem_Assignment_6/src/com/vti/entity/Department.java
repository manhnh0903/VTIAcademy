package com.vti.entity;

public class Department {

	public int departmentID; // định danh của phòng ban (auto increment)

	public String departmentName; // tên đầy đủ của phòng ban (VD: sale, marketing, …)

	public Account[] accounts;

	public Position[] positions;

	public Department() {

	}

}
