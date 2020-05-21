package com.vti.entity;

public class Position {

	public int positionID; // định danh của chức vụ (auto increment)

	public String positionName; // tên chức vụ (Dev, Test, Scrum Master, PM)

	public Position() {

	}

	public Position(int positionID, String positionName) {
		super();
		this.positionID = positionID;
		this.positionName = positionName;
	}

}
