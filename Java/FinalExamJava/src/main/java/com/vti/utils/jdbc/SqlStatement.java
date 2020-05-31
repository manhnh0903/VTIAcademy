package com.vti.utils.jdbc;

/**
 * This class is contain sql statement
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/31
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/31
 */
public class SqlStatement {

	// login
	public static final String SQL_LOGIN_USER = 
			"SELECT 	FirstName, LastName  " 
		   +"FROM 		`User` "
		   +"WHERE 		Email = ? AND `Password` = ? ";

	public static final String SQL_CREATE_USER = 
			"INSERT INTO `User` (`FirstName`, `LastName`, `Phone`, `Email`, `Password`, `Role`, `ExpInYear`, `ProSkill`, `ProjectName`)  "
		   +"VALUES 				(?,          ?,         ?,        ?,       ?,         ?,        ?,           ?,             ? )";

	public static final String SQL_CREATE_MANAGER_USER = 
			"INSERT INTO `User` (`FirstName`, `LastName`, `Phone`, `Email`, `Password`, `Role`, `ExpInYear`)  " 
			+"VALUES 				(?,          ?,         ?,        ?,       ?,         ?,        ? )";
	
	public static final String SQL_CREATE_EMPLOYEE_USER = 
			"INSERT INTO `User` (`FirstName`, `LastName`, `Phone`, `Email`, `Password`, `Role`,  `ProSkill`, `ProjectName`)  "
					   +"VALUES (?,          ?,       ?,      ?,         ?,          ?,           ?,             ? )";
	
	public static final String SQL_EXITS_USER_BY_EMAIL =
			"SELECT 	1 " 
		  + "FROM 		`User` "
		  + "WHERE 		Email = ? ";

	

}
