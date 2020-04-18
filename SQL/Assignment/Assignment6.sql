-- Assignment 6

USE TestingSystem;

-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó

-- cach 1: Store procedure

DROP PROCEDURE IF EXISTS get_account_department;
DELIMITER $$
CREATE PROCEDURE get_account_department(IN in_department_name CHAR(50))
BEGIN
		SELECT 	d.DepartmentName, a.AccountID, a.UserName, a.FullName, a.Email
		FROM  	Department d
		JOIN	`Account` a ON d.DepartmentID = a.DepartmentID
		WHERE 	d.DepartmentName = in_department_name;
END $$ get_account_department
DELIMITER ;

-- use 

call testingsystem.get_account_department('Sale ');

-- cach 2: Funtion

DROP FUNCTION IF EXISTS get_account_department;
DELIMITER $$
CREATE FUNCTION get_account_department(in_department_name VARCHAR(50)) RETURNS TINYINT 
READS SQL DATA
DETERMINISTIC
BEGIN
		DECLARE Account_id TINYINT;
			SELECT 	a.AccountID INTO Account_id
			FROM  	Department d
			JOIN 	`Account` a ON d.DepartmentID = a.DepartmentID
			WHERE 	d.DepartmentName = in_department_name;
        RETURN Account_id;
END $$
DELIMITER ;
-- use

CALL get_account_department('Accounting');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group

DROP PROCEDURE IF EXISTS get_account_GroupAccount;
DELIMITER $$
CREATE PROCEDURE get_account_GroupAccount(IN in_GroupAccount_id TINYINT)
BEGIN
		SELECT ga.GroupID, GROUP_CONCAT(ga.AccountID ),  COUNT(ga.AccountID) AS so_account
		FROM  GroupAccount ga
		WHERE ga.GroupID = in_GroupAccount_id;
END $$
DELIMITER ;

-- use
call get_account_GroupAccount('3');

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại

DROP PROCEDURE IF EXISTS thongke_typequestion;
DELIMITER $$
CREATE PROCEDURE thongke_typequestion (IN in_TypeQuestion ENUM('Essay', 'Multiple-Choice'), IN in_Month_current TINYINT UNSIGNED, OUT out_Number_Question TINYINT UNSIGNED)
   BEGIN 
          SELECT  COUNT(q.QuestionID) INTO out_Number_Question
          FROM Question q
          JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
          WHERE  tq.TypeName = in_TypeQuestion AND MONTH(CURDATE()) = in_Month_current
		  GROUP BY(q.TypeID);
   END $$
DELIMITER ;

-- use

set @out_Number_Question = 0;
call testingsystem.thongke_typequestion('Multiple-Choice', '5', @out_Number_Question);
select @out_Number_Question;


-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất

DROP PROCEDURE IF EXISTS Question_Of_Type;
DELIMITER $$
CREATE PROCEDURE Question_Of_Type(OUT out_Type_Max_Question TINYINT) 
   BEGIN 
		WITH Count_Question AS(
		SELECT TypeID, COUNT(q.QuestionID) AS x
		FROM Question q
		GROUP BY q.TypeID)
	SELECT TypeID INTO out_Type_Max_Question
	FROM Count_Question
	WHERE x = (SELECT MAX(x) FROM Count_Question);
   END $$
DELIMITER ;

-- use

set @out_Type_Max_Question = 0;
call testingsystem.Question_Of_Type(@out_Type_Max_Question);
select @out_Type_Max_Question;

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question

  SELECT DISTINCT TypeName
  FROM TypeQuestion tq
  JOIN Question q ON tq.TypeID = q.TypeID
  WHERE tq.TypeID = @out_Type_Max_Question;


-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào

DROP PROCEDURE IF EXISTS string_of_user;
DELIMITER $$
CREATE PROCEDURE string_of_user(IN in_string VARCHAR(50), OUT out_string_group NVARCHAR(50), OUT out_string_user NVARCHAR(50))
BEGIN
		SELECT g.GroupName, a.UserName INTO out_string_group, out_string_user
        FROM `Group` g
		JOIN `Account` a ON a.AccountID = g.CreatorID
        WHERE g.GroupName LIKE CONCAT('%', in_string, '%') OR UserName LIKE CONCAT('%', in_string, '%');
END$$
DELIMITER ;

