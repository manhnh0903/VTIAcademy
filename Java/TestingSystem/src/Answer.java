
public class Answer {


		byte answerID; // định danh của câu trả lời (auto increment)
		
		String content; // nội dung của câu trả lời
		
		Question questionID; // định danh của câu hỏi
		
		boolean isCorrect; // câu trả lời này đúng hay sai
		
		Question[] questions;

}
