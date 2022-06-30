DROP DATABASE test;

CREATE DATABASE test;

USE test;

DROP TABLE `student`;

CREATE TABLE `student`(
`id` int AUTO_INCREMENT PRIMARY KEY,
`name` varchar(10),
`birth_year` int,
`parent_name` varchar(10),
`email` varchar(50), 
`time_week` varchar(5), 
`time_hour` tinyint(1),
`tested` tinyint(1),
`proceed` tinyint(1),
`others` varchar(200)
);

DROP TABLE `schedule`;

CREATE TABLE `schedule`(
`id` int AUTO_INCREMENT PRIMARY KEY
);

SELECT * FROM student