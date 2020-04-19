-- create database

DROP DATABASE IF EXISTS ProjectManagement;
CREATE DATABASE IF NOT EXISTS ProjectManagement;
USE ProjectManagement;

-- Create table with constraint and datatype

DROP TABLE IF EXISTS Student;
DROP TABLE IF EXISTS `Subject`;
DROP TABLE IF EXISTS StudentSubject;

-- RN,sID,Name, Age, Gender, sName, Mark, Date. Với cột Gender show Male

-- create table Student

CREATE TABLE IF NOT EXISTS Student(
RN TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`Name` NVARCHAR(50) NOT NULL,
Age TINYINT UNSIGNED NOT NULL,
Gender ENUM('1','0') 
);

-- create table `Subject`

CREATE TABLE IF NOT EXISTS `Subject`(
sID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
sName NVARCHAR(50) NOT NULL
);

-- create table StudentSubject

CREATE TABLE IF NOT EXISTS StudentSubject(
RN TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
sID TINYINT UNSIGNED NOT NULL,
Mark TINYINT UNSIGNED ,
`Date` DATE NOT NULL,
PRIMARY KEY(RN,sID),
FOREIGN KEY(RN) REFERENCES Student(RN) ON DELETE CASCADE,
FOREIGN KEY(sID) REFERENCES `Subject`(sID) ON DELETE CASCADE
);

-- Questions
-- a) Tạo table với các ràng buộc và kiểu dữ liệu
-- Thêm ít nhất 3 bản ghi vào table

INSERT INTO Student(`Name`,Age,Gender)	VALUES('hoa',18,'1');
INSERT INTO Student(`Name`,Age,Gender)	VALUES('hung',19,'0');
INSERT INTO Student(`Name`,Age,Gender)	VALUES('hong',21, NULL);
INSERT INTO Student(`Name`,Age,Gender)	VALUES('manh',18,'0');
INSERT INTO Student(`Name`,Age,Gender)	VALUES('duy','19','0');
INSERT INTO Student(`Name`,Age,Gender)	VALUES('phong','20','1');
INSERT INTO Student(`Name`,Age,Gender)	VALUES('cuong','19', NULl);

INSERT INTO `Subject`(sName)	VALUES('toan');
INSERT INTO `Subject`(sName)	VALUES('ly hoa');
INSERT INTO `Subject`(sName)	VALUES('van ');
INSERT INTO `Subject`(sName)	VALUES('anh');
INSERT INTO `Subject`(sName)	VALUES('dai so');
INSERT INTO `Subject`(sName)	VALUES('co ly thuyet');

INSERT INTO StudentSubject(sID,Mark,`Date`)	VALUES(1,NULL,'2020-04-01');
INSERT INTO StudentSubject(sID,Mark,`Date`)	VALUES(2,'0','2020-04-02'); 
INSERT INTO StudentSubject(sID,Mark,`Date`)	VALUES(3,'1','2020-04-03');
INSERT INTO StudentSubject(sID,Mark,`Date`)	VALUES(4,'2','2020-04-04');
INSERT INTO StudentSubject(sID,Mark,`Date`)	VALUES(5,'8','2020-04-05');
INSERT INTO StudentSubject(sID,Mark,`Date`)	VALUES(6,'9','2020-04-06');

-- b) Viết lệnh để
-- a. Lấy tất cả các môn học không có bất kì điểm nào

SELECT s.sName AS mon_hoc
FROM `Subject` s
LEFT JOIN StudentSubject ss ON s.sID = ss.sID
WHERE ss.Mark IS NULL;

-- b. Lấy danh sách các môn học có ít nhất 2 điểm

SELECT s.sName AS mon_hoc, ss.Mark
FROM `Subject` s
JOIN StudentSubject ss ON s.sID = ss.sID
WHERE ss.Mark >=2;

-- c) Tạo "StudentInfo" view có các thông tin về học sinh bao gồm: RN,sID,Name, Age, Gender, sName, Mark, Date. Với cột Gender show Male để thay thế cho 0, Female thay thế cho 1 và Unknow thay thế cho null.

DROP VIEW IF EXISTS V_StudentInfo ;
CREATE  VIEW 		V_StudentInfo  AS
SELECT st.RN,s.sID,st.`Name`, st.Age, s.sName, ss.Mark, ss.`Date`,
		CASE
			WHEN st.Gender = '0' THEN 'Male'
			WHEN st.Gender = '1' THEN 'Female'
			else  'Unknow'
		END AS Gender
FROM StudentSubject ss
JOIN `Subject` s ON ss.sID = s.sID
JOIN Student st ON ss.RN = st.RN;

-- d) Tạo trigger cho table Subject:
-- a. Trigger CasUpdate: khi thay đổi data của cột sID, thì giá trị của cột sID của table StudentSubject cũng thay đổi theo

DROP TRIGGER IF EXISTS trigger_CasUpdate;
DELIMITER $$
CREATE TRIGGER trigger_CasUpdate
AFTER UPDATE ON `Subject`
FOR EACH ROW
BEGIN
		IF old.sID <> new.sId THEN
			insert into StudentSubject(sID) values (new.sID);
		END IF;

END $$
DELIMITER ;

-- b. Trigger casDel: Khi xóa 1 student, các dữ liệu của table StudentSubject cũng sẽ bị xóa theo

DROP TRIGGER IF EXISTS trigger_casDel;
DELIMITER $$
CREATE TRIGGER trigger_casDel
BEFORE DELETE ON Student
FOR EACH ROW
BEGIN
        DELETE  FROM StudentSubject
        WHERE StudentSubject.RN = Student.RN;

END $$
DELIMITER ;

-- e) Viết 1 thủ tục (có 2 parameters: student name, mark). Thủ tục sẽ xóa tất cả các thông tin liên quan tới học sinh có cùng tên như parameter và tất cả các điểm nhỏ hơn của các học sinh đó.
-- Trong trường hợp nhập vào "*" thì thủ tục sẽ xóa tất cả các học sinh

DROP PROCEDURE IF EXISTS thong_tin;
DELIMITER $$
CREATE PROCEDURE thong_tin (IN student_name NVARCHAR(50), IN student_mark TINYINT UNSIGNED)
   BEGIN 
         DELETE Student
         FROM Student s
         RIGHT JOIN StudentSubject ss ON ss.RN = s.RN
         WHERE s.`Name` = student_name and ss.Mark = student_mark;
   END $$
DELIMITER ;

