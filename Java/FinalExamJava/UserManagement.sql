-- Drop the database if it already exists
DROP DATABASE IF EXISTS UserManagement;

-- Create database
CREATE DATABASE IF NOT EXISTS UserManagement;
USE UserManagement;

-- Drop the table if it already exists
DROP TABLE IF EXISTS `User`;

-- Create table User
CREATE TABLE IF NOT EXISTS `User` (
		ID				INT AUTO_INCREMENT PRIMARY KEY,
        FirstName		NVARCHAR(20) NOT NULL,
		LastName		NVARCHAR(20) NOT NULL,
        Phone			NVARCHAR(20) NOT NULL ,
		Email			NVARCHAR(40) NOT NULL UNIQUE KEY,
		`Password`		NVARCHAR(20) NOT NULL, 
		`Role`			ENUM ('Manager','Employee'),
		ExpInYear		TINYINT UNSIGNED DEFAULT NULL, 
		ProSkill		ENUM ('dev','test', 'java', 'sql'),
		ProjectName		ENUM('Testing System', 'CRM', 'TimeSheet')
);