package com.vti.utils.validate;

import com.mysql.cj.util.StringUtils;
import com.vti.utils.constant.Constant;
import com.vti.utils.messageUtil.MessageUtil;
import com.vti.utils.methodUtil.MethodUtil;

/**
 * This class is Validate.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class Validate {

	/**
	 * This method is isFirstName.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @return
	 */
	public boolean isFirstName(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_FIRSTNAME_FORMAT);
			return false;
		}

		// max length, min length
		if (!isSatisfyMaxLength(input, 20)) {
			showError(MessageUtil.VALIDATE_FIRSTNAME_MAX_LENGTH);
			return false;
		}

		/*
		 * //regular expression boolean result =
		 * MethodUtil.checkRegularExpression(input, Constant.PATTERN_FIRSTNAME);
		 * if(!result) { showError(MessageUtil.VALIDATE_FIRSTNAME_RULE); } return
		 * result;
		 */

		return true;
	}

	/**
	 * This method is isLastName.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @return
	 */
	public boolean isLastName(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_LASTNAME_FORMAT);
			return false;
		}

		// max length, min length
		if (!isSatisfyMaxLength(input, 20)) {
			showError(MessageUtil.VALIDATE_LASTNAME_MAX_LENGTH);
			return false;
		}

		/*
		 * // regular expression boolean result =
		 * MethodUtil.checkRegularExpression(input, Constant.PATTERN_LASTNAME);
		 * if(!result) { showError(MessageUtil.VALIDATE_LASTNAME_RULE); } return result;
		 */
		return true;
	}

	/**
	 * This method is isEmail .
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @return
	 */
	public boolean isEmail(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_EMAIL_FORMAT);
			return false;
		}

		// max length, min length
		if (!isSatisfyMaxLength(input, 40)) {
			showError(MessageUtil.VALIDATE_EMAIL_MAX_LENGTH);
			return false;
		}

		// regular expression
		boolean result = MethodUtil.checkRegularExpression(input, Constant.PATTERN_EMAIL);
		if (!result) {
			showError(MessageUtil.VALIDATE_EMAIL_RULE);
		}
		return result;
	}

	/**
	 * This method is isPassword.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @return
	 */
	public boolean isPassword(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_PASSWORD_FORMAT);
			return false;
		}
		// max length, min length
		if (!isSatisfyMaxLength(input, 12) || !isSatisfyMinLength(input, 6)) {
			showError(MessageUtil.VALIDATE_PASSWORD_MAX_AND_MIN_LENGHT);
			return false;
		}
		// regular expression
		boolean result = MethodUtil.checkRegularExpression(input, Constant.PATTERN_PASSWORD);
		if (!result) {
			showError(MessageUtil.VALIDATE_PASSWORD_RULE);
		}
		return result;
	}

	/**
	 * This method is isPhone.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @return
	 */
	public boolean isPhone(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_PHONE_FORMAT);
			return false;
		}

		// max length, min length
		if (!isSatisfyMaxLength(input, 12) || !isSatisfyMinLength(input, 9)) {
			showError(MessageUtil.VALIDATE_PHONE_MAX_AND_MIN_LENGTH);
			return false;
		}

		// regular expression
		boolean result = MethodUtil.checkRegularExpression(input, Constant.PATTERN_PHONE);
		if (!result) {
			showError(MessageUtil.VALIDATE_PHONE_RULE);
		}
		return result;

//		return true;

	}

	/**
	 * This method is isExpInYear.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @return
	 */
	public boolean isExpInYear(final int input) {
		// empty
		if (input < 0 || input > 20) {
			showError(MessageUtil.VALIDATE_EXPINYEAR_FORMAT);
			return false;
		}
		return true;
	}

	/**
	 * This method is isProSkill .
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @return
	 */
	public boolean isProSkill(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_PROSKILL_FORMAT);
			return false;
		}
		return true;
	}

	/**
	 * This method is isProjectName.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @return
	 */
	public boolean isProjectName(final String input) {
		// empty
		if (StringUtils.isNullOrEmpty(input)) {
			showError(MessageUtil.VALIDATE_PROJECTNAME_FORMAT);
			return false;
		}
		return true;
	}

	/**
	 * This method is String MaxLength .
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @param maxLength
	 * @return
	 */
	public boolean isSatisfyMaxLength(String input, int maxLength) {
		if (!StringUtils.isNullOrEmpty(input) && input.length() <= maxLength) {
			return true;
		}
		return false;
	}

	/**
	 * This method is String MinLength .
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @param minLength
	 * @return
	 */
	public boolean isSatisfyMinLength(String input, int minLength) {
		if (!StringUtils.isNullOrEmpty(input) && input.length() >= minLength) {
			return true;
		}
		return false;
	}

	/**
	 * This method is showError .
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param message
	 */
	public void showError(String message) {
		System.out.println("Error: " + message);
	}

	/**
	 * This method is showSuccess.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param message
	 */
	public void showSuccess(String message) {
		System.out.println("Success: " + message);
	}

}
