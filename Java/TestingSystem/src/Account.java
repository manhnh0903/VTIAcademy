import java.util.Date;

public class Account {

	int accountID; // định danh của User (auto increment)

	String email;

	String userName;

	String fullName;

	Department departmentID; // phòng ban của user trong hệ thống

	Position positionID; // chức vụ của User

	Date createDate; // ngày tạo tài khoản

}
