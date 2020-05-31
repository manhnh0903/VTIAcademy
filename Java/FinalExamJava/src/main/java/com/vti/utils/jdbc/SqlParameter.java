package com.vti.utils.jdbc;

/**
 * This class is model of 1 param in statement query.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/31
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/31
 */
public class SqlParameter {

	private int number;
	private Object values;

	/**
	 * Constructor for class SqlParameter.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/31
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/31
	 * @param number - number of field
	 * @param values - value for field
	 */
	public SqlParameter(int number, Object values) {
		this.number = number;
		this.values = values;
	}

	/**
	 * This method is getNumber. 
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/31
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/31
	 * @return	-number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * This method is getValues. 
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/31
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/31
	 * @return	-values
	 */
	public Object getValues() {
		return values;
	}

}
