-- ASSIGNMENT 4--

USE TestingSystem;

-- Exercise 1: Join

-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ 

SELECT 		a.FullName, d.DepartmentID, d.DepartmentName
FROM		`Account` a 
JOIN 		Department d ON a.DepartmentID=d.DepartmentID
ORDER BY 	d.DepartmentID ASC;
			
-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 

SELECT 			*
FROM			`Account`
WHERE			CreateDate  > '2010-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các Staff 

SELECT 			p.PositionName, a.FullName
FROM 			`Account` a
JOIN 			`Position` p ON a.PositionID=p.PositionID
WHERE 			PositionName = 'Staff';


-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >=2 nhân viên 

SELECT 			d.DepartmentID, d.DepartmentName, COUNT(AccountID) AS so_nhan_vien, GROUP_CONCAT(a.Fullname)
FROM 			Department d
JOIN 			`Account` a ON d.DepartmentID = a.DepartmentID
GROUP BY 		d.DepartmentID
HAVING			COUNT(AccountID)>=2;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất 

SELECT 			q.QuestionID, q.Content, COUNT(eq.QuestionID)
FROM 			Question q
JOIN 			ExamQuestion eq ON q.QuestionID=eq.QuestionID
GROUP BY 		q.QuestionID
HAVING 			COUNT(ExamID) = (SELECT COUNT(eq.QuestionID)
								FROM 		Question q
								JOIN 		ExamQuestion eq ON q.QuestionID=eq.QuestionID
								GROUP BY 	eq.QuestionID
								ORDER BY 	COUNT(eq.QuestionID) DESC
								LIMIT 		1);

-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question 		
											
SELECT 			c.CategoryID, c.CategoryName, COUNT(QuestionID) AS so_cau_hoi
FROM 			Question q 
JOIN 			CategoryQuestion c ON q.CategoryID =c.CategoryID
GROUP BY 		CategoryID;
 
-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam 

SELECT   		q.QuestionID, COUNT(ExamID) AS so_cau_hoi
FROM 			Exam c
JOIN 			Question q ON q.CategoryID =c.CategoryID
GROUP BY 		QuestionID;

 -- Question 8: Lấy ra Question có nhiều câu trả lời nhất 
 
SELECT 		q.QuestionID, q.Content, COUNT(AnswerID) AS so_cau_tra_loi
FROM 		Question q
JOIN 		Answer a ON q.QuestionID = a.QuestionID
GROUP BY 	q.QuestionID 
HAVING 		COUNT(AnswerID)=(SELECT	COUNT(AnswerID)
							FROM 		Question q
							JOIN 		Answer a ON q.QuestionID=a.QuestionID
							GROUP BY 	q.QuestionID 
							ORDER BY 	COUNT(AnswerID) DESC 
							LIMIT 		1);

-- Question 9: Thống kê số lượng account trong mỗi group 

SELECT 			g.GroupID, g.GroupName, COUNT(AccountID) AS so_nhan_vien
FROM 			`Group` g
JOIN 			GroupAccount ga ON g.GroupID = ga.GroupID
GROUP BY 		GroupID;

-- Question 10: Tìm chức vụ có ít người nhất  

SELECT			p.PositionID, p.PositionName, COUNT(a.AccountID) 
FROM 			`Position` p 
LEFT JOIN 		`Account` a ON p.PositionID = a.PositionID
GROUP BY 		p.PositionID
HAVING 			COUNT(a.AccountID)= ( SELECT   COUNT(a.AccountID) 
									FROM 		`Position` p 
									LEFT JOIN 	 `Account` a ON p.PositionID = a.PositionID
									GROUP BY 	p.PositionID
									HAVING 		COUNT(a.AccountID) 
									ORDER BY  	COUNT(a.AccountID) ASC 
                                    LIMIT 		1);
 
 -- Question 11: thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM 
  
SELECT   		d.DepartmentName, p.PositionName, COUNT(p.PositionID) -- , GROUP_CONCAT(PositionName)
FROM 			`Account` a
JOIN 			`Position`	p ON a.PositionID = p.PositionID
JOIN 			Department d  ON d.DepartmentID = a.DepartmentID
GROUP BY 		d.DepartmentID, p.PositionID
ORDER BY		d.DepartmentName, p.PositionName;

-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, … 

SELECT		q.QuestionID, q.Content, TypeName, Email, FullName AS nguoi_tao_cau_hoi, a.Content AS cau_tra_loi
FROM		Question q
JOIN 		TypeQuestion tq ON q.TypeID = tq.TypeID
JOIN  		Answer a ON q.QuestionID = a.QuestionID
JOIN 		`Account` ac ON q.CreatorID = ac.AccountID;

-- Question 13: lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm 

SELECT 		tq.TypeName, COUNT(Content) AS so_cau_hoi
FROM 		Question q 
JOIN  		TypeQuestion tq ON tq.TypeID　=　q.TypeID
GROUP BY 	tq.TypeID;

-- Question 14+15: lấy ra group không có account nào 

SELECT 			g.GroupName, IFNULL(AccountID,'khong co Account nao') AS AccountID
FROM			`Group` g
LEFT JOIN		GroupAccount ga ON  g.GroupID = ga.GroupID
WHERE       	ga.AccountID  IS NULL;

-- Question 16: lấy ra question không có answer nào 

SELECT		   q.QuestionID, q.Content, IFNULL(AnswerID,'khong co cau tra loi') AS Answer
FROM			Question q
LEFT JOIN		Answer a ON q.QuestionID = a.QuestionID
WHERE			a.AnswerID IS NULL
GROUP BY        q.Content ;


-- Exercise 2: Union

-- Question 17: 
-- a) Lấy các account thuộc nhóm thứ1
-- b) Lấy các account thuộc nhóm thứ 2
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau 

SELECT  	ga.GroupID, a.FullName
FROM  		`Account` a
JOIN 		GroupAccount ga ON a.AccountID = ga.AccountID
WHERE 		ga.GroupID = 1
UNION 
SELECT  	ga.GroupID, a.FullName
FROM  		`Account` a
JOIN 		GroupAccount ga ON a.AccountID = ga.AccountID
WHERE 		ga.GroupID = 2;

-- Question 18:  
-- a) Lấy các group có lớn hơn 5 thành viên 
-- b) Lấy các group có nhỏ hơn 7 thành viên 
-- c) Ghép 2 kết quả từ câu a) và câu b) 

SELECT  	g.GroupName, COUNT(AccountID)
FROM 		`Group` g 
JOIN 		GroupAccount ga ON g.GroupID = ga.GroupID
GROUP BY 	g.GroupID
HAVING 		COUNT(AccountID) >5
UNION ALL
SELECT  	g.GroupName, COUNT(AccountID)
FROM 		`Group` g 
JOIN 		GroupAccount ga ON g.GroupID = ga.GroupID
GROUP BY 	g.GroupID
HAVING 		COUNT(AccountID) <7;
