import java.util.Date;

public class Question {

	int questionID; // định danh của câu hỏi (auto increment)

	String content; // nội dung của câu hỏi

	CategoryQuestion categoryID; // định danh của chủ đề câu hỏi

	TypeQuestion typeID; // định danh của loại câu hỏi

	Account creatorID; // id của người tạo câu hỏi

	Date createDate; // ngày tạo câu hỏi

	CategoryQuestion[] categoryQuestions;

	TypeQuestion[] typeQuestions;

	Account[] accounts;

}
