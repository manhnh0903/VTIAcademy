
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Exam {

		byte examID; // định danh của đề thi (auto increment)
		
		String code; // mã đề thi
		
		String title; // tiêu đề của đề thi
		
		CategoryQuestion categoryID; // định danh của chủ đề thi
		
		LocalTime duration; // thời gian thi
		
		Account creatorID; // id của người tạo đề thi
		
		LocalDate createDate; // ngày tạo đề thi
		
		CategoryQuestion[] categoryQuestions;
		
		Account[] accounts;


}
