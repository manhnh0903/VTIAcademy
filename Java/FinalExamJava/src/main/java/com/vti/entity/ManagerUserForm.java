package com.vti.entity;

/**
 * This class is ManagerUserForm .
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class ManagerUserForm extends UserForm {
	private int expInYear;

	/**
	 * @return the expInYear
	 */
	public int getExpInYear() {
		return expInYear;
	}

	/**
	 * Constructor for class ManagerUserForm.
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
	 * @param roleName
	 * @param expInYear
	 */
	public ManagerUserForm(String firstName, String lastName, String phone, String email, String password,
			String roleName, int expInYear) {
		super(firstName, lastName, phone, email, password, roleName);
		this.expInYear = expInYear;
	}

	/**
	 * Constructor for class ManagerUserForm.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/31
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/31
	 * @param userForm
	 * @param expInYear
	 */
	public ManagerUserForm(UserForm userForm, int expInYear) {
		super(userForm.firstName, userForm.lastName, userForm.phone, userForm.email, userForm.password,
				userForm.roleName);
		this.expInYear = expInYear;
	}

	/*
	 * @see com.vti.entity.UserForm#roleCreate()
	 */
	@Override
	public ManagerUser roleCreate() {
		return new ManagerUser(super.roleCreate(), this.expInYear);
	}
}
