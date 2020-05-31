package com.vti.entity;

/**
 * This class is ManagerUser.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class ManagerUser extends User {
	private int expInYear;

	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}

	/**
	 * Constructor for class ManagerUser.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param user
	 * @param expInYear
	 */
	public ManagerUser(User user, int expInYear) {
		super(user.firstName, user.lastName, user.phone, user.email, user.password, user.idRole);
		this.expInYear = expInYear;
	}

	/**
	 * Constructor for class ManagerUser.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/31
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/31
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @param password
	 * @param idRole
	 * @param expInYear
	 */
	public ManagerUser(String firstName, String lastName, String phone, String email, String password, int idRole,
			int expInYear) {
		super(firstName, lastName, phone, email, password, idRole);
		this.expInYear = expInYear;
	}

}
