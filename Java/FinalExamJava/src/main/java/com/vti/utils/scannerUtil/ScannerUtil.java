package com.vti.utils.scannerUtil;

import java.util.Scanner;

public class ScannerUtil {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * This method is inputId.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @return
	 */
	public static int inputId() {
		while (true) {
			int id = inputInt("Please input a id as int, please input again.");
			if (id > 0) {
				return id;
			}
			// else
			System.out.println("Please input a id as int which must be greater than > 0, please input again.");
		}
	}

	/**
	 * This method is inputName.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @return
	 */
	public static String inputName() {
		return inputString("Please input a name, please input again.");
	}

	/**
	 * This method is inputInt no parameter .
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @return
	 */
	public static int inputInt() {
		return inputInt("Please input a number as int, please input again");
	}

	/**
	 * This method is inputInt with 1 parameter.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param errorMessage
	 * @return
	 */
	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	/**
	 * This method is inputFloat .
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param errorMessage
	 * @return
	 */
	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	/**
	 * This method is inputDouble .
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param errorMessage
	 * @return
	 */
	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	/**
	 * This method is inputString .
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param errorMessage
	 * @return
	 */
	public static String inputString(String errorMessage) {
		while (true) {
			String input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				System.err.println(errorMessage);
			}
		}
	}

	/**
	 * This method is inputAge.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @return
	 */
	public static int inputAge() {
		while (true) {
			int age = inputInt("Wrong inputing! Please input an age as int, input again.");

			if (age <= 0) {
				System.err.println("Wrong inputing! The age must be greater than 0, please input again.");

			} else {
				return age;
			}
		}
	}

	/**
	 * This method is inputAgeGreaterThan18.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @return
	 */
	public static int inputAgeGreaterThan18() {
		while (true) {
			int age = inputAge();

			if (age >= 18) {
				return age;

			} else {
				System.out.println("Wrong inputing! The age must be greater than 18, please input again.");
			}
		}
	}

	/**
	 * This method is isInput.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/31
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/31
	 * @return
	 */
	public static boolean isInputRegister() {
		while (true) {

			int choose = inputInt("Ban phai nhap 1 hoac 2, moi ban nhap lai");
			if (choose == 1) {
				return true;
			} else if (choose == 2) {
				return false;
			} else {
				System.out.println("Ban phai nhap 1 hoac 2, moi ban nhap lai");
			}
		}
	}

	public static boolean isInputLogin() {
		while (true) {
			System.out.println("Ban co muon dang nhap khong? Y/N");
			String choose = ScannerUtil.inputString("Ban phai nhap Y hoac N, moi ban nhap lai");
			if (choose.equals("Y")) {
				return true;
			} else if (choose.equals("N")) {
				return false;
			}
		}
	}

}
