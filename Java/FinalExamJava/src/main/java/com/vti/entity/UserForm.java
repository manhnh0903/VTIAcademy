package com.vti.entity;

/**
 * This class is .
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class UserForm {
	protected String firstName;
	protected String lastName;
	protected String phone;
	protected String email;
	protected String password;
	protected String roleName;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * Constructor for class UserForm.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @param password
	 * @param roleName
	 */
	public UserForm(String firstName, String lastName, String phone, String email, String password, String roleName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.roleName = roleName;
	}

	public User roleCreate() {
		int idRole = 0;
		if (roleName.equals("Manager")) {
			idRole = 1;
		} else {
			idRole = 2;
		}
		return new User(this.firstName, this.lastName, this.email, this.password, this.phone, idRole);
	}
}
