import java.util.Date;

public class Group {

	byte groupID; // định danh của nhóm (auto increment)

	String groupName; // tên nhóm

	Account creatorID; // id của người tạo group

	Date createDate; // ngày tạo group

	Account[] accounts;

}