-- use
SET @out_string_group = ' '; 
SET @out_string_user = ' '; 
CALL string_of_user ('tracy',@out_string_group,@out_string_group); 
SELECT @out_string_group, @out_string_user;  

/*Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán 
username sẽ giống email nhưng bỏ phần @..mail đi
positionID: sẽ có default là developer
departmentID: sẽ được cho vào 1 phòng chờ
Sau đó in ra kết quả tạo thành công*/

DROP PROCEDURE IF EXISTS new_Update;
DELIMITER $$
CREATE PROCEDURE new_Update (IN in_Email VARCHAR(50), IN in_FullName NVARCHAR(50))
   BEGIN 
		DECLARE UserName NVARCHAR(50) DEFAULT SUBSTRING_INDEX(in_Email,"@",1 );
		DECLARE PositionID TINYINT UNSIGNED DEFAULT 1;
        DECLARE DepartmentID TINYINT UNSIGNED DEFAULT 10;
        DECLARE CreateDate DATE DEFAULT NOW();
        INSERT INTO `Account` (Email, UserName, FullName, DepartmentID, PositionID, CreateDate)
        VALUES 				  (in_Email, UserName, in_FullName, DepartmentID, PositionID, CreateDate);
		SELECT *
        FROM `Account` a
        WHERE a.UserName = UserName ;
   END $$
DELIMITER ;

call testingsystem.new_Update('aliceK94', 'hoang van tinh');

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

DROP PROCEDURE IF EXISTS Max_Content;
DELIMITER $$
CREATE PROCEDURE Max_Content(IN in_Type_Name ENUM('Essay', 'Multiple-Choice'))
    BEGIN
		WITH Length_Content AS(
			SELECT q.Content, LENGTH(q.Content) AS x
				FROM Question q
				JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
				WHERE tq.TypeName = in_Type_Name )
		SELECT Content
		FROM Length_Content
		WHERE x = (SELECT MAX(x) FROM Length_Content);
	END $$
DELIMITER ;

call testingsystem.Max_Content('essay');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID

DROP PROCEDURE IF EXISTS Delete_Exam;
DELIMITER $$
CREATE PROCEDURE Delete_Exam(IN in_Exam_ID TINYINT)
    BEGIN
		DELETE 
        FROM Exam
        WHERE ExamID = in_Exam_ID;
	END $$
DELIMITER ;

call testingsystem.Delete_Exam(3);

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa), sau đó in số lượng record đã remove từ các table liên quantrong khi removing

DROP PROCEDURE IF EXISTS Exam_Works;
DELIMITER $$
CREATE PROCEDURE Exam_Works()
   BEGIN
		SELECT *
		FROM Exam
		WHERE YEAR(CreateDate) = (SELECT DISTINCT (YEAR(CreateDate) - 3) FROM Exam);
   END $$
DELIMITER 
CALL Exam_Works();
---------------------------------------------
DROP PROCEDURE IF EXISTS Delete_Exam;
DELIMITER $$
CREATE PROCEDURE Delete_Exam()
    BEGIN
		DELETE 
        FROM Exam
		WHERE YEAR(CreateDate) = (SELECT DISTINCT (YEAR(CreateDate) - 3) FROM Exam);
	END $$
DELIMITER ;
CALL Delete_Exam();
SELECT COUNT(ExamID)
		FROM Exam
		WHERE YEAR(CreateDate) = (SELECT DISTINCT (YEAR(CreateDate) - 3) FROM Exam);

-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc

DROP PROCEDURE IF EXISTS Delete_Department;
DELIMITER $$
CREATE PROCEDURE Delete_Department(IN in_Department_Name VARCHAR(50))
   BEGIN
		DELETE 
        FROM Department
        WHERE DepartmentName = in_Department_Name;
        ALTER TABLE Department
			ALTER DepartmentName SET DEFAULT 'phong cho';
   END $$
DELIMITER ;

-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay

DROP PROCEDURE IF EXISTS Question_One_Month;
DELIMITER $$
CREATE PROCEDURE Question_One_Month()
   BEGIN
		SELECT MONTH(q.CreateDate), COUNT(1)
		FROM question q
		WHERE YEAR(CreateDate) = YEAR(NOW())
		GROUP BY (MONTH(q.CreateDate));
   END $$
DELIMITER ;

-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất (nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")







