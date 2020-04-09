-- ASSIGNMENT 3--

USE TestingManagement;

-- Question 1: Thêm 10 bản ghi vào mỗi bảng

INSERT INTO Department 			(DepartmentName)
VALUES							('Accounting department'),
								('Sales department'),
								('Administration department'),
								('Human Resources department'),
								('Customer Service department'),
								('Financial department'),
								('Research & Development department'),
								('Quality department'),
								('Training department'),
								('Marketing department');
    
INSERT INTO `Position` 			(PositionName)
VALUES							('Director'),
								('Head of Department'),
								('Team Leader'),
								('Staff'),
								('Board Chairman'),
								('Deputy of department'),
								('Chief of Executive Operator'),
								('Board of Director'),
								('secretary'),
								('Deputy director');
    
INSERT INTO `Account` 			(Email	,							UserName,			FullName,				DepartmentID,	PositionID,			CreateDate)
VALUES							('selina.gottlieb88@gmail.com',		'selina',		'nguyen Van hoang', 			1,				3,				'2018-03-05'),
								('fbalistreri76@gmail.com',			'tracy',		'tran hong quang', 				2,				10,				'2018-02-08'),
								('anika.mohr45@gmail.com',			'jonh',			'luong thi hue', 				4,				2,				'2017-03-12'),
								('malvina54@gmail.com',				'malvin',		'Nguyen Van tam', 				6,				6,				'2017-02-01'),
								('bartell.burley11@gmail.com',		'bartell',		'le duc tho', 					3,				1,				'2018-03-07'),
								('vladimir.hoeger32@gmail.com',		'vladimir',		'bui tien dung', 				10,				4,				'2018-02-05'),
								('kemmer.toni67@gmail.com',			'kemmer',		'pham trung kien', 				7,				8,				'2018-03-02'),
								('aweimann909@gmail.com',			'mayer',		'lai hong hoa', 				5,				9,				'2018-03-08'),
								('aliceK94@gmail.com',				'alice',		'hoang van tinh', 				8,				7,				'2017-04-04'),
								('david234@gmail.com',				'david',		'nguyen Van dinh', 				9,				5,				'2017-06-04');

INSERT INTO `Group` 			(GroupName,				CreatorID,					CreateDate)
VALUES							('Group1',					3,						'2018-06-20'),
								('Group2',					5,						'2018-09-29'),
								('Group3',					10,						'2020-02-23'),
								('Group4',					6,						'2019-01-01'),
								('Group5',					8,						'2019-03-13'),
								('Group6',					2,						'2019-08-15'),
								('Group7',					4,						'2018-05-07'),
								('Group8',					1,						'2019-07-04'),
								('Group9',					7,						'2020-02-28'),
								('Group10',					9,						'2019-03-07');
						
INSERT INTO GroupAccount 		(GroupID,		AccountID,        	JoinDate)
VALUES							(1,			     1,   				'2018-06-05'),
								(2,			     2,   				'2018-08-06'),
								(3,			     3,   				'2018-06-03'),
								(4,			     4,   				'2020-07-03'),
								(5,			     5,   				'2018-07-14'),
								(6,			     6,   				'2018-12-12'),
								(7,			     7,   				'2019-02-17'),
								(8,			     8,   				'2019-08-22'),
								(9,			     9,   				'2020-01-11'),
								(10,		     10,   				'2020-03-09');
INSERT INTO TypeQuestion		(TypeName)
VALUES							('Text Question'),
								('Image Question'),
								('Matrix Table Question'),
								('Multiple Choice Questions'),
								('Reference Data Question'),
								('Contact Information Question'),
								('Demographic Question'),
								('Visual Analog Question'),
								('Stapel Scale Question'),
								('Constant Sum Question');
                            
INSERT INTO CategoryQuestion 	(CategoryName)
VALUES							('java'),
								('c++'),
								('php'),
								('mysql'),
								('dot net'),
								('Ado.net'),
								('asp.net'),
								('database'),
								('front-end'),
								('back-end');

INSERT INTO Question 			(Content,		CategoryID,		TypeID,			CreatorID,		CreateDate		)
VALUES							('q1',				1,				3,				4,			'2018-05-05'	),
								('q2',				3,				2,				5,			'2018-09-06'	),
								('q3',				6,				7,				6,			'2018-01-03'	),
								('q4',				2,				8,				2,			'2018-06-03'	),
								('q5',				8,				6,				1,			'2018-07-14'	),
								('q6',				9,				4,				10,			'2018-11-12'	),
								('q7',				10,				5,				9,			'2019-04-17'	),
								('q8',				4,				10,				7,			'2019-08-11'	),
								('q9',				5,				9,				3,			'2020-05-23'	),
								('q10',				7,				1,				8,			'2020-07-09'	);

