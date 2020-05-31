package com.vti.entity;

/**
 * This class is User.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class User {
	protected String firstName;
	protected String lastName;
	protected String phone;
	protected String email;
	protected String password;
	protected int idRole;

	/**
	 * @return the firstName.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the phone.
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the email.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the idRole.
	 */
	public int getIdRole() {
		return idRole;
	}

	/**
	 * Constructor for class User.
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
	 * @param idRole
	 */
	public User(String firstName, String lastName, String phone, String email, String password, int idRole) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.idRole = idRole;
	}

	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 */
	public User() {

	}

}
