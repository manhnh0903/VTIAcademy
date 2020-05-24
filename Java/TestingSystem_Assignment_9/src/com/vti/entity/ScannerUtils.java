package com.vti.entity;

import java.util.Scanner;

public class ScannerUtils {

	public final static String errorMessage = "Error,input again";

	@SuppressWarnings("resource")
	public int inputInt() {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
//				System.out.println("Please input int: ");
				String input = scanner.nextLine();
				int i = Integer.parseInt(input);

				return i;

			} catch (Exception e) {
				System.out.println(errorMessage);
			}
		}
	}

	@SuppressWarnings("resource")
	public int inputInt(String errorMessage) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
//				System.out.println("Please input int: ");
				String input = scanner.nextLine();
				int i = Integer.parseInt(input);

				return i;

			} catch (Exception e) {
				System.out.println(errorMessage);
			}
		}
	}

	@SuppressWarnings("resource")
	public float inputFloat(String errorMessage) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
//				System.out.println("Please input : ");
				String input = scanner.nextLine();
				float i = Float.parseFloat(input);

				return i;

			} catch (Exception e) {
				System.out.println(errorMessage);
			}
		}
	}

	@SuppressWarnings("resource")
	public double inputDouble(String errorMessage) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
//				System.out.println("Please input : ");
				String input = scanner.nextLine();
				double i = Double.parseDouble(input);

				return i;

			} catch (Exception e) {
				System.out.println(errorMessage);
			}
		}
	}

	@SuppressWarnings("resource")
	public String inputString(String errorMessage) {

		while (true) {
			Scanner scanner = new Scanner(System.in);
//			System.out.println("Please input your string: ");
			String name = scanner.nextLine();
			if (name != null && !name.trim().isEmpty()) {
				return name;

			} else {
				System.out.println(errorMessage);

			}

		}

	}

//	public int inputAge(String errorMessage) throws InvalidAgeInputingException {
//
//		while (true) {
//
//			System.out.println("Please input int: ");
//			int age = inputInt(errorMessage);
//
//			if (age <= 0) {
//				throw new InvalidAgeInputingException(errorMessage);
//			} else {
//				return age;
//
//			}
//		}
//	}
//
//	public int inputAccountAge() throws InvalidAgeInputingException {
//		ScannerUtils scannerUtils = new ScannerUtils();
//		while (true) {
//
//			System.out.println("Please input your age: ");
//			int age = scannerUtils.inputAge(scannerUtils.errorMessage);
//
//			if (age > 0 && age < 18) {
//				System.out.println("\"Your age must be greater than 18 \"");// co the thay noi dung moi o day
//			} else {
//				System.out.println("ok!Ban tren 18 tuoi ^^");// co the thay noi dung moi o day
//				return age;
//
//			}
//		}
//	}
//
//	public boolean isInput() {
//		while (true) {
//			ScannerUtils scannerUtils = new ScannerUtils();
//			int choose = scannerUtils.inputInt("Ban phai nhap 1 hoac 2, moi ban nhap lai");
//			if (choose == 1) {
//				return true;
//			} else if (choose == 2) {
//				return false;
//			} else {
//				System.out.println("Ban phai nhap 1 hoac 2, moi ban nhap lai");
//			}
//		}
//	}
//
//	public void inputGroup() {
//
//		ScannerUtils scannerUtils = new ScannerUtils();
//		System.out.println("Nhap so group ban muon them: ");
//		Group[] groups = new Group[scannerUtils.inputInt("nhap lai so group: ")];
//		for (int i = 0; i < groups.length; i++) {
//			System.out.println("Nhap thong tin group: " + (i + 1));
//			groups[i] = new Group();
//			System.out.println("groupID:");
//			groups[i].groupID = scannerUtils.inputInt("Nhap lai groupID ");
//			System.out.println("groupName:");
//			groups[i].groupName = scannerUtils.inputString(scannerUtils.errorMessage);
//
//		}
//
//	}
//
//	public void inputDepartment() {
//
//		ScannerUtils scannerUtils = new ScannerUtils();
//		Department department = new Department();
//		System.out.println("Moi ban nhap thong tin department: ");
//		System.out.println("departmentID: ");
//		department.departmentID = scannerUtils.inputInt(scannerUtils.errorMessage);
//		System.out.println("departmentName: ");
//		department.departmentName = scannerUtils.inputString(scannerUtils.errorMessage);
//
//	}
//
//	public void inputPosition() {
//
//		ScannerUtils scannerUtils = new ScannerUtils();
//		Position position = new Position();
//		System.out.println("Moi ban nhap thong tin position: ");
//		System.out.println("positionID: ");
//		position.positionID = scannerUtils.inputInt(scannerUtils.errorMessage);
//		System.out.println("positionName: ");
//		position.positionName = scannerUtils.inputString(scannerUtils.errorMessage);
//
//	}

}
