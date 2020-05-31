package com.vti.backend.businesslayer;

import com.vti.entity.EmployeeUserForm;
import com.vti.entity.ManagerUserForm;

/**
 * This class is IUserSevice. 
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public interface IUserSevice {
	public boolean registerManagerUser(ManagerUserForm form);

	public boolean registerEmployeeUser(EmployeeUserForm form);
}
