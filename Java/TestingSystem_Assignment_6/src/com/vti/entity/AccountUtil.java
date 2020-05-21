package com.vti.entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class AccountUtil {

	public static Account[] getAccounts() {
		Account[] result = new Account[20];

		for (int i = 0; i < result.length; i++) {
			result[i] = new Account();
			result[i].accountID = (i + 1);
			result[i].email = "email" + (i + 1) + "@gmail.com";
			result[i].userName = "Account" + (i + 1);
			result[i].fullName = "Nguyễn Hùng Mạnh" + (i + 1);
			result[i].gender = (i % 2 == 0) ? Gender.FEMALE : Gender.MALE;
//			result[i].groups = groupsBelongTo(i+1);
			result[i].department = DepartmentUtil.getRandomDepartment(6); // Utility
			result[i].position = PositionUtil.getRandomPosition(4); // 0-based va 1-based
			result[i].createDate = new Date();
		}

		return result;
	}
	
	public static Account getRandomAccount(int max) {
		Account[] accounts = getAccounts();
		
		// Lay chi so cua mot phan tu bat ky
		Random random = new Random();
		int i = random.nextInt(max); // 0..5
		
		// Tra ve phan tu co stt i trong Array Department
		return accounts[i];
	}
	
	/**
	 * Dem xem account thuoc ve bao nhieu group
	 * @param accountID account can check so luong group
	 * @return
	 * 			so luong group ma account thuoc ve
	 */
	public static int belongToGroupCount(int accountID) {
		//Bien count dung de luu so luong group ma account thuoc ve
		int count = 0;
		Group[] groups = GroupUtil.getGroups(); //Lay danh sach groups
		
		//Duyet qua danh sach groups va tim xem account co trong group hay khong, 
		//neu co thi tang bien dem count len 1
		for (int i = 0; i < groups.length; i++) {
			Group group = groups[i]; //group dang duyet hien tai
			
			//Kiem tra cac accounts trong group dang duyet co account can tim hay khong?
			for (int j = 0; j < group.accounts.length; j++) {
				Account groupAccount = group.accounts[j]; // account dang duyet trong group dang duyet
				if(accountID == groupAccount.accountID) { //Tim duoc account
					count++; //tang bien dem group ma account thuoc ve len 1
					break; // khong can phai check cac account trong group hien tai nua
				}
			}
		}
		
		return count;
	}
	
	public static Group[] groupsBelongTo(int accountID) {
		//Bien dung de luu cac group ma account thuoc ve
		ArrayList<Group> belongGroups = new ArrayList<Group>();
		
		Group[] groups = GroupUtil.getGroups(); //Lay danh sach groups
		
		//Duyet qua danh sach groups va tim xem account co trong group hay khong, 
		//neu co thi add group vao danh sach group cua account
		for (int i = 0; i < groups.length; i++) {
			Group group = groups[i]; //group dang duyet hien tai
			
			//Kiem tra cac accounts trong group dang duyet co account can tim hay khong?
			for (int j = 0; j < group.accounts.length; j++) {
				Account groupAccount = group.accounts[j]; // account dang duyet trong group dang duyet
				if(accountID == groupAccount.accountID) { //Tim duoc account
					belongGroups.add(group); //add group vao danh sach group cua account
					break; // khong can phai check cac account trong group hien tai nua
				}
			}
		}
		
		return belongGroups.toArray(new Group[belongGroups.size()]);
	}
}
