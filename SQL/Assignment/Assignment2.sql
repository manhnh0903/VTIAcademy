-- Create database TestingSystem
DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE IF NOT EXISTS TestingSystem;
USE TestingSystem;

-- Create table with constraint and datatype
DROP TABLE IF EXISTS Department;
CREATE TABLE IF NOT EXISTS Department (
    DepartmentID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    DepartmentName NVARCHAR(50) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS `Position`;
CREATE TABLE IF NOT EXISTS `Position` (
    PositionID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    PositionName NVARCHAR(50) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS `Account`;
CREATE TABLE IF NOT EXISTS `Account` (
    AccountID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email VARCHAR(50) NOT NULL UNIQUE KEY,
    UserName NVARCHAR(50) NOT NULL UNIQUE KEY,
    FullName NVARCHAR(50) NOT NULL,
    DepartmentID TINYINT UNSIGNED NOT NULL,
    PositionID TINYINT UNSIGNED NOT NULL,
    CreateDate DATE NOT NULL, 
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID) ON DELETE CASCADE,
    FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID) ON DELETE CASCADE
);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE IF NOT EXISTS `Group` (
    GroupID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    GroupName NVARCHAR(50) NOT NULL UNIQUE KEY,
    CreatorID TINYINT UNSIGNED NOT NULL,
    CreateDate DATE NOT NULL,
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID) ON DELETE CASCADE
);

DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE IF NOT EXISTS GroupAccount (
	GroupID TINYINT UNSIGNED NOT NULL,
	AccountID TINYINT UNSIGNED NOT NULL,
	JoinDate DATE NOT NULL,
    PRIMARY KEY(GroupID,AccountID),
    FOREIGN KEY(AccountID) REFERENCES `Account`(AccountID) ON DELETE CASCADE,
    FOREIGN KEY(GroupID) REFERENCES `Group`(GroupID) ON DELETE CASCADE
);

DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE IF NOT EXISTS TypeQuestion (
    TypeID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TypeName NVARCHAR(50) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE IF NOT EXISTS CategoryQuestion (
    CategoryID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    CategoryName NVARCHAR(50) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS Question;
CREATE TABLE IF NOT EXISTS Question (
    QuestionID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content NVARCHAR(500) NOT NULL,
    CategoryID TINYINT UNSIGNED NOT NULL,
    TypeID TINYINT UNSIGNED NOT NULL,
    CreatorID TINYINT UNSIGNED NOT NULL UNIQUE KEY,
    CreateDate DATE NOT NULL,
    FOREIGN KEY(TypeID) REFERENCES TypeQuestion(TypeID) ON DELETE CASCADE,
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID) ON DELETE CASCADE,
    FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountID) ON DELETE CASCADE
);

DROP TABLE IF EXISTS Answer;
CREATE TABLE IF NOT EXISTS Answer (
    AnswerID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content NVARCHAR(50) NOT NULL,
    QuestionID TINYINT UNSIGNED NOT NULL,
    IsCorrect ENUM('Y', 'N'),
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID) ON DELETE CASCADE
);

DROP TABLE IF EXISTS Exam;
CREATE TABLE IF NOT EXISTS Exam (
    ExamID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code` NVARCHAR(20) NOT NULL UNIQUE KEY,
    Title NVARCHAR(50) NOT NULL,
    CategoryID TINYINT UNSIGNED NOT NULL,
    Duration TINYINT UNSIGNED NOT NULL,
    CreatorID TINYINT UNSIGNED NOT NULL,
    CreateDate DATE NOT NULL,
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID) ON DELETE CASCADE,
    FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountID) ON DELETE CASCADE
);

DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE IF NOT EXISTS ExamQuestion (
    ExamID TINYINT UNSIGNED NOT NULL,
    QuestionID TINYINT UNSIGNED NOT NULL,
    PRIMARY KEY(ExamID, QuestionID),
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID) ON DELETE CASCADE,
    FOREIGN KEY(ExamID) REFERENCES Exam(ExamID) ON DELETE CASCADE
);

-- Question 1: Thêm 10 bản ghi vào mỗi bảng

INSERT INTO Department 			(DepartmentName)
VALUES							('Accounting '),
								('Sale'),
								('Administration '),
								('Human Resources '),
								('Customer Service '),
								('Financial '),
								('Research & Development '),
								('Quality '),
								('Training '),
								('Marketing  ');
    
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
								('anika.mohr45@gmail.com',			'jonh',			'luong thi hue', 				4,				7,				'2017-03-12'),
								('malvina54@gmail.com',				'malvin',		'Nguyen Van tam', 				6,				6,				'2017-02-01'),
								('bartell.burley11@gmail.com',		'bartell',		'le duc tho', 					3,				3,				'2018-03-07'),
								('vladimir.hoeger32@gmail.com',		'vladimir',		'bui tien dung', 				4,				4,				'2018-02-05'),
								('kemmer.toni67@gmail.com',			'kemmer',		'pham trung kien', 				7,				7,				'2018-03-02'),
								('aweimann909@gmail.com',			'mayer',		'lai hong hoa', 				5,				1,				'2018-03-08'),
								('aliceK94@gmail.com',				'alice',		'hoang van tinh', 				5,				7,				'2017-04-04'),
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
								('Group10',					9,						'2019-03-07'),
								('Group11',					3,						'2019-01-07'),
								('Group12',					4,						'2019-11-07'),
								('Group13',					7,						'2019-03-03'),
								('Group14',					6,						'2019-06-09'),
								('Group15',					6,						'2019-07-01');
						
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
								('Content2',			5,				'y'		),
								('Content3',			8,				'y'		),
								('Content4',			2,				'n'		),
								('Content5',			6,				'y'		),
								('Content6',			9,				'n'		),
								('Content7',			10,				'n'		),
								('Content8',			7,				'y'		),
								('Content9',			2,				'n'		),
								('Content11',			5,				'n'		),
                                ('Content12',			6,				'y'		),
                                ('Content13',			10,				'y'		),
                                ('Content14',			5,				'n'		);

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

INSERT INTO ExamQuestion 		(ExamID,	QuestionID)
VALUES							(	3,        	7),
								(	4,			9),
								(	7, 			10), 
								(	1, 			3),
								(	5, 			5),
								(	10, 		1),
								(	2, 			2),
								(	6, 			4),
								(	8, 			6),
								(	7, 			8);



