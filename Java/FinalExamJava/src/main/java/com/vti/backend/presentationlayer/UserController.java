package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.IUserSevice;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.EmployeeUserForm;
import com.vti.entity.ManagerUserForm;
import com.vti.entity.UserForm;

/**
 * This class is UserController.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/31
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/31
 */
public class UserController {
	private IUserSevice service;

	/**
	 * Constructor for class UserController.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/31
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/31
	 */
	public UserController() {
		service = new UserService();
//		validate = new ValidateForm();
	}

	/**
	 * This method is registerUser.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/31
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/31
	 * @param form
	 * @return
	 */
	public boolean registerUser(UserForm form) {
//		if (validate.isRegister(form)) {
		if (form instanceof ManagerUserForm) {
			return service.registerManagerUser((ManagerUserForm) form);
		} else {
			return service.registerEmployeeUser((EmployeeUserForm) form);
		}
//		}
//		return false;
	}

}
