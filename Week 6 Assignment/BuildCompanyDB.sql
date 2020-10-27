Skip to content
Search or jump to…

Pulls
Issues
Marketplace
Explore
 
@shaynedarak 
shaynedarak
/
CSIS1410
Private
1
00
Code
Issues
Pull requests
Actions
Projects
Security
Insights
Settings
CSIS1410/Employee/BuildCompanyDB.sql
@shaynedarak
shaynedarak Add files via upload
Latest commit 9870d5d 4 minutes ago
 History
 1 contributor
93 lines (84 sloc)  6.39 KB
  
-- ------------------------------------------------------------------------------------------------------------------------------
-- BuildCompanyDB.sql
--
-- SQL script to build company database in MySql
-- c.2020 by Professor John Gordon
-- Script written and tested with the following:
--		-- Ver 8.0.20 for Win64 on x86_64 (MySQL Community Server - GPL)
-- 		-- MySql Workbench Community Version 8.0.20 build 16114288 CE (64 bit)
-- Disclaimer:	All sample data contained in this script was generated randomly,
-- 				any connection to real people is entirely coincidental.
-- ------------------------------------------------------------------------------------------------------------------------------

-- ------------------------------------------------------------------------------------------------------------------------------
-- Set Environment
-- ------------------------------------------------------------------------------------------------------------------------------
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- ------------------------------------------------------------------------------------------------------------------------------
-- BUILD DATABASE STRUCTURE -----------------------------------------------------------------------------------------------------
-- ------------------------------------------------------------------------------------------------------------------------------

-- ------------------------------------------------------------------------------------------------------------------------------
-- Build Schema: company
-- ------------------------------------------------------------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `company` ;
CREATE SCHEMA `company` DEFAULT CHARACTER SET utf8 ;
USE company;

-- ------------------------------------------------------------------------------------------------------------------------------
-- Build Table `company`.`employees`
-- ------------------------------------------------------------------------------------------------------------------------------
DROP TABLE IF EXISTS `company`.`employees` ;
CREATE TABLE `employees` (
  `employee_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `salary` decimal(8,2) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `supervisor_id` int DEFAULT NULL,
  `bonus` bit(1) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `insurance` int DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------------------------------------------------------------------------------
-- LOAD RANDOMIZED SAMPLE DATA --------------------------------------------------------------------------------------------------
-- ------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------------------------------------------------------------------------------

-- ------------------------------------------------------------------------------------------------------------------------------
-- Populate Table `game_scores`.`gamers`
-- ------------------------------------------------------------------------------------------------------------------------------
TRUNCATE TABLE employees;
INSERT INTO employees (first_name, last_name, age, title, salary, status, supervisor_id, bonus, department, insurance, hiredate, phone) VALUES
	('Bob','Levin',25,'Network Administrator',83500,'F',6, 1,'IT',1,'2012-01-01','8011112222'),
	('Sally','Massey',21,'Receptionist',39000,'P',8, 0,'Operations',0,'2013-01-01','8012223333'),
	('Mario','Simmons',51,'Database Administrator',130000,'F',6, 1,'IT',3,'2015-01-01','8013334444'),
	('Lev','Irvin',44,'Sales Agent',68500,'C',5, 0,'Marketing',0,'2017-01-01','8014445555'),
	('Carden','Patterson',29,'Marketing Manager',72000,'F',16, 1,'Marketing',3,'2010-01-01','8015556666'),
	('Adelie','Byers',52,'Chief Information Officer',180000,'F',16, 1,'IT',2,'2010-01-01','801666777'),
	('Lada','Baxley',33,'Senior Software Engineer',118000,'F',10, 1,'IT',1,'2014-01-01','8017778888'),
	('Xavier','Pogue',28,'Operations Manager',80000,'F',16, 1,'Operations',4,'2015-01-01','8018889999'),
	('Raffi','Niles',36,'Business Analyst',85000,'F',6, 1,'Management',4,'2013-01-01','8019990000'),
	('Chang','Marble',30,'Software Development Manager',130000,'F',6, 1,'IT',3,'2018-01-01','8017776666'),
	('Mich','Loera',33,'Junior Network Technician',51000,'F',1, 1,'IT',4,'2017-01-01','8016665555'),
	('Mason','Banuelos',42,'Programmer',79000,'F',10, 1,'IT',2,'2013-01-01','8015553333'),
	('Cora','Brinkley',24,'Intern',25000,'P',8, 0,'Marketing',0,'2010-01-01','8019994444'),
	('Sergio','Holm',26,'Data Engineer',95000,'P',3, 0,'IT',0,'2014-01-01','8013338888'),
	('Jonas','Amos',46,'SRE Engineer',90000,'F',1, 1,'IT',3,'2016-01-01','8013331111'),
	('Maria','Montoya',55,'Chief Executive Officer',350000,'F',-1, 1,'Management',1,'2010-01-01','8019994455');

-- Sample Queries:
-- SELECT * FROM employees;
-- SELECT employee_id, first_name, last_name, age, title, salary, status, supervisor_id, bonus, department, insurance, hiredate, phone FROM employees WHERE employee_id = 16;

-- ------------------------------------------------------------------------------------------------------------------------------
-- Reset Environment
-- ------------------------------------------------------------------------------------------------------------------------------
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- ------------------------------------------------------------------------------------------------------------------------------
-- Done
-- ------------------------------------------------------------------------------------------------------------------------------
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
