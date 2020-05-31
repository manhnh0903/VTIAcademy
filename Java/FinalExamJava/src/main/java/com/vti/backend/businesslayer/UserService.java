package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.EmployeeUserForm;
import com.vti.entity.ManagerUserForm;

/**
 * This class is UserService.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/31
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/31
 */
public class UserService implements IUserSevice {
	private IUserRepository repository;

	public UserService() {
		repository = new UserRepository();
	}

	/*
	 * @see
	 * com.vti.backend.businesslayer.IUserSevice#registerManagerUser(com.vti.entity.
	 * ManagerUserForm)
	 */
	public boolean registerManagerUser(ManagerUserForm form) {
		// if name exist then return false
		if (repository.exists(form.getEmail())) {
			return false;
		}
		// create
//		return repository.createUser(form.roleCreate());
		return repository.createUser(form);
	}

	/*
	 * @see
	 * com.vti.backend.businesslayer.IUserSevice#registerEmployeeUser(com.vti.entity
	 * .EmployeeUserForm)
	 */
	public boolean registerEmployeeUser(EmployeeUserForm form) {
		// if name exist then return false
		if (repository.exists(form.getEmail())) {
			return false;
		}
		// create
//		return repository.createUser(form.roleCreate());
		return repository.createUser(form);
	}

	/**
	 * This method is checkEmailDuplicate.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/06/01
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/06/01
	 * @param email
	 * @return
	 */
	public boolean checkEmailDuplicate(String email) {
		return repository.exists(email);
	}

	/**
	 * This method is checkLogin.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/06/01
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/06/01
	 * @param email
	 * @param pass
	 * @return
	 */
	public boolean checkLogin(String email, String pass) {
		return repository.checkLogin(email, pass);
	}

}
