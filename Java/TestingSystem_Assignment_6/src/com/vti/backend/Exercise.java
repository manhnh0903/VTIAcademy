package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.InvalidAgeInputingException;
import com.vti.entity.Position;
import com.vti.entity.ScannerUtils;

public class Exercise {

	// question1
	public float divide(int a, int b) {
		return a / b;
	}

	public void question1() {
		try {
			float result = divide(7, 0);

			System.out.println(result);

		} catch (ArithmeticException e) {

			System.out.println("cannot divide 0");
		}
	}

	// question2
	public void question2() {
		try {
			float result = divide(7, 0);

			System.out.println(result);

		} catch (ArithmeticException e) {

			System.out.println("cannot divide 0");
		}
		System.out.println("divide completed!");
	}

	// question3
	public void question3() {
		try {
			int[] numbers = { 1, 2, 3 };

			System.out.println(numbers[10]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("mang so nguyen khong co phan tu nay");
		}
	}

	// question4
	public int question4(int index) {
		try {

			Department[] department = new Department[3];
			department[index] = new Department();

			System.out.println(department[index].departmentID);
			System.out.println(department[index].departmentName);

		} catch (Exception e) {
			System.out.println("Cannot find department.");

		}
		return index;
	}

	// question5
	public int question5() throws Exception {

		return inputAge1();

	}

	public int inputAge1() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your age: ");
		try {
			int age = scanner.nextInt();
			scanner.close();
			return age;

		} catch (Exception e) {
			throw new Exception("Wrong inputing! Please input a number as int");

		}
	}

	// question6
	public int question6() {
		try {
			inputAge();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return -1;
	}

	public int inputAge() throws Exception {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Please input your age: ");
				String input = scanner.nextLine();
				int age = Integer.parseInt(input);
				scanner.close();
				return age;

			} catch (Exception e) {
				System.out.println("Wrong inputing! Please input a number as int");

			}

		}
	}

	// question7
	public void question7() {
		ScannerUtils scannerUtils = new ScannerUtils();
		System.out.println("Moi ban nhap vao age hoac id");
		int i = scannerUtils.inputInt("nhap loi, moi ban nhap lai");
		System.out.println("ban vua nhap vao: " + i);
	}

	// question8
	public void question8() {
		ScannerUtils scannerUtils = new ScannerUtils();
//		scannerUtils.inputDouble("abc");
//		scannerUtils.inputFloat("xyz");
		// demo 1 method
		System.out.println("Moi ban nhap vao string1");
		String st1 = scannerUtils.inputString(scannerUtils.errorMessage);
		System.out.println("ban vua nhap vao: " + st1);
		System.out.println("Moi ban nhap vao string2");
		String st2 = scannerUtils.inputString(scannerUtils.errorMessage);
		System.out.println("ban vua nhap vao: " + st2);
	}

	// question9
	public void question9() {
		ScannerUtils scannerUtils = new ScannerUtils();

		Department department = new Department();
		System.out.println("Nhap id phong:");
		department.departmentID = scannerUtils.inputInt(scannerUtils.errorMessage);
		System.out.println("Nhap ten phong:");
		department.departmentName = scannerUtils.inputString(scannerUtils.errorMessage);

		Position position = new Position();
		System.out.println("Nhap id vi tri:");
		position.positionID = scannerUtils.inputInt(scannerUtils.errorMessage);
		System.out.println("Nhap ten vi tri:");
		position.positionName = scannerUtils.inputString(scannerUtils.errorMessage);
	}

	// question10
	public void question10() {
		ScannerUtils scannerUtils = new ScannerUtils();
		System.out.println("--Bat dau nhap thong tin account--");
		Account account = new Account();
		System.out.println("Nhap id account: ");
		account.accountID = scannerUtils.inputInt(scannerUtils.errorMessage);

		System.out.println("Nhap ten account:");
		account.userName = scannerUtils.inputString(scannerUtils.errorMessage);
		System.out.println("Ban co muon nhap position khong? ");
		System.out.println("chon 1 neu dong y, chon 2 neu khong dong y!");
		if (scannerUtils.isInput()) {
			scannerUtils.inputPosition();

		} else {
			System.out.println("Ban co muon nhap department khong? ");
			System.out.println("chon 1 neu dong y, chon 2 neu khong dong y!");
		}

		System.out.println("Ban co muon nhap department khong? ");
		System.out.println("chon 1 neu dong y, chon 2 neu khong dong y!");
		if (scannerUtils.isInput()) {
			scannerUtils.inputDepartment();
		} else {
			System.out.println("Ban co muon nhap group khong? ");
			System.out.println("chon 1 neu dong y, chon 2 neu khong dong y!");
		}

		System.out.println("Ban co muon nhap group khong? ");
		System.out.println("chon 1 neu dong y, chon 2 neu khong dong y!");
		if (scannerUtils.isInput()) {
			scannerUtils.inputGroup();
		} else {
			System.out.println("--Ket thuc nhap thong tin--");
		}

		System.out.println("--Ket thuc nhap thong tin--");

	}

	// question11
	public void question11() {
		ScannerUtils scannerUtils = new ScannerUtils();
		System.out.println("Nhap tuoi cua ban: ");
		try {
			scannerUtils.inputAge(scannerUtils.errorMessage);
		} catch (InvalidAgeInputingException e) {
			System.out.println("Error InvalidAgeInputingException: " + e.getMessage());
		}
	}

	// question12
	public void question12() throws InvalidAgeInputingException {
		ScannerUtils scannerUtils = new ScannerUtils();
		Account account = new Account();
		account.age = scannerUtils.inputAccountAge();

	}

}
