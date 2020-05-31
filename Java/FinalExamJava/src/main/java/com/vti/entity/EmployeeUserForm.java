package com.vti.entity;

/**
 * This class is EmployeeUserForm.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class EmployeeUserForm extends UserForm {
	private String proSkill;
	private String projectName;
	

	/**
	 * @return
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
	 * Constructor for class EmployeeUserForm.
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
	 * @param projectName
	 * @param proSkill
	 */
	public EmployeeUserForm(String firstName, String lastName, String phone, String email, String password,
			String roleName, String projectName, String proSkill) {
		super(firstName, lastName, phone, email, password, roleName);
		this.projectName = projectName;
		this.proSkill = proSkill;
	}

	/**
	 * Constructor for class EmployeeUserForm.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/31
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/31
	 * @param userForm
	 * @param projectName
	 * @param proSkill
	 */
	public EmployeeUserForm(UserForm userForm, String proSkill, String projectName) {
		super(userForm.firstName, userForm.lastName, userForm.phone, userForm.email, userForm.password,
				userForm.roleName);
		this.projectName = projectName;
		this.proSkill = proSkill;
	}

	/*
	 * @see com.vti.entity.UserForm#roleCreate()
	 */
	@Override
	public EmployeeUser roleCreate() {
		return new EmployeeUser(super.roleCreate(), this.projectName, this.proSkill);
	}
}