INSERT INTO Answer 				(Content,			QuestionID,		IsCorrect	)
VALUES							('Content1',			7,				'y'		),
								('Content2',			4,				'y'		),
								('Content3',			8,				'y'		),
								('Content4',			2,				'n'		),
								('Content5',			6,				'y'		),
								('Content6',			9,				'n'		),
								('Content7',			10,				'n'		),
								('Content8',			7,				'y'		),
								('Content9',			1,				'n'		),
								('Content10',			5,				'n'		);

INSERT INTO Exam 				( `Code`,		Title,		CategoryID,		Duration,		CreatorID,		CreateDate)
VALUES							('Code1',		'java',			3,			70,					3,			'2018-06-05'),
								('Code2',		'c++',			4,			55,					4,			'2018-08-06'),
								('Code3',		'php',			7,			60,					10,			'2018-06-09'),
								('Code4',		'mysql',		9,			80,					5,			'2018-07-03'),
								('Code5',		'dot net',		1,			90,					1,			'2018-07-14'),
								('Code6',		'Ado.net',		2,			100,				8,			'2018-12-12'),
								('Code7',		'asp.net',		10,			65,					7,			'2019-02-17'),
								('Code8',		'database',		5,			58,					9,			'2019-08-22'),
								('Code9',		'front-en',		6,			75,					6,			'2020-01-11'),
								('Code10',		'back-end',		8,			60,					2,			'2020-03-09');

INSERT INTO ExamQuestion 		(QuestionID)
VALUES							(	3	),
								(	4	),
								(	7	),
								(	1	),
								(	5	),
								(	10	),
								(	2	),
								(	6	),
								(	8	),
								(	7	);

-- Question 2: Lấy tất cả các phòng ban

SELECT 	* 
FROM 	department;

-- Question 3: Lấy ra id của phòng ban "Sale"

SELECT 	DepartmentID 
FROM 	Department 
WHERE 	DepartmentName 
LIKE 	'%Sale%';

-- Question 4: lấy ra thông tin account có full name dài nhất và sắp xếp chúng theo thứ tự giảm dần

SELECT 		* 
FROM 		`Account` 
WHERE 		LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`)
ORDER BY 	Fullname DESC;

-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3

SELECT 		* 
FROM 		`Account` 
WHERE 		LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`) 
AND 		DepartmentID = 3
ORDER BY 	Fullname DESC;

-- Question 6: lấy ra tên group đã tham gia trước ngày 20/12/2019

SELECT 	GroupName 
FROM 	`Group`
WHERE 	CreateDate < '2019-12-20';

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời

SELECT 		QuestionID
FROM 		Answer
GROUP BY 	QuestionID
HAVING 		COUNT(QuestionID)>=4;

-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019

SELECT `Code` 
FROM Exam
WHERE Duration >= 60 
AND CreateDate < '2019-12-20';

-- Question 9: Lấy ra 5 group được tạo gần đây nhất

SELECT * 
FROM `Group`
ORDER BY CreateDate DESC 
LIMIT 5;

-- Question 10: Đếm số nhân viên thuộc department có id = 2

SELECT COUNT(AccountID) AS 'SO NHAN VIEN' 
FROM `Account`
WHERE DepartmentID = 2;

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"

SELECT *
FROM `Account` 
WHERE Fullname
LIKE 'D%o' ;

-- Question 12: xóa tất cả các exam được tạo trước ngày 20/12/2019

DELETE FROM Exam 
WHERE CreateDate < '2019-12-20';

-- Question 13: xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"

DELETE FROM Question 
WHERE Content LIKE 'câu hỏi%';

-- WHERE (SUBSTRING_INDEX(Content,' ',2))  'Câu hỏi';

-- Question 14: update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn

UPDATE `Account`
SET Fullname ='Nguyễn Bá Lộc', Email = 'loc.nguyenba@vti.com.vn'
WHERE AccountID = 5;

-- Question 15: update account có id = 5 sẽ thuộc group có id = 4

UPDATE GroupAccount
SET  GroupID = 4
WHERE AccountID = 5;


















