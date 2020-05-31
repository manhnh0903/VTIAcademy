package com.vti.backend.datalayer;

import com.vti.entity.EmployeeUserForm;
import com.vti.entity.ManagerUserForm;

/**
 * This class is interface IUserRepository .
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public interface IUserRepository {

	public boolean createUser(ManagerUserForm entity);

	public boolean createUser(EmployeeUserForm entity);

	public boolean exists(String email);
	
	public boolean checkLogin(String email, String pass);

}
