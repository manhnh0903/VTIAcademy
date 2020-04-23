import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class MainTestingSystem {

	public static void main(String[] args) {

		// import data in Department

		Department d1 = new Department();
		d1.departmentID = 1;
		d1.departmentName = "Sale";

		Department d2 = new Department();
		d2.departmentID = 2;
		d2.departmentName = "Accounting";

		Department d3 = new Department();
		d3.departmentID = 3;
		d3.departmentName = "Administration";

		Department d4 = new Department();
		d4.departmentID = 4;
		d4.departmentName = "Human Resources";

		Department d5 = new Department();
		d5.departmentID = 5;
		d5.departmentName = "Training";

		Department d6 = new Department();
		d6.departmentID = 6;
		d6.departmentName = "Marketing";

		Department d7 = new Department();
		d7.departmentID = 7;
		d7.departmentName = "Research & Development	";

		Department d8 = new Department();
		d8.departmentID = 8;
		d8.departmentName = "Quality";

		Department d9 = new Department();
		d9.departmentID = 9;
		d9.departmentName = "Financial";

		Department d10 = new Department();
		d10.departmentID = 10;
		d10.departmentName = "Customer Service";

		// import data in Position

		Position p1 = new Position();
		p1.positionID = 1;
		p1.positionName = "Dev";

		Position p2 = new Position();
		p2.positionID = 2;
		p2.positionName = "Test";

		Position p3 = new Position();
		p3.positionID = 3;
		p3.positionName = "Scrum Master";

		Position p4 = new Position();
		p4.positionID = 4;
		p4.positionName = "PM";

		// import data in Account

		Account a1 = new Account();
		a1.accountID = 91;
		a1.email = "selina@gmail.com";
		a1.userName = "selina";
		a1.fullName = "selinagomez";
		a1.departmentID = d9;
		a1.positionID = p4;
		a1.createDate = new Date("2020/03/06");

		Account a2 = new Account();
		a2.accountID = 92;
		a2.email = "maria@gmail.com";
		a2.userName = "maria";
		a2.fullName = "mariaker";
		a2.departmentID = d1;
		a2.positionID = p1;
		a2.createDate = new Date("2020/03/06");

		Account a3 = new Account();
		a3.accountID = 93;
		a3.email = "tom@gmail.com";
		a3.userName = "tom";
		a3.fullName = "tomsoy";
		a3.departmentID = d5;
		a3.positionID = p3;
		a3.createDate = new Date("2020/03/06");

		Account a4 = new Account();
		a4.accountID = 94;
		a4.email = "hung87@gmail.com";
		a4.userName = "hung87";
		a4.fullName = "nguyenmanhhung";
		a4.departmentID = d7;
		a4.positionID = p2;
		a4.createDate = new Date("2020/03/07");

		Account a5 = new Account();
		a5.accountID = 95;
		a5.email = "cuongnguyen@gmail.com";
		a5.userName = "cuong84";
		a5.fullName = "nguyenhungcuong";
		a5.departmentID = d2;
		a5.positionID = p4;
		a5.createDate = new Date("2020/03/07");

		Account a6 = new Account();
		a6.accountID = 96;
		a6.email = "david@gmail.com";
		a6.userName = "david";
		a6.fullName = "davidthomson";
		a6.departmentID = d8;
		a6.positionID = p3;
		a6.createDate = new Date("2020/03/08");

		Account a7 = new Account();
		a7.accountID = 97;
		a7.email = "trung87@gmail.com";
		a7.userName = "trung87";
		a7.fullName = "hoangvantrung";
		a7.departmentID = d10;
		a7.positionID = p2;
		a7.createDate = new Date("2020/03/09");

		Account a8 = new Account();
		a8.accountID = 98;
		a8.email = "toannguyen@gmail.com";
		a8.userName = "toan88";
		a8.fullName = "nguyenductoan";
		a8.departmentID = d4;
		a8.positionID = p4;
		a8.createDate = new Date("2020/03/10");

		Account a9 = new Account();
		a9.accountID = 99;
		a9.email = "phongnhok@gmail.com";
		a9.userName = "phong";
		a9.fullName = "danghungphong";
		a9.departmentID = d10;
		a9.positionID = p1;
		a9.createDate = new Date("2020/03/10");

		Account a10 = new Account();
		a10.accountID = 100;
		a10.email = "duy@gmail.com";
		a10.userName = "mentor";
		a10.fullName = "nguyenngocduy";
		a10.departmentID = d6;
		a10.positionID = p3;
		a10.createDate = new Date("2020/03/18");

		// import data in Group

		Group g1 = new Group();
		g1.groupID = 123;
		g1.groupName = "nhom java";
		g1.creatorID = a3;
		g1.createDate = new Date("2020/03/20");

		Group g2 = new Group();
		g2.groupID = 124;
		g2.groupName = "nhom mysql";
		g2.creatorID = a8;
		g2.createDate = new Date("2020/03/21");

		Group g3 = new Group();
		g3.groupID = 125;
		g3.groupName = "nhom C++";
		g3.creatorID = a10;
		g3.createDate = new Date("2020/03/22");

		Group g4 = new Group();
		g4.groupID = 126;
		g4.groupName = "nhom tu hoc";
		g4.creatorID = a1;
		g4.createDate = new Date("2020/03/23");

		Group g5 = new Group();
		g5.groupID = 112;
		g5.groupName = "nhom database";
		g5.creatorID = a4;
		g5.createDate = new Date("2020/03/24");

		Group g6 = new Group();
		g6.groupID = 113;
		g6.groupName = "nhom PHP";
		g6.creatorID = a3;
		g6.createDate = new Date("2020/03/25");

		Group g7 = new Group();
		g7.groupID = 80;
		g7.groupName = "nhom du an";
		g7.creatorID = a6;
		g7.createDate = new Date("2020/03/21");

		Group g8 = new Group();
		g8.groupID = 77;
		g8.groupName = "nhom phat trien phan mem";
		g8.creatorID = a7;
		g8.createDate = new Date("2020/03/23");

		Group g9 = new Group();
		g9.groupID = 66;
		g9.groupName = "nhom cong nghe cao";
		g9.creatorID = a9;
		g9.createDate = new Date("2020/03/28");

		Group g10 = new Group();
		g10.groupID = 99;
		g10.groupName = "nhom cong nghe AI";
		g10.creatorID = a8;
		g10.createDate = new Date("2020/03/27");

		// import data in GroupAccount

		GroupAccount ga1 = new GroupAccount();
		ga1.groupID = g10;
		ga1.accountID = a3;
		ga1.joinDate = new Date("2020/04/01");

		GroupAccount ga2 = new GroupAccount();
		ga2.groupID = g1;
		ga2.accountID = a6;
		ga2.joinDate = new Date("2020/04/01");

		GroupAccount ga3 = new GroupAccount();
		ga3.groupID = g7;
		ga3.accountID = a10;
		ga3.joinDate = new Date("2020/04/02");

		GroupAccount ga4 = new GroupAccount();
		ga4.groupID = g2;
		ga4.accountID = a4;
		ga4.joinDate = new Date("2020/04/01");

		GroupAccount ga5 = new GroupAccount();
		ga5.groupID = g5;
		ga5.accountID = a5;
		ga5.joinDate = new Date("2020/04/03");

		// import data in TypeQuestion

		TypeQuestion tp1 = new TypeQuestion();
		tp1.typeID = 50;
		tp1.typeName = TypeName.ESSAY;

		TypeQuestion tp2 = new TypeQuestion();
		tp2.typeID = 51;
		tp2.typeName = TypeName.MULTIPLECHOICE;

		TypeQuestion tp3 = new TypeQuestion();
		tp3.typeID = 52;
		tp3.typeName = TypeName.ESSAY;

		TypeQuestion tp4 = new TypeQuestion();
		tp4.typeID = 53;
		tp4.typeName = TypeName.MULTIPLECHOICE;

		TypeQuestion tp5 = new TypeQuestion();
		tp5.typeID = 54;
		tp5.typeName = TypeName.ESSAY;

		TypeQuestion tp6 = new TypeQuestion();
		tp6.typeID = 55;
		tp6.typeName = TypeName.MULTIPLECHOICE;

		TypeQuestion tp7 = new TypeQuestion();
		tp7.typeID = 56;
		tp7.typeName = TypeName.ESSAY;

		TypeQuestion tp8 = new TypeQuestion();
		tp8.typeID = 57;
		tp8.typeName = TypeName.MULTIPLECHOICE;

		TypeQuestion tp9 = new TypeQuestion();
		tp9.typeID = 58;
		tp9.typeName = TypeName.MULTIPLECHOICE;

		TypeQuestion tp10 = new TypeQuestion();
		tp10.typeID = 59;
		tp10.typeName = TypeName.ESSAY;

		TypeQuestion tp11 = new TypeQuestion();
		tp11.typeID = 60;
		tp11.typeName = TypeName.MULTIPLECHOICE;

		// import data in CategoryQuestion

		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.categoryID = 10;
		cq1.categoryName = "java";

		CategoryQuestion cq2 = new CategoryQuestion();
		cq2.categoryID = 20;
		cq2.categoryName = "NET";

		CategoryQuestion cq3 = new CategoryQuestion();
		cq3.categoryID = 20;
		cq3.categoryName = "SQL";

		CategoryQuestion cq4 = new CategoryQuestion();
		cq4.categoryID = 30;
		cq4.categoryName = "Postman";

		CategoryQuestion cq5 = new CategoryQuestion();
		cq5.categoryID = 40;
		cq5.categoryName = "Ruby";

		// import data in Question

		Question q1 = new Question();
		q1.questionID = 01;
		q1.content = "Phan tich du lieu";
		q1.categoryID = cq1;
		q1.typeID = tp3;
		q1.creatorID = a5;
		q1.createDate = new Date("2020/04/04");

		Question q2 = new Question();
		q2.questionID = 01;
		q2.content = "Tao database";
		q2.categoryID = cq5;
		q2.typeID = tp11;
		q2.creatorID = a5;
		q2.createDate = new Date("2020/04/04");

		Question q3 = new Question();
		q3.questionID = 01;
		q3.content = "Lap trinh huong doi tuong";
		q3.categoryID = cq1;
		q3.typeID = tp8;
		q3.creatorID = a2;
		q3.createDate = new Date("2020/04/06");

		Question q4 = new Question();
		q4.questionID = 01;
		q4.content = "Ung dung trong cong nghe cao AI";
		q4.categoryID = cq2;
		q4.typeID = tp7;
		q4.creatorID = a9;
		q4.createDate = new Date("2020/04/07");

		Question q5 = new Question();
		q5.questionID = 01;
		q5.content = "Thay doi cau truc";
		q5.categoryID = cq3;
		q5.typeID = tp9;
		q5.creatorID = a6;
		q5.createDate = new Date("2020/04/09");

		// import data in Answer

		Answer as1 = new Answer();
		as1.answerID = 2;
		as1.content = "java rat la thu vi";
		as1.questionID = q5;
		as1.isCorrect = true;

		Answer as2 = new Answer();
		as2.answerID = 3;
		as2.content = "query du lieu chinh xac";
		as2.questionID = q2;
		as2.isCorrect = false;

		Answer as3 = new Answer();
		as3.answerID = 4;
		as3.content = "Mysql khong he don gian";
		as3.questionID = q1;
		as3.isCorrect = true;

		Answer as4 = new Answer();
		as4.answerID = 5;
		as4.content = "java basic khai niem ";
		as4.questionID = q3;
		as4.isCorrect = false;

		Answer as5 = new Answer();
		as5.answerID = 6;
		as5.content = "java va php khac nhau";
		as5.questionID = q5;
		as5.isCorrect = true;

		Answer as6 = new Answer();
		as6.answerID = 7;
		as6.content = "C++ rat hay";
		as6.questionID = q2;
		as6.isCorrect = false;

		Answer as7 = new Answer();
		as7.answerID = 8;
		as7.content = "lap trinh va viet code";
		as7.questionID = q4;
		as7.isCorrect = true;

		Answer as8 = new Answer();
		as8.answerID = 9;
		as8.content = "cac doi tuong duoc mo ta trong lap trinh";
		as8.questionID = q2;
		as8.isCorrect = false;

		Answer as9 = new Answer();
		as9.answerID = 10;
		as9.content = "lap trinh giai quyet cac bai toan thuc";
		as9.questionID = q5;
		as9.isCorrect = true;

		Answer as10 = new Answer();
		as10.answerID = 1;
		as10.content = "mo phong va mo hinh van hanh";
		as10.questionID = q2;
		as10.isCorrect = false;

		// import data in Exam

		Exam e1 = new Exam();
		e1.examID = 1;
		e1.code = "test1";
		e1.title = "Viết đúng coding convention";
		e1.categoryID = cq1;
		e1.duration = LocalTime.of(2, 00);
		e1.creatorID = a3;
		e1.createDate = LocalDate.of(2020, 4, 9);

		Exam e2 = new Exam();
		e2.examID = 2;
		e2.code = "test2";
		e2.title = "Tuần thủ các best practice";
		e2.categoryID = cq2;
		e2.duration = LocalTime.of(2, 30);
		e2.creatorID = a1;
		e2.createDate = LocalDate.of(2020, 04, 10);

		Exam e3 = new Exam();
		e3.examID = 3;
		e3.code = "test3";
		e3.title = "thiết kế database";
		e3.categoryID = cq1;
		e3.duration = LocalTime.of(2, 45);
		e3.creatorID = a8;
		e3.createDate = LocalDate.of(2020, 04, 10);

		Exam e4 = new Exam();
		e4.examID = 4;
		e4.code = "test4";
		e4.title = "chuyển sang các Object Java";
		e4.categoryID = cq5;
		e4.duration = LocalTime.of(2, 00);
		e4.creatorID = a10;
		e4.createDate = LocalDate.of(2020, 04, 10);

		Exam e5 = new Exam();
		e5.examID = 5;
		e5.code = "test5";
		e5.title = "tối ưu các thuộc tính java";
		e5.categoryID = cq2;
		e5.duration = LocalTime.of(2, 15);
		e5.creatorID = a2;
		e5.createDate = LocalDate.of(2020, 04, 11);

		Exam e6 = new Exam();
		e6.examID = 6;
		e6.code = "test6";
		e6.title = "chuyen doi primitive va cac object";
		e6.categoryID = cq4;
		e6.duration = LocalTime.of(2, 00);
		e6.creatorID = a7;
		e6.createDate = LocalDate.of(2020, 04, 12);

		Exam e7 = new Exam();
		e7.examID = 7;
		e7.code = "test7";
		e7.title = "lam viec voi cac array";
		e7.categoryID = cq3;
		e7.duration = LocalTime.of(1, 50);
		e7.creatorID = a5;
		e7.createDate = LocalDate.of(2020, 04, 13);

		Exam e8 = new Exam();
		e8.examID = 8;
		e8.code = "test8";
		e8.title = "khai bao cac kieu bien java";
		e8.categoryID = cq3;
		e8.duration = LocalTime.of(2, 15);
		e8.creatorID = a9;
		e8.createDate = LocalDate.of(2020, 03, 23);

		Exam e9 = new Exam();
		e9.examID = 9;
		e9.code = "test9";
		e9.title = "enum va boolean";
		e9.categoryID = cq4;
		e9.duration = LocalTime.of(2, 30);
		e9.creatorID = a4;
		e9.createDate = LocalDate.of(2020, 04, 15);

		Exam e10 = new Exam();
		e10.examID = 10;
		e10.code = "test10";
		e10.title = "Viết code cho web";
		e10.categoryID = cq2;
		e10.duration = LocalTime.of(3, 00);
		e10.creatorID = a6;
		e10.createDate = LocalDate.of(2020, 04, 13);

		// import data in ExamQuestion

		ExamQuestion eq1 = new ExamQuestion();
		eq1.examID = e10;
		eq1.questionID = q4;

		ExamQuestion eq2 = new ExamQuestion();
		eq2.examID = e2;
		eq2.questionID = q4;

		ExamQuestion eq3 = new ExamQuestion();
		eq3.examID = e5;
		eq3.questionID = q5;

		ExamQuestion eq4 = new ExamQuestion();
		eq4.examID = e8;
		eq4.questionID = q4;

		ExamQuestion eq5 = new ExamQuestion();
		eq5.examID = e9;
		eq5.questionID = q5;

		ExamQuestion eq6 = new ExamQuestion();
		eq6.examID = e10;
		eq6.questionID = q2;

		ExamQuestion eq7 = new ExamQuestion();
		eq7.examID = e2;
		eq7.questionID = q3;

		ExamQuestion eq8 = new ExamQuestion();
		eq8.examID = e9;
		eq8.questionID = q1;

		ExamQuestion eq9 = new ExamQuestion();
		eq9.examID = e5;
		eq9.questionID = q1;

		ExamQuestion eq10 = new ExamQuestion();
		eq10.examID = e7;
		eq10.questionID = q3;

		System.out.println("thong tin phong ban:");
		// System.out.println("\n");
		System.out.println("departmentID:" + d1.departmentID);
		System.out.println("departmentName:" + d1.departmentName);
		System.out.println("\n");

		System.out.println("thong tin vi tri cong viec:");
		System.out.println("positionID:" + p1.positionID);
		System.out.println("positionName:" + p1.positionName);
		System.out.println("\n");

		System.out.println("thong tin account");
		System.out.println("accountID:" + a5.accountID);
		System.out.println("email:" + a5.email);
		System.out.println("userName:" + a5.userName);
		System.out.println("fullName:" + a5.fullName);
		System.out.println("createDate:" + a5.createDate);
		System.out.println("\n");

		System.out.println("thong tin group");
		System.out.println("groupID:" + g2.groupID);
		System.out.println("groupName:" + g2.groupName);
		System.out.println("creatorID:" + g2.creatorID.fullName);
		System.out.println("createDate:" + g2.createDate);
		System.out.println("\n");

		System.out.println("thong tin groupAccount");
		System.out.println("groupID:" + ga3.groupID.groupName);
		System.out.println("accountID:" + ga3.accountID.fullName);
		System.out.println("joinDate:" + ga3.joinDate);
		System.out.println("\n");

		System.out.println("thong tin TypeQuestion:");
		System.out.println("typeID:" + tp9.typeID);
		System.out.println("typeName:" + tp9.typeName);
		System.out.println("\n");

		System.out.println("thong tin CategoryQuestion:");
		System.out.println("categoryID:" + cq4.categoryID);
		System.out.println("categoryName:" + cq4.categoryName);
		System.out.println("\n");

		System.out.println("thong tin Question:");
		System.out.println("questionID:" + q5.questionID);
		System.out.println("content:" + q5.content);
		System.out.println("categoryID:" + q5.categoryID.categoryName);
		System.out.println("\n");

		System.out.println("thong tin Answer:");
		System.out.println("answerID:" + as6.answerID);
		System.out.println("content:" + as6.content);
		System.out.println("questionID:" + as6.questionID.content);
		System.out.println("isCorrect:" + as6.isCorrect);
		System.out.println("\n");

		System.out.println("thong tin Exam:");
		System.out.println("examID:" + e8.examID);
		System.out.println("code:" + e8.code);
		System.out.println("title:" + e8.title);
		System.out.println("categoryID:" + e8.categoryID.categoryName);
		System.out.println("\n");

		System.out.println("thong tin ExamQuestion:");
		System.out.println("examID:" + eq9.examID.title);
		System.out.println("questionID:" + eq9.questionID.content);
		System.out.println("\n");

		// thử các câu lênh in khác

		System.out.println(eq5.examID.creatorID.fullName);
		System.out.println(a3.departmentID.departmentName);
		System.out.println(g4.creatorID.fullName);

	}

}
