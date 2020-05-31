package com.vti.utils.validate;

import com.vti.entity.UserForm;

/**
 * This class is ValidateForm.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class ValidateForm {
	public boolean isRegister(UserForm form) {
		if (form == null) {
			return false;
		}
//		if (!validate.isFirstName(form.getFirstName())) {
//			return false;
//		}
//		if (!validate.isLastName(form.getLastName())) {
//			return false;
//		}
//		if (!validate.isPhone(form.getPhone())) {
//			return false;
//		}
//		if (!validate.isEmail(form.getEmail())) {
//			return false;
//		}
//		if (!validate.isPassword(form.getPassword())) {
//			return false;
//		}
//		if (form instanceof EmployeeUserForm) {
//			if (!validate.isProjectName(((EmployeeUserForm) form).getProjectName())
//					|| !validate.isProSkill(((EmployeeUserForm) form).getProSkill())) {
//				return false;
//			}
//		} else {
//			if (!validate.isExpInYear(((ManagerUserForm) form).getExpInYear())) {
//				return false;
//			}
//		}
		return true;
	}
}
