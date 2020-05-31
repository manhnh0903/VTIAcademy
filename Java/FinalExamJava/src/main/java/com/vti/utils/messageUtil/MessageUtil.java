package com.vti.utils.messageUtil;

/**
 * This class is MessageUtil. 
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class MessageUtil {

	// validate form

	// FirstName
	public static final String VALIDATE_FIRSTNAME_FORMAT = "Firstame must not be empty. Please input again!";
	public static final String VALIDATE_FIRSTNAME_MAX_LENGTH = "FirstName has the most 20 characters";
	public static final String VALIDATE_FIRSTNAME_RULE = "FirstName must capitalization first characters";
	
	// LastName
	public static final String VALIDATE_LASTNAME_FORMAT = "LastName must not be empty";
	public static final String VALIDATE_LASTNAME_MAX_LENGTH = "LastName has the most 20 characters";
	public static final String VALIDATE_LASTNAME_RULE = "LastName must capitalization first characters";

	// email
	public static final String VALIDATE_EMAIL_FORMAT = "Email must not be empty";
	public static final String VALIDATE_EMAIL_MAX_LENGTH = "Email has the most 40 characters";
	public static final String VALIDATE_EMAIL_RULE = "Email has the most 40 characters and include @, lower, upper characters, ...";

	// password
	public static final String VALIDATE_PASSWORD_FORMAT = "Password must not be empty";
	public static final String VALIDATE_PASSWORD_MAX_AND_MIN_LENGHT = "Password must has 6 to 12 characters";
	public static final String VALIDATE_PASSWORD_RULE = "Password must contain numbers and capital letters ";
	// phone
	public static final String VALIDATE_PHONE_FORMAT = "Phone number must not be empty";
	public static final String VALIDATE_PHONE_MAX_AND_MIN_LENGTH = "Phone number must has 9 to 12 numbers";
	public static final String VALIDATE_PHONE_RULE = "Phone number must has 9 to 12 numbers and include 0-9";
	
	// ExpInYear
	public static final String VALIDATE_EXPINYEAR_FORMAT = "ExpInYear number must has 0 to 20 year";
	
	// ProSkill
	public static final String VALIDATE_PROSKILL_FORMAT = "ProSkill must has(dev,test, java, sql)";
	
	// projectName
	public static final String VALIDATE_PROJECTNAME_FORMAT = "projectName must has(Testing System, CRM, TimeSheet)";
	
	// scanner
	public static final String ERROR_VALIDATE_INT = "Invalid value, Please input interger: ";
	public static final String ERROR_VALIDATE_FLOAT = "Invalid value, Please input float: ";
	public static final String ERROR_VALIDATE_DOUBLE = "Invalid value, Please input double: ";
	public static final String ERROR_VALIDATE_STRING = "Invalid value, Please input string: ";

	// IDRole
	public static final String VALIDATE_ROLE_FORMAT = "You must input IDrole which is a position .";

}
