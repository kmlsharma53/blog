/*
SQLyog Community v8.63 
MySQL - 5.6.12-log : Database - blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blog` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `blog`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `ans_blog` */

DROP TABLE IF EXISTS `ans_blog`;

CREATE TABLE `ans_blog` (
  `ansId` int(11) NOT NULL,
  `blogId` int(11) NOT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`ansId`,`blogId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `answer` */

DROP TABLE IF EXISTS `answer`;

CREATE TABLE `answer` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `Description` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `blog` */

DROP TABLE IF EXISTS `blog`;

CREATE TABLE `blog` (
  `blog_id` int(11) NOT NULL AUTO_INCREMENT,
  `blog_name` varchar(255) DEFAULT NULL,
  `catid` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`blog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `bloguser` */

DROP TABLE IF EXISTS `bloguser`;

CREATE TABLE `bloguser` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `email_id` varchar(255) DEFAULT NULL,
  `enabled` int(11) DEFAULT NULL,
  `pass_word` varchar(255) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `catid` int(20) NOT NULL AUTO_INCREMENT,
  `catname` varchar(20) NOT NULL,
  PRIMARY KEY (`catid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '    ',
  `NAME` varchar(450) DEFAULT NULL,
  `MANU` varchar(450) DEFAULT NULL,
  `WEIGHT` float DEFAULT NULL,
  `PRICE` float DEFAULT NULL,
  `POPULARITY` int(11) DEFAULT NULL,
  `INSTOCK` tinyint(4) DEFAULT NULL,
  `INCLUDES` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Table structure for table `quest_ans` */

DROP TABLE IF EXISTS `quest_ans`;

CREATE TABLE `quest_ans` (
  `ansId` int(11) NOT NULL,
  `quesId` int(11) NOT NULL,
  PRIMARY KEY (`ansId`,`quesId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `quest_blog` */

DROP TABLE IF EXISTS `quest_blog`;

CREATE TABLE `quest_blog` (
  `blogId` int(11) NOT NULL,
  `quesId` int(11) NOT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`blogId`,`quesId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `question` */

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `qid` int(11) NOT NULL AUTO_INCREMENT,
  `catid` int(11) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/* Procedure structure for procedure `getProcedure` */

/*!50003 DROP PROCEDURE IF EXISTS  `getProcedure` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `getProcedure`()
BEGIN
declare exit handler for sqlexception
SELECT * FROM PR ;
SELECT * FROM BLOGUSER;
select "test" as log into outfile 'G:/proc/text.txt';
end */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
