-- Insert data
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
    
INSERT INTO Position 			(PositionName)
VALUES							('Director'),
								('Head of Department'),
								('Team Leader'),
								('Staff'),
								('Board Chairman'),
								('Deputy of department'),
								('Chief of Executive Operator'),
								('Board of Director'),
								('Board Chairman'),
								('Deputy director');
    
INSERT INTO `Account` 			(Email	,							UserName,			FullName,				DepartmentID,	PositionID,			CreateDate)
VALUES							('selina.gottlieb88@gmail.com',		'selina',		'nguyen Van hoang', 			1,				3,				'2018-03-05'),
								('fbalistreri76@gmail.com',			'tracy',		'tran hong quang', 				2,				10,				'2018-21-08'),
								('anika.mohr45@gmail.com',			'jonh',			'luong thi hue', 				4,				2,				'2017-30-12'),
								('malvina54@gmail.com',				'malvin',		'Nguyen Van tam', 				6,				6,				'2017-09-01'),
								('bartell.burley11@gmail.com',		'bartell',		'le duc tho', 					3,				1,				'2018-13-07'),
								('vladimir.hoeger32@gmail.com',		'vladimir',		'bui tien dung', 				10,				4,				'2018-15-05'),
								('kemmer.toni67@gmail.com',			'kemmer',		'pham trung kien', 				7,				8,				'2018-11-02'),
								('aweimann909@gmail.com',			'mayer',		'lai hong hoa', 				5,				9,				'2018-14-08'),
								('aliceK94@gmail.com',				'alice',		'hoang van tinh', 				8				7,				'2017-04-04'),
								('david234@gmail.com',				'david',		'nguyen Van dinh', 				9,				5,				'2017-06-04');

INSERT INTO `Group` 			(GroupName,				CreatorID,					CreateDate)
VALUES							('Group1',					3,						'2018-06-20'),
								('Group2',					5,						'2017-09-29'),
								('Group3',					10,						'2018-02-23'),
								('Group4',					6,						'2019-01-01'),
								('Group5',					8,						'2019-03-13'),
								('Group6',					2,						'2018-08-15'),
								('Group7',					4,						'2017-05-07'),
								('Group8',					1,						'2019-07-04'),
								('Group9',					7,						'2018-02-28'),
								('Group10',					9,						'2019-03-07');
						
INSERT INTO GroupAccount 		(AccountID,        			JoinDate)
VALUES							('GroupAccount1',        	'NULL'),
								('GroupAccount2',        	'NULL'),
								('GroupAccount3',        	'NULL'),
								('GroupAccount4',        	'NULL'),
								('GroupAccount5',        	'NULL'),
								('GroupAccount6',        	'NULL'),
								('GroupAccount7',        	'NULL'),
								('GroupAccount8',        	'NULL'),
								('GroupAccount9',        	'NULL'),
								('GroupAccount9',        	'NULL');
                            
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
VALUES							('Category1'),
								('Category2'),
								('Category3'),
								('Category4'),
								('Category5'),
								('Category6'),
								('Category7'),
								('Category8'),
								('Category9'),
								('Category10');

INSERT INTO Question 			(Content,				TypeID,			CreatorID,		CreateDate)
VALUES							('Content1',				1,				3,			'NULL')
								('Content2',				3,				2,			'NULL')
								('Content3',				6,				7,			'NULL')
								('Content4',				2,				8,			'NULL')
								('Content5',				8,				6,			'NULL')
								('Content6',				9,				4,			'NULL')
								('Content7',				10,				5,			'NULL')
								('Content8',				4,				10,			'NULL')
								('Content9',				5,				9,			'NULL')
								('Content10',				7,				1,			'NULL');

INSERT INTO Answer 				(Content,			QuestionID,			IsCorrect)
VALUES							('Content1',				7,			'y')
								('Content2',				4,			'y')
								('Content3',				8,			'y')
								('Content4',				2,			'n')
								('Content5',				6,			'y')
								('Content6',				9,			'n')
								('Content7',				10,			'n')
								('Content8',				7,			'y')
								('Content9',				1,			'n')
								('Content10',				5,			'n');

INSERT INTO Exam 				( `Code`,			Title,		CategoryID,		Duration,		CreatorID,		CreateDate)
VALUES							('Code1',		'Title1',		3,				'NULL',			3,				'NULL'),
								('Code2',		'Title2',		4,				'NULL',			4,				'NULL'),
								('Code3',		'Title3',		7,				'NULL',			10,				'NULL'),
								('Code4',		'Title4',		9,				'NULL',			5,				'NULL'),
								('Code5',		'Title5',		1,				'NULL',			1,				'NULL'),
								('Code6',		'Title6',		2,				'NULL',			8,				'NULL'),
								('Code7',		'Title7',		10,				'NULL',			7,				'NULL'),
								('Code8',		'Title8',		5,				'NULL',			9				'NULL'),
								('Code9',		'Title9',		6,				'NULL',			6,				'NULL'),
								('Code10',		'Title10',		8,				'NULL',			2,				'NULL');

INSERT INTO ExamQuestion 		(ExamID,	QuestionID)
VALUES							(8,				3),
								(1,				4),
								(3,				7),
								(2,				1),
								(9,				5),
								(7,				10),
								(2,				2),
								(4,				6),
								(5,				8),
								(6,				7);

-- Query database



























