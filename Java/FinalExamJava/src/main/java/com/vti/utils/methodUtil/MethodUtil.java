//
package com.vti.utils.methodUtil;

import java.util.regex.Pattern;

import com.mysql.cj.util.StringUtils;

/**
 * This class is MethodUtil.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class MethodUtil {

	/**
	 * This method is checkRegularExpression.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param input
	 * @param regular
	 * @return
	 */
	public static boolean checkRegularExpression(String input, String regular) {
		// validate input
		if (StringUtils.isNullOrEmpty(input)) {
			return false;
		}
		// validate success
//		String regex = "[A-z0-9@#$!^&%* `\\\\/-_]{9,12}";
//
//		Pattern pattern = Pattern.compile(regex);
//
//		Matcher matcher = pattern.matcher(input);
//		return Pattern.compile(regex).matcher(input).matches();
//		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
//
//		Pattern pattern = Pattern.compile(regex);
//
//		Matcher matcher = pattern.matcher(input);
//		if (matcher.matches()) {
//			return false;
//		}
//		;
//		return true;
		return Pattern.compile(regular).matcher(input).matches();
	}
}
