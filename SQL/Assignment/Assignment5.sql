-- ASSIGNMENT 5--

USE Testingsyetem ;

-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale  

DROP VIEW IF EXISTS 	V_Department;
CREATE VIEW 	 V_Department AS
SELECT			d.DepartmentName, GROUP_CONCAT(a.FullName) , COUNT(AccountID)
FROM  			Department d
JOIN		 	`Account` a 	ON	d.DepartmentID = a.DepartmentID 
WHERE  			d.DepartmentName = 'sale'
GROUP BY 		d.DepartmentID ;

-- SELECT * FROM V_Department ;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất  

DROP VIEW IF EXISTS 	V_Account;
CREATE VIEW  	V_Account  AS
SELECT			a.AccountID, a.Email, a.FullName, a.DepartmentID , COUNT(GroupID)
FROM			`Account` a 
JOIN			GroupAccount ga ON a.AccountID = ga.AccountID
GROUP BY		a.AccountID  
HAVING  		COUNT(GroupID) = (SELECT COUNT(GroupID)
								FROM		`Account` a 
								JOIN		GroupAccount ga ON a.AccountID = ga.AccountID
								GROUP BY	a.AccountID  
								ORDER BY  	COUNT(GroupID) DESC 
                                LIMIT 1);
															
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 14 từ được coi là quá dài) và xóa nó đi

DROP VIEW IF EXISTS 	V_Question;
CREATE VIEW  			V_Question   AS
SELECT  				QuestionID, LENGTH(Content)
FROM            		Question
WHERE 					LENGTH(Content) > 14 ;

-- SELECT * FROM V_Question;

DELETE 					a 
FROM					Answer a
JOIN  					V_Question vq 	ON   a.QuestionID = vq.QuestionID ;

DELETE 				 	q
FROM   				  	Question q
JOIN				  	V_Question vq ON vq.QuestionID = q.QuestionID;

SELECT * FROM question;
					
-- Question 4:  Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất 

DROP VIEW IF EXISTS  	V_Department_maxNV;
CREATE VIEW			 	V_Department_maxNV AS	
SELECT					g.GroupID,g.GroupName, COUNT(ga.AccountID)
FROM			 		`Group` g 
JOIN		  	 		GroupAccount ga ON g.GroupID = ga.GroupID
GROUP BY       			g.GroupName
HAVING  				COUNT(ga.AccountID) = (SELECT COUNT(ga.AccountID)
												FROM		`Group`  g 
												JOIN		GroupAccount ga ON g.GroupID = ga.GroupID
												GROUP BY	g.GroupName 
												ORDER BY	COUNT(ga.AccountID)  DESC 
                                                LIMIT 1);
 
SELECT * FROM V_Department_maxNV;

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyen tạo 

DROP VIEW IF EXISTS V_Question_of_Nguyen ;
CREATE  VIEW 		V_Question_of_Nguyen  AS
SELECT   	 		GROUP_CONCAT(q.Content," ") AS cau_hoi, a.FullName
FROM     			`Account` a
JOIN				Question q 	ON	q.CreatorID = a.AccountID
WHERE				FullName 	LIKE  'Nguyen%' 
GROUP BY 			AccountID ;

SELECT * FROM V_Question_of_Nguyen;