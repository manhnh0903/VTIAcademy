package com.vti.function;

import com.vti.backend.businesslayer.UserService;
import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.EmployeeUserForm;
import com.vti.entity.ManagerUserForm;
import com.vti.entity.UserForm;
import com.vti.utils.messageUtil.MessageUtil;
import com.vti.utils.scannerUtil.ScannerUtil;
import com.vti.utils.validate.Validate;

public class UserManager {
	private UserService userService = new UserService();
	private UserController userController = new UserController();
	private Validate validate = new Validate();
	private String roleName = null;
	private int expInYear = 0;
	private String proSkill = null;
	private String projectName = null;
	private UserForm userForm = null;

	public void Exam() {

		System.out.println("**********MENU***********");
		System.out.println("1.Register				 ");
		System.out.println("2.Login					 ");
		System.out.println("3.Exit					 ");
		System.out.println("Mời bạn chọn chức năng");
		int choose = ScannerUtil.inputInt("Please, input again");

		switch (choose) {
		case 1:
			System.out.println("OK! Register");
			registerUser();
			break;
		case 2:
			System.out.println("OK! Login");
			logIn();
			break;
		case 3:
			System.out.println("OK! Exit");
			break;
		default:
			break;
		}

	}

	public void registerUser() {
		// register User
//		while (true) {
		System.out.println("*************REGISTER USER***************");

		// input firstName
		System.out.println("Input FirstName: ");
		String firstName = ScannerUtil.inputString(MessageUtil.VALIDATE_FIRSTNAME_FORMAT);
		if (!validate.isFirstName(firstName)) {
			System.out.println("Error! Input again");
			firstName = ScannerUtil.inputString(MessageUtil.VALIDATE_FIRSTNAME_FORMAT);
		}
		// input LastName
		System.out.println("Input LastName: ");
		String lastName = ScannerUtil.inputString(MessageUtil.VALIDATE_LASTNAME_FORMAT);
		if (!validate.isLastName(lastName)) {
			System.out.println("Error! Input again");
			lastName = ScannerUtil.inputString(MessageUtil.VALIDATE_LASTNAME_FORMAT);
		}

		// input Email
		System.out.println("Input Email: ");
		String email = ScannerUtil.inputString(MessageUtil.VALIDATE_EMAIL_FORMAT);
		while (!validate.isEmail(email)) {
			System.out.println("Error! Input again");
			email = ScannerUtil.inputString(MessageUtil.VALIDATE_EMAIL_FORMAT);
		}

		// input password
		System.out.println("Input Password: ");
		String password = ScannerUtil.inputString(MessageUtil.VALIDATE_PASSWORD_FORMAT);
		while (!validate.isPassword(password)) {
			System.out.println("Error! Input again");
			password = ScannerUtil.inputString(MessageUtil.VALIDATE_PASSWORD_FORMAT);
		}

		// phone
		System.out.println("Input Phone");
		String phone = ScannerUtil.inputString(MessageUtil.VALIDATE_PHONE_FORMAT);
		if (!validate.isPhone(phone)) {
			System.out.println("Error! Input again");
			phone = ScannerUtil.inputString(MessageUtil.VALIDATE_PHONE_FORMAT);
		}

		while (roleName == null) {
			System.out.println("Mời bạn nhập 1: Manager hoặc 2:Employee");
			int roleInput = ScannerUtil.inputInt(MessageUtil.VALIDATE_ROLE_FORMAT);
			switch (roleInput) {
			case 1:
				roleName = "Manager";
				// ExpInYear
				System.out.println("Input ExpInYear: ");
				expInYear = ScannerUtil.inputInt(MessageUtil.VALIDATE_EXPINYEAR_FORMAT);
				while (!validate.isExpInYear(expInYear)) {
					System.out.println("Error! Input again");
					expInYear = ScannerUtil.inputInt(MessageUtil.VALIDATE_EXPINYEAR_FORMAT);
				}

				userForm = new ManagerUserForm(firstName, lastName, phone, email, password, roleName, expInYear);
				boolean registerManager = userController.registerUser(userForm);
				if (registerManager) {
					System.err.println("Great! Create success ");
					break;
				} else {
					System.err
							.println("Create fail! Exist ManagerUser with email = " + email + "\nPlease! input again!");
				}

				break;
			case 2:
				roleName = "Employee";

				while (projectName == null) {

					System.out.println("Mời bạn nhập tên dự án đang tham gia");
					System.out.println("1:Testing System 2: CRM, 3: TimeSheet");
					int project = ScannerUtil.inputInt("Bạn chỉ có thể nhập");
					switch (project) {
					case 1:
						projectName = "Testing System";
						break;
					case 2:
						projectName = "CRM";
						break;
					case 3:
						projectName = "TimeSheet";
						break;
					default:
						break;
					}

					System.out.println("Mời bạn nhập Kỹ năng chuyên môn");
					System.out.println("1:Dev 2: Test, 3: Java, 4: Sql");
					int skill = ScannerUtil.inputInt("Bạn chỉ có thể nhập");
					switch (skill) {
					case 1:
						proSkill = "Dev";
						break;
					case 2:
						proSkill = "Test";
						break;
					case 3:
						proSkill = "Java";
						break;
					case 4:
						proSkill = "Sql";
						break;
					default:
						break;
					}

					userForm = new EmployeeUserForm(firstName, lastName, phone, email, password, roleName, proSkill,
							projectName);
					boolean registerEmployee = userController.registerUser((EmployeeUserForm) userForm);

					if (registerEmployee) {
						System.err.println("Great! Create success ");
						break;
					} else {
						System.err.println(
								"Create fail! Exist EmployeeUser with email = " + email + "\nPlease! input again!");
					}
				}
			default:
				break;
			}

		}
	}
//	}

	public void logIn() {

		System.out.println("*************LOGIN***************");

		// input Email
		System.out.println("Input Email: ");
		String email = ScannerUtil.inputString(MessageUtil.VALIDATE_EMAIL_FORMAT);
		while (!userService.checkEmailDuplicate(email)) {
			System.out.println("Email khong ton tai. Vui long nhap lai");
			email = ScannerUtil.inputString(MessageUtil.VALIDATE_EMAIL_FORMAT);
		}
		// input password
		System.out.println("Input Password: ");
		String password = ScannerUtil.inputString(MessageUtil.VALIDATE_PASSWORD_FORMAT);
		while (!userService.checkLogin(email, password)) {
			System.out.println("Sai password. Vui long nhap lai");
			password = ScannerUtil.inputString(MessageUtil.VALIDATE_PASSWORD_FORMAT);
		}
		System.err.println("GREAT! LOGIN SUCCESS");
	}
}
