package com.vti.backend.datalayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.EmployeeUserForm;
import com.vti.entity.ManagerUserForm;
import com.vti.utils.jdbc.JdbcUtil;
import com.vti.utils.jdbc.SqlParameter;
import com.vti.utils.jdbc.SqlStatement;

/**
 * This class is UserRepository.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/31
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/31
 */
public class UserRepository implements IUserRepository {

	private JdbcUtil jdbcUtil = JdbcUtil.getInstance();

	/*
	 * @see com.vti.backend.datalayer.IRepository#exists(java.lang.String)
	 */
	@Override
	public boolean exists(String email) {
		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, email));

		// execute query
		ResultSet result = jdbcUtil.selectPreparationStatement(SqlStatement.SQL_EXITS_USER_BY_EMAIL, params);

		// check result is null
		if (null == result) {
			jdbcUtil.disconnect();
			return false;
		}

		// get result
		try {
			while (result.next()) {
				jdbcUtil.disconnect();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		jdbcUtil.disconnect();
		return false;

	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#createUser(com.vti.entity.
	 * EmployeeUser)
	 */
	@Override
	public boolean createUser(EmployeeUserForm entity) {

//		if (!createUser((User) entity)) {
//			return false;
//		}

		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, entity.getFirstName()));
		params.add(new SqlParameter(2, entity.getLastName()));
		params.add(new SqlParameter(3, entity.getPhone()));
		params.add(new SqlParameter(4, entity.getEmail()));
		params.add(new SqlParameter(5, entity.getPassword()));
		params.add(new SqlParameter(6, entity.getRoleName()));
		params.add(new SqlParameter(7, entity.getProSkill()));
		params.add(new SqlParameter(8, entity.getProjectName()));

		// execute query
		int result = jdbcUtil.updatePreparationStatement(SqlStatement.SQL_CREATE_EMPLOYEE_USER, params);
		jdbcUtil.disconnect();

		// return result
		if (result == 1) {
			return true;
		}

		return false;
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#createUser(com.vti.entity.
	 * ManagerUser)
	 */
	@Override
	public boolean createUser(ManagerUserForm entity) {

//		if (!createUser((User) entity)) {
//			return false;
//		}

		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, entity.getFirstName()));
		params.add(new SqlParameter(2, entity.getLastName()));
		params.add(new SqlParameter(3, entity.getPhone()));
		params.add(new SqlParameter(4, entity.getEmail()));
		params.add(new SqlParameter(5, entity.getPassword()));
		params.add(new SqlParameter(6, entity.getRoleName()));
		params.add(new SqlParameter(7, entity.getExpInYear()));

		// execute query
		int result = jdbcUtil.updatePreparationStatement(SqlStatement.SQL_CREATE_MANAGER_USER, params);
		jdbcUtil.disconnect();

		// return result
		if (result == 1) {
			return true;
		}
		return false;

	}

	@Override
	public boolean checkLogin(String email, String pass) {
		// init list parameters
		List<SqlParameter> params = new ArrayList<>();
		params.add(new SqlParameter(1, email));
		params.add(new SqlParameter(2, pass));

		// execute query
		ResultSet result = jdbcUtil.selectPreparationStatement(SqlStatement.SQL_LOGIN_USER, params);

		// check result is null
		if (null == result) {
			jdbcUtil.disconnect();
			return false;
		}

		// get result
		try {
			while (result.next()) {
				jdbcUtil.disconnect();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		jdbcUtil.disconnect();
		return false;
	}
}
