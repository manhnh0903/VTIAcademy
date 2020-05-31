package com.vti.entity;

/**
 * This class is EmployeeUser.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class EmployeeUser extends User {
	private String projectName;
	private String proSkill;

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}

	/**
	 * Constructor for class EmployeeUser.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param user
	 * @param projectName2
	 * @param ProSkill
	 */
	public EmployeeUser(User user, String projectName, String proSkill) {
		super(user.firstName, user.lastName, user.phone, user.email, user.password, user.idRole);
		this.projectName = projectName;
		this.proSkill = proSkill;
	}

	/**
	 * Constructor for class EmployeeUser.
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
	 * @param projectName
	 * @param proSkill
	 */
	public EmployeeUser(String firstName, String lastName, String phone, String email, String password, int idRole,
			String projectName, String proSkill) {
		super(firstName, lastName, phone, email, password, idRole);
		this.projectName = projectName;
		this.proSkill = proSkill;
	}
}
