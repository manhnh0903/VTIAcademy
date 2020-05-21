package com.vti.entity;

import java.util.Date;

public class Group {

	public int groupID; // định danh của nhóm (auto increment)

	public String groupName; // tên nhóm

	public Account[] accounts; // id của người tạo group

	public Date createDate; // ngày tạo group

	public Group() {

	}

	public Group(int groupID, String groupName, Date createDate) {
		super();
		this.groupID = groupID;
		this.groupName = groupName;
		this.createDate = createDate;
	}

}
