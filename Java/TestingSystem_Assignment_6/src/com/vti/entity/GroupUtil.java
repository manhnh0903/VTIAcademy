package com.vti.entity;


import java.util.Date;
import java.util.Random;

public class GroupUtil {

	public static Group getRandomGroup(int max) {
		Group[] groups = getGroups();

		// Lay chi so cua mot phan tu bat ky
		Random random = new Random();
		int i = random.nextInt(max); // 0..5

		// Tra ve phan tu co stt i trong Array Department
		return groups[i];
	}

	public static Group[] getGroups() {
		Group[] groups = new Group[5];

		groups[0] = new Group();
		groups[0].groupID = 1;
		groups[0].groupName = "nhom java";
		groups[0].createDate = new Date();

		groups[1] = new Group();
		groups[1].groupID = 124;
		groups[1].groupName = "nhom mysql";
		groups[1].createDate = new Date();

		groups[2] = new Group();
		groups[2].groupID = 125;
		groups[2].groupName = "nhom C++";
		groups[2].createDate = new Date();

		groups[3] = new Group();
		groups[3].groupID = 126;
		groups[3].groupName = "nhom tu hoc";
		groups[3].createDate = new Date();

		groups[4] = new Group();
		groups[4].groupID = 112;
		groups[4].groupName = "nhom database";
		groups[4].createDate = new Date();
	
	
		Account[] accounts = AccountUtil.getAccounts();
		for (int i = 0; i < groups.length; i++) {
			// Random số lượng account trong mỗi group
			Random random = new Random();
			int accountNum = random.nextInt(10);
			groups[i].accounts = new Account[accountNum];

			// Lấy random account theo số lượng ở trên
			for (int j = 0; j < accountNum; j++) {
				int accountNo = random.nextInt(10);
				groups[i].accounts[j] = accounts[accountNo];
			}
		}

		return groups;
	}

}