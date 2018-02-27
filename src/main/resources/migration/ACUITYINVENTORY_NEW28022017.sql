/*
SQLyog Community v12.09 (64 bit)
MySQL - 5.5.52-0ubuntu0.14.04.1 : Database - acuityinventory
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`acuityinventory` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `acuityinventory`;

/*Table structure for table `APPAPPRULES` */

DROP TABLE IF EXISTS `APPAPPRULES`;

CREATE TABLE `APPAPPRULES` (
  `appruleid` int(11) NOT NULL AUTO_INCREMENT,
  `institutioncode` varchar(30) DEFAULT NULL,
  `moduleId` int(4) DEFAULT NULL,
  `rule` varchar(100) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0',
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `enteredbyid` int(11) DEFAULT NULL,
  `active` smallint(1) DEFAULT '1',
  PRIMARY KEY (`appruleid`),
  KEY `fkmodule_id` (`moduleId`),
  CONSTRAINT `fkmodule_id` FOREIGN KEY (`moduleId`) REFERENCES `APPMODULES` (`moduleid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `APPAPPRULES` */

/*Table structure for table `APPLOGALERTS` */

DROP TABLE IF EXISTS `APPLOGALERTS`;

CREATE TABLE `APPLOGALERTS` (
  `logalerid` int(11) NOT NULL AUTO_INCREMENT,
  `staffid` int(11) DEFAULT NULL,
  `mobileno` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `logtypeId` int(11) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `enteredbyid` smallint(6) DEFAULT '0',
  `active` smallint(1) DEFAULT '1',
  `institutionid` int(11) DEFAULT NULL,
  PRIMARY KEY (`logalerid`),
  KEY `fkinstid` (`institutionid`),
  CONSTRAINT `fkinstid` FOREIGN KEY (`institutionid`) REFERENCES `PRMINTINSTITUTION` (`institutionid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `APPLOGALERTS` */

/*Table structure for table `APPMODULES` */

DROP TABLE IF EXISTS `APPMODULES`;

CREATE TABLE `APPMODULES` (
  `moduleid` int(11) NOT NULL AUTO_INCREMENT,
  `moduletype` varchar(15) DEFAULT NULL,
  `statuscode` varchar(50) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `enteredbyid` int(11) DEFAULT NULL,
  `active` smallint(1) DEFAULT '1',
  `institutionid` int(11) DEFAULT NULL,
  PRIMARY KEY (`moduleid`),
  KEY `fkmoduleid` (`institutionid`),
  CONSTRAINT `fkmoduleid` FOREIGN KEY (`institutionid`) REFERENCES `PRMINTINSTITUTION` (`institutionid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `APPMODULES` */

/*Table structure for table `LSTCATEGORYLEVELTYPE` */

DROP TABLE IF EXISTS `LSTCATEGORYLEVELTYPE`;

CREATE TABLE `LSTCATEGORYLEVELTYPE` (
  `categoryleveltypeid` int(11) NOT NULL AUTO_INCREMENT,
  `categoryleveltype` varchar(50) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`categoryleveltypeid`),
  KEY `fklstmainid_1` (`lstmainid`),
  CONSTRAINT `fklstmainid_1` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `LSTCATEGORYLEVELTYPE` */

insert  into `LSTCATEGORYLEVELTYPE`(`categoryleveltypeid`,`categoryleveltype`,`datecreated`,`active`,`lstmainid`) values (1,'Main Category','2015-07-31 11:20:16',1,NULL);
insert  into `LSTCATEGORYLEVELTYPE`(`categoryleveltypeid`,`categoryleveltype`,`datecreated`,`active`,`lstmainid`) values (2,'Sub Category','2015-07-31 11:20:50',1,NULL);

/*Table structure for table `LSTINVENTORYTYPE` */

DROP TABLE IF EXISTS `LSTINVENTORYTYPE`;

CREATE TABLE `LSTINVENTORYTYPE` (
  `inventorytypeid` int(4) NOT NULL AUTO_INCREMENT,
  `inventorytype` varchar(20) NOT NULL,
  `datecreated` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`inventorytypeid`),
  UNIQUE KEY `Id` (`inventorytypeid`),
  KEY `fklstmainid_2` (`lstmainid`),
  CONSTRAINT `fklstmainid_2` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `LSTINVENTORYTYPE` */

insert  into `LSTINVENTORYTYPE`(`inventorytypeid`,`inventorytype`,`datecreated`,`active`,`lstmainid`) values (1,'Consumable','2015-07-31 11:24:17',1,NULL);
insert  into `LSTINVENTORYTYPE`(`inventorytypeid`,`inventorytype`,`datecreated`,`active`,`lstmainid`) values (2,'Asset','2015-07-31 11:24:37',1,NULL);

/*Table structure for table `LSTMAIN` */

DROP TABLE IF EXISTS `LSTMAIN`;

CREATE TABLE `LSTMAIN` (
  `lstmainid` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) DEFAULT NULL,
  `institutionid` int(11) DEFAULT NULL,
  `datecreated` datetime DEFAULT NULL,
  PRIMARY KEY (`lstmainid`),
  KEY `fkinstitutionid_1` (`institutionid`),
  CONSTRAINT `fkinstitutionid_1` FOREIGN KEY (`institutionid`) REFERENCES `PRMINTINSTITUTION` (`institutionid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `LSTMAIN` */

/*Table structure for table `LSTMEASUREPACK` */

DROP TABLE IF EXISTS `LSTMEASUREPACK`;

CREATE TABLE `LSTMEASUREPACK` (
  `measureid` int(4) NOT NULL AUTO_INCREMENT,
  `measurepack` varchar(50) NOT NULL,
  `datecreated` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`measureid`),
  UNIQUE KEY `Id` (`measureid`),
  KEY `fklstmainid_4` (`lstmainid`),
  CONSTRAINT `fklstmainid_4` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `LSTMEASUREPACK` */

/*Table structure for table `LSTMEASUREUNIT` */

DROP TABLE IF EXISTS `LSTMEASUREUNIT`;

CREATE TABLE `LSTMEASUREUNIT` (
  `mesureunitid` int(4) NOT NULL AUTO_INCREMENT,
  `measureunit` varchar(50) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`mesureunitid`),
  KEY `fklstmainid_5` (`lstmainid`),
  CONSTRAINT `fklstmainid_5` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `LSTMEASUREUNIT` */

insert  into `LSTMEASUREUNIT`(`mesureunitid`,`measureunit`,`datecreated`,`active`,`lstmainid`) values (1,'Satchet','2015-07-31 11:25:14',1,NULL);
insert  into `LSTMEASUREUNIT`(`mesureunitid`,`measureunit`,`datecreated`,`active`,`lstmainid`) values (2,'Tube','2015-07-31 11:25:21',1,NULL);

/*Table structure for table `LSTSTOCKLEVELTYPE` */

DROP TABLE IF EXISTS `LSTSTOCKLEVELTYPE`;

CREATE TABLE `LSTSTOCKLEVELTYPE` (
  `storetypeid` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`storetypeid`),
  KEY `fklstmainid_8` (`lstmainid`),
  CONSTRAINT `fklstmainid_8` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `LSTSTOCKLEVELTYPE` */

insert  into `LSTSTOCKLEVELTYPE`(`storetypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (1,'Head/Main Office Store','2015-07-31 11:34:59',1,NULL);
insert  into `LSTSTOCKLEVELTYPE`(`storetypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (2,'Departmental Store','2015-07-31 11:34:53',1,NULL);
insert  into `LSTSTOCKLEVELTYPE`(`storetypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (3,'Unit Store','2015-07-31 11:35:10',1,NULL);
insert  into `LSTSTOCKLEVELTYPE`(`storetypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (4,'Branch Store','2015-07-31 11:35:17',1,NULL);
insert  into `LSTSTOCKLEVELTYPE`(`storetypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (5,'Ministry Store','2015-07-31 11:35:34',1,NULL);
insert  into `LSTSTOCKLEVELTYPE`(`storetypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (6,'Agency Store','2015-07-31 11:35:53',1,NULL);

/*Table structure for table `LSTSTOCKOUTRECEIPTTYPE` */

DROP TABLE IF EXISTS `LSTSTOCKOUTRECEIPTTYPE`;

CREATE TABLE `LSTSTOCKOUTRECEIPTTYPE` (
  `stockrecipttypeid` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(30) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`stockrecipttypeid`),
  KEY `fklstmainid_6` (`lstmainid`),
  CONSTRAINT `fklstmainid_6` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `LSTSTOCKOUTRECEIPTTYPE` */

insert  into `LSTSTOCKOUTRECEIPTTYPE`(`stockrecipttypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (1,'Supplier','2015-07-31 11:08:20',1,NULL);
insert  into `LSTSTOCKOUTRECEIPTTYPE`(`stockrecipttypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (2,'Customer','2015-07-31 11:08:28',1,NULL);
insert  into `LSTSTOCKOUTRECEIPTTYPE`(`stockrecipttypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (3,'Staff','2015-07-31 11:08:31',1,NULL);
insert  into `LSTSTOCKOUTRECEIPTTYPE`(`stockrecipttypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (4,'Cancellation','2015-07-31 11:08:42',1,NULL);
insert  into `LSTSTOCKOUTRECEIPTTYPE`(`stockrecipttypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (5,'Expiration','2015-07-31 11:08:48',1,NULL);
insert  into `LSTSTOCKOUTRECEIPTTYPE`(`stockrecipttypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (6,'Loss','2015-07-31 11:08:52',1,NULL);

/*Table structure for table `LSTSTOCKOUTTYPE` */

DROP TABLE IF EXISTS `LSTSTOCKOUTTYPE`;

CREATE TABLE `LSTSTOCKOUTTYPE` (
  `stockouttypeid` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(30) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`stockouttypeid`),
  KEY `fklstmainid_7` (`lstmainid`),
  CONSTRAINT `fklstmainid_7` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `LSTSTOCKOUTTYPE` */

insert  into `LSTSTOCKOUTTYPE`(`stockouttypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (1,'Transfer','2015-07-31 11:16:59',1,NULL);
insert  into `LSTSTOCKOUTTYPE`(`stockouttypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (2,'Issue Out','2015-07-31 11:17:05',1,NULL);
insert  into `LSTSTOCKOUTTYPE`(`stockouttypeid`,`description`,`datecreated`,`active`,`lstmainid`) values (3,'Return Outward','2015-07-31 11:17:18',1,NULL);

/*Table structure for table `LSTSTORES` */

DROP TABLE IF EXISTS `LSTSTORES`;

CREATE TABLE `LSTSTORES` (
  `storeid` int(11) NOT NULL AUTO_INCREMENT,
  `parentId` int(11) DEFAULT NULL,
  `storelevelname` varchar(150) DEFAULT NULL,
  `storetypeid` int(11) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`storeid`),
  KEY `fkstoretypeid` (`storetypeid`),
  KEY `fklstmainid_9` (`lstmainid`),
  CONSTRAINT `fklstmainid_9` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`),
  CONSTRAINT `fkstoretypeid` FOREIGN KEY (`storetypeid`) REFERENCES `LSTSTOCKLEVELTYPE` (`storetypeid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `LSTSTORES` */

/*Table structure for table `LSTSUBCATEGORYTREE` */

DROP TABLE IF EXISTS `LSTSUBCATEGORYTREE`;

CREATE TABLE `LSTSUBCATEGORYTREE` (
  `subcategorytid` int(11) NOT NULL AUTO_INCREMENT,
  `parentId` int(11) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `categoryleveltypeid` int(11) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`subcategorytid`),
  KEY `fkcattypeid` (`categoryleveltypeid`),
  KEY `fklstmainid_10` (`lstmainid`),
  CONSTRAINT `fkcattypeid` FOREIGN KEY (`categoryleveltypeid`) REFERENCES `LSTCATEGORYLEVELTYPE` (`categoryleveltypeid`),
  CONSTRAINT `fklstmainid_10` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `LSTSUBCATEGORYTREE` */

/*Table structure for table `LSTSUPPLYTYPE` */

DROP TABLE IF EXISTS `LSTSUPPLYTYPE`;

CREATE TABLE `LSTSUPPLYTYPE` (
  `subpplytypeid` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(30) DEFAULT NULL,
  `DateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`subpplytypeid`),
  KEY `fklstmainid_11` (`lstmainid`),
  CONSTRAINT `fklstmainid_11` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `LSTSUPPLYTYPE` */

/*Table structure for table `PRMINTINSTITUTION` */

DROP TABLE IF EXISTS `PRMINTINSTITUTION`;

CREATE TABLE `PRMINTINSTITUTION` (
  `institutionid` int(11) NOT NULL AUTO_INCREMENT,
  `institutioncode` varchar(20) NOT NULL,
  `institutionname` varchar(100) DEFAULT NULL,
  `institutiontypeid` int(11) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `contactdetails` varchar(100) DEFAULT NULL,
  `havebranches` tinyint(1) DEFAULT '0',
  `contactmobile` varchar(15) DEFAULT NULL,
  `contactemail` varchar(50) DEFAULT NULL,
  `licensemodel` int(4) DEFAULT NULL,
  `license` varchar(180) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `enteredbyid` int(11) DEFAULT NULL,
  `active` smallint(1) DEFAULT '1',
  PRIMARY KEY (`institutionid`,`institutioncode`),
  UNIQUE KEY `Id` (`institutionid`),
  KEY `fkinsttypeid` (`institutiontypeid`),
  CONSTRAINT `fkinsttypeid` FOREIGN KEY (`institutiontypeid`) REFERENCES `PRMINTINSTITUTIONTYPE` (`institutiontypeid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `PRMINTINSTITUTION` */

insert  into `PRMINTINSTITUTION`(`institutionid`,`institutioncode`,`institutionname`,`institutiontypeid`,`address`,`contactdetails`,`havebranches`,`contactmobile`,`contactemail`,`licensemodel`,`license`,`datecreated`,`enteredbyid`,`active`) values (1,'',NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,'2017-02-28 13:20:15',NULL,1);

/*Table structure for table `PRMINTINSTITUTIONTYPE` */

DROP TABLE IF EXISTS `PRMINTINSTITUTIONTYPE`;

CREATE TABLE `PRMINTINSTITUTIONTYPE` (
  `institutiontypeid` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(70) DEFAULT NULL,
  `datcreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  PRIMARY KEY (`institutiontypeid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `PRMINTINSTITUTIONTYPE` */

insert  into `PRMINTINSTITUTIONTYPE`(`institutiontypeid`,`description`,`datcreated`,`active`) values (1,'Federal Government','2015-07-31 10:56:36',1);
insert  into `PRMINTINSTITUTIONTYPE`(`institutiontypeid`,`description`,`datcreated`,`active`) values (2,'State Government','2015-07-31 10:56:42',1);
insert  into `PRMINTINSTITUTIONTYPE`(`institutiontypeid`,`description`,`datcreated`,`active`) values (3,'Ministry','2015-07-31 10:56:49',1);
insert  into `PRMINTINSTITUTIONTYPE`(`institutiontypeid`,`description`,`datcreated`,`active`) values (4,'Agency of Government','2015-07-31 10:57:03',1);
insert  into `PRMINTINSTITUTIONTYPE`(`institutiontypeid`,`description`,`datcreated`,`active`) values (5,'Government Institution','2015-07-31 10:57:30',1);
insert  into `PRMINTINSTITUTIONTYPE`(`institutiontypeid`,`description`,`datcreated`,`active`) values (6,'Private Institution','2015-07-31 10:57:39',1);

/*Table structure for table `PRMINTSUBORGANISATION` */

DROP TABLE IF EXISTS `PRMINTSUBORGANISATION`;

CREATE TABLE `PRMINTSUBORGANISATION` (
  `suborgid` int(11) NOT NULL AUTO_INCREMENT,
  `suborganisationname` varchar(100) DEFAULT NULL,
  `suborganisationtypeid` int(11) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  PRIMARY KEY (`suborgid`),
  KEY `fksuborgtypeid` (`suborganisationtypeid`),
  CONSTRAINT `fksuborgtypeid` FOREIGN KEY (`suborganisationtypeid`) REFERENCES `PRMINTSUBORGANISATIONTYPE` (`suborgtypeid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `PRMINTSUBORGANISATION` */

/*Table structure for table `PRMINTSUBORGANISATIONTYPE` */

DROP TABLE IF EXISTS `PRMINTSUBORGANISATIONTYPE`;

CREATE TABLE `PRMINTSUBORGANISATIONTYPE` (
  `suborgtypeid` int(4) NOT NULL AUTO_INCREMENT,
  `institutionid` int(11) DEFAULT NULL,
  `suborganisationtype` varchar(50) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  PRIMARY KEY (`suborgtypeid`),
  KEY `fkinstitutionid` (`institutionid`),
  CONSTRAINT `fkinstitutionid` FOREIGN KEY (`institutionid`) REFERENCES `PRMINTINSTITUTION` (`institutionid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `PRMINTSUBORGANISATIONTYPE` */

insert  into `PRMINTSUBORGANISATIONTYPE`(`suborgtypeid`,`institutionid`,`suborganisationtype`,`datecreated`,`active`) values (1,NULL,'Ministry','2015-07-31 11:12:59',1);
insert  into `PRMINTSUBORGANISATIONTYPE`(`suborgtypeid`,`institutionid`,`suborganisationtype`,`datecreated`,`active`) values (2,NULL,'Agency','2015-07-31 11:13:02',1);
insert  into `PRMINTSUBORGANISATIONTYPE`(`suborgtypeid`,`institutionid`,`suborganisationtype`,`datecreated`,`active`) values (3,NULL,'Department','2015-07-31 11:13:12',1);
insert  into `PRMINTSUBORGANISATIONTYPE`(`suborgtypeid`,`institutionid`,`suborganisationtype`,`datecreated`,`active`) values (4,NULL,'Unit','2015-07-31 11:13:21',1);
insert  into `PRMINTSUBORGANISATIONTYPE`(`suborgtypeid`,`institutionid`,`suborganisationtype`,`datecreated`,`active`) values (5,NULL,'Section','2015-07-31 11:13:24',1);
insert  into `PRMINTSUBORGANISATIONTYPE`(`suborgtypeid`,`institutionid`,`suborganisationtype`,`datecreated`,`active`) values (6,NULL,'Head Office','2015-07-31 11:13:29',1);
insert  into `PRMINTSUBORGANISATIONTYPE`(`suborgtypeid`,`institutionid`,`suborganisationtype`,`datecreated`,`active`) values (7,NULL,'Branch Office','2015-07-31 11:13:34',1);

/*Table structure for table `REGDEPRECIATIONBYCATEGORY` */

DROP TABLE IF EXISTS `REGDEPRECIATIONBYCATEGORY`;

CREATE TABLE `REGDEPRECIATIONBYCATEGORY` (
  `depreciationid` int(4) NOT NULL AUTO_INCREMENT,
  `subcategoryId` int(11) DEFAULT NULL,
  `depreciationvalue` decimal(7,2) DEFAULT NULL,
  `depreciationPeriod` varchar(20) DEFAULT 'Year',
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  PRIMARY KEY (`depreciationid`),
  KEY `fksubcateid` (`subcategoryId`),
  CONSTRAINT `fksubcateid` FOREIGN KEY (`subcategoryId`) REFERENCES `LSTSUBCATEGORYTREE` (`subcategorytid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `REGDEPRECIATIONBYCATEGORY` */

/*Table structure for table `REGITEMS` */

DROP TABLE IF EXISTS `REGITEMS`;

CREATE TABLE `REGITEMS` (
  `itemid` int(11) NOT NULL AUTO_INCREMENT,
  `itemcode` varchar(20) NOT NULL,
  `itemname` varchar(150) DEFAULT NULL,
  `aliasname` varchar(100) DEFAULT NULL,
  `subcategorytid` int(11) DEFAULT NULL,
  `measureunitid` int(11) DEFAULT NULL,
  `measurepackid` int(11) DEFAULT NULL,
  `barcode` varchar(50) DEFAULT NULL,
  `rfidnumber` varchar(50) DEFAULT NULL,
  `usemeasure` varchar(30) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `enteredbid` int(11) DEFAULT NULL,
  `active` smallint(1) DEFAULT '1',
  `institutionid` int(11) DEFAULT NULL,
  PRIMARY KEY (`itemid`),
  UNIQUE KEY `Id` (`itemid`),
  KEY `fksubcategoryid` (`subcategorytid`),
  KEY `fkinstitutionid_3` (`institutionid`),
  CONSTRAINT `fkcategoryid` FOREIGN KEY (`subcategorytid`) REFERENCES `LSTSUBCATEGORYTREE` (`subcategorytid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fkinstitutionid_3` FOREIGN KEY (`institutionid`) REFERENCES `PRMINTINSTITUTION` (`institutionid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `REGITEMS` */

/*Table structure for table `TRANDEPRECIATION` */

DROP TABLE IF EXISTS `TRANDEPRECIATION`;

CREATE TABLE `TRANDEPRECIATION` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemid` int(11) DEFAULT NULL,
  `monthid` int(11) DEFAULT NULL,
  `yearid` int(11) DEFAULT NULL,
  `trandate` date DEFAULT NULL,
  `amount` decimal(7,2) DEFAULT NULL,
  `instutionid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fkitemiddeprid` (`itemid`),
  KEY `fkinstdeprid` (`instutionid`),
  CONSTRAINT `fkitemiddeprid` FOREIGN KEY (`itemid`) REFERENCES `REGITEMS` (`itemid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fkinstdeprid` FOREIGN KEY (`instutionid`) REFERENCES `PRMINTINSTITUTION` (`institutionid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `TRANDEPRECIATION` */

/*Table structure for table `TRANDISPOSAL` */

DROP TABLE IF EXISTS `TRANDISPOSAL`;

CREATE TABLE `TRANDISPOSAL` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemid` int(11) DEFAULT NULL,
  `dateoftran` date DEFAULT NULL,
  `batchno` varchar(50) DEFAULT NULL,
  `qtydisposed` decimal(20,2) DEFAULT NULL,
  `statusatdisposal` varchar(15) DEFAULT NULL COMMENT 'Status can be (Expired or Public Relations)',
  `disposaltypeId` int(11) DEFAULT NULL,
  `disposalstatus` varchar(13) DEFAULT NULL COMMENT 'Pending OR Disposed',
  `enteredbyId` int(11) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `tranlogid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fktranlogs_1` (`tranlogid`),
  CONSTRAINT `fktranlogs_1` FOREIGN KEY (`tranlogid`) REFERENCES `TRANLOGS` (`tranlogid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `TRANDISPOSAL` */

/*Table structure for table `TRANLOGS` */

DROP TABLE IF EXISTS `TRANLOGS`;

CREATE TABLE `TRANLOGS` (
  `tranlogid` int(11) NOT NULL AUTO_INCREMENT,
  `tranmainid` int(11) DEFAULT NULL,
  `itemid` int(11) DEFAULT NULL,
  `qtyin` int(11) DEFAULT NULL,
  `qtyout` int(11) DEFAULT NULL,
  `enteredbyid` int(11) DEFAULT NULL,
  `datecreated` datetime DEFAULT NULL,
  `active` int(11) DEFAULT NULL,
  `storeid` int(11) DEFAULT NULL,
  `institutionid` int(11) DEFAULT NULL,
  PRIMARY KEY (`tranlogid`),
  KEY `fkitemid` (`itemid`),
  KEY `fkstoreid` (`storeid`),
  KEY `fkinstitutionid_2` (`institutionid`),
  KEY `fktranmainid` (`tranmainid`),
  CONSTRAINT `fkstoreid` FOREIGN KEY (`storeid`) REFERENCES `LSTSTORES` (`storeid`) ON UPDATE CASCADE,
  CONSTRAINT `fkintid` FOREIGN KEY (`institutionid`) REFERENCES `PRMINTINSTITUTION` (`institutionid`) ON UPDATE CASCADE,
  CONSTRAINT `fkitemid` FOREIGN KEY (`itemid`) REFERENCES `REGITEMS` (`itemid`) ON UPDATE CASCADE,
  CONSTRAINT `fktranmainid` FOREIGN KEY (`tranmainid`) REFERENCES `TRANMAIN` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `TRANLOGS` */

/*Table structure for table `TRANMAIN` */

DROP TABLE IF EXISTS `TRANMAIN`;

CREATE TABLE `TRANMAIN` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tranreference` varchar(20) DEFAULT NULL,
  `storeid` int(11) DEFAULT NULL,
  `createduserid` int(11) DEFAULT NULL,
  `recievedbyId` int(11) DEFAULT NULL,
  `supplierId` int(11) DEFAULT NULL,
  `suppliername` varchar(50) DEFAULT NULL,
  `stocktakingby` varchar(50) DEFAULT NULL,
  `carriedby` varchar(50) DEFAULT NULL,
  `approvedby` varchar(50) DEFAULT NULL,
  `trandate` date DEFAULT NULL,
  `trantype` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `TRANMAIN` */

/*Table structure for table `TRANSTOCKIN` */

DROP TABLE IF EXISTS `TRANSTOCKIN`;

CREATE TABLE `TRANSTOCKIN` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemid` int(11) DEFAULT NULL,
  `supplytypeid` int(11) DEFAULT NULL,
  `supplyreferenceno` varchar(50) DEFAULT NULL,
  `qtysupplied` decimal(20,2) DEFAULT NULL,
  `qtyremaining` decimal(20,2) DEFAULT NULL,
  `datesupplied` date DEFAULT NULL,
  `batchno` varchar(30) DEFAULT NULL,
  `canexpire` tinyint(1) DEFAULT '0',
  `expirationdate` date DEFAULT NULL,
  `stockintypeId` int(11) DEFAULT NULL,
  `enteredbyId` int(11) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `tranlogid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fktranitem_1` (`itemid`),
  KEY `fksupllytype` (`supplytypeid`),
  KEY `fktranlog_2` (`tranlogid`),
  CONSTRAINT `fksupllytype` FOREIGN KEY (`supplytypeid`) REFERENCES `LSTSUPPLYTYPE` (`subpplytypeid`),
  CONSTRAINT `fktranlog_2` FOREIGN KEY (`tranlogid`) REFERENCES `TRANLOGS` (`tranlogid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `TRANSTOCKIN` */

/*Table structure for table `TRANSTOCKLEVEL` */

DROP TABLE IF EXISTS `TRANSTOCKLEVEL`;

CREATE TABLE `TRANSTOCKLEVEL` (
  `stockid` int(11) NOT NULL AUTO_INCREMENT,
  `itemid` int(11) DEFAULT NULL,
  `storeId` int(11) DEFAULT NULL,
  `qtylevel` decimal(20,2) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `enteredbyId` int(1) DEFAULT '1',
  `tranlogid` int(11) DEFAULT NULL,
  PRIMARY KEY (`stockid`),
  KEY `fktranlog_3` (`tranlogid`),
  CONSTRAINT `fktranlog_3` FOREIGN KEY (`tranlogid`) REFERENCES `TRANLOGS` (`tranlogid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `TRANSTOCKLEVEL` */

/*Table structure for table `TRANSTOCKOUT` */

DROP TABLE IF EXISTS `TRANSTOCKOUT`;

CREATE TABLE `TRANSTOCKOUT` (
  `stockoutid` int(11) NOT NULL AUTO_INCREMENT,
  `itemid` int(11) DEFAULT NULL,
  `stockouttypeid` int(11) DEFAULT NULL,
  `recipientId` int(11) DEFAULT NULL,
  `RecipientName` varchar(100) DEFAULT NULL,
  `DocumentNo` varchar(50) DEFAULT NULL,
  `fromstockinId` int(11) DEFAULT NULL,
  `recipienttype` varchar(50) DEFAULT NULL,
  `dateout` date DEFAULT NULL,
  `returned` tinyint(1) DEFAULT '0',
  `returneddate` date DEFAULT NULL,
  `qtyout` decimal(20,2) DEFAULT NULL,
  `qtyrqst` decimal(20,2) DEFAULT NULL,
  `frmstoreid` int(11) DEFAULT NULL,
  `approvedby` varchar(50) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `enteredbyid` int(11) DEFAULT NULL,
  `active` smallint(1) DEFAULT '1',
  `tranlogid` int(11) DEFAULT NULL,
  PRIMARY KEY (`stockoutid`),
  KEY `fkitemid_4` (`itemid`),
  KEY `fkstktype_1` (`stockouttypeid`),
  KEY `fktranlog_4` (`tranlogid`),
  CONSTRAINT `fkstktype_1` FOREIGN KEY (`stockouttypeid`) REFERENCES `LSTSTOCKOUTTYPE` (`stockouttypeid`),
  CONSTRAINT `fktranlog_4` FOREIGN KEY (`tranlogid`) REFERENCES `TRANLOGS` (`tranlogid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `TRANSTOCKOUT` */

/*Table structure for table `TRANSTOCKTAKING` */

DROP TABLE IF EXISTS `TRANSTOCKTAKING`;

CREATE TABLE `TRANSTOCKTAKING` (
  `stktakenid` int(11) NOT NULL AUTO_INCREMENT,
  `itemid` int(11) DEFAULT NULL,
  `storeId` int(11) DEFAULT NULL,
  `dateoftran` date DEFAULT NULL,
  `computerqty` decimal(20,2) DEFAULT NULL,
  `physicalcount` decimal(20,2) DEFAULT NULL,
  `difference` decimal(10,2) DEFAULT NULL,
  `remarks` varchar(250) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `active` smallint(1) DEFAULT '1',
  `tranlogid` int(11) DEFAULT NULL,
  PRIMARY KEY (`stktakenid`),
  KEY `fkitemid_3` (`itemid`),
  KEY `fkstoreid_3` (`storeId`),
  KEY `fktranlog_5` (`tranlogid`),
  CONSTRAINT `fktranlog_5` FOREIGN KEY (`tranlogid`) REFERENCES `TRANLOGS` (`tranlogid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `TRANSTOCKTAKING` */

/*Table structure for table `TRANTRANSFERS` */

DROP TABLE IF EXISTS `TRANTRANSFERS`;

CREATE TABLE `TRANTRANSFERS` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemid` int(11) DEFAULT NULL,
  `fromstoreid` int(11) DEFAULT NULL,
  `tostoreId` int(11) DEFAULT NULL,
  `qtysent` decimal(20,2) DEFAULT NULL,
  `qtyrecieved` decimal(20,2) DEFAULT NULL,
  `batchno` varchar(50) DEFAULT NULL,
  `transferstatus` varchar(15) DEFAULT NULL,
  `remarks` varchar(100) DEFAULT NULL,
  `enteredbyid` int(11) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `active` int(1) DEFAULT '1',
  `tranlogid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fktranlog_6` (`tranlogid`),
  CONSTRAINT `fktranlog_6` FOREIGN KEY (`tranlogid`) REFERENCES `TRANLOGS` (`tranlogid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `TRANTRANSFERS` */

/*Table structure for table `USERASSIGNEDUSERGROUP` */

DROP TABLE IF EXISTS `USERASSIGNEDUSERGROUP`;

CREATE TABLE `USERASSIGNEDUSERGROUP` (
  `asignuserid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `groupid` int(11) DEFAULT NULL,
  `prmissionId` int(11) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `enteredbyId` int(11) DEFAULT NULL,
  `active` smallint(1) DEFAULT '1',
  PRIMARY KEY (`asignuserid`),
  KEY `fkuid` (`userid`),
  KEY `fkgrpid` (`groupid`),
  KEY `fkprmid` (`prmissionId`),
  CONSTRAINT `fkgrpid` FOREIGN KEY (`groupid`) REFERENCES `USERUSERGROUP` (`usergrpid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fkprmid` FOREIGN KEY (`prmissionId`) REFERENCES `USERPERMISSION` (`permissionid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fkuid` FOREIGN KEY (`userid`) REFERENCES `USERUSERSINFO` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `USERASSIGNEDUSERGROUP` */

/*Table structure for table `USERPERMISSION` */

DROP TABLE IF EXISTS `USERPERMISSION`;

CREATE TABLE `USERPERMISSION` (
  `permissionid` int(11) NOT NULL AUTO_INCREMENT,
  `moduleid` int(4) DEFAULT NULL,
  `permission` varchar(50) DEFAULT NULL,
  `description` varchar(70) DEFAULT NULL,
  `enteredbyid` int(4) DEFAULT NULL,
  `active` smallint(1) DEFAULT '1',
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`permissionid`),
  KEY `fklstmain_14` (`lstmainid`),
  KEY `fkmoduleids` (`moduleid`),
  CONSTRAINT `fkmoduleids` FOREIGN KEY (`moduleid`) REFERENCES `APPMODULES` (`moduleid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `USERPERMISSION` */

/*Table structure for table `USERUSERGROUP` */

DROP TABLE IF EXISTS `USERUSERGROUP`;

CREATE TABLE `USERUSERGROUP` (
  `usergrpid` int(11) NOT NULL AUTO_INCREMENT,
  `groupname` varchar(30) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `enteredbyid` int(4) DEFAULT NULL,
  `Active` smallint(1) DEFAULT '1',
  `comment` varchar(100) DEFAULT NULL,
  `lstmainid` int(11) DEFAULT NULL,
  PRIMARY KEY (`usergrpid`),
  KEY `fklstmain_15` (`lstmainid`),
  CONSTRAINT `fklstmain_15` FOREIGN KEY (`lstmainid`) REFERENCES `LSTMAIN` (`lstmainid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `USERUSERGROUP` */

insert  into `USERUSERGROUP`(`usergrpid`,`groupname`,`datecreated`,`enteredbyid`,`Active`,`comment`,`lstmainid`) values (1,'Super Global','2015-08-04 21:19:04',0,1,'will be responsible for changing Application behavioral settings',NULL);
insert  into `USERUSERGROUP`(`usergrpid`,`groupname`,`datecreated`,`enteredbyid`,`Active`,`comment`,`lstmainid`) values (2,'Administrator','2015-08-04 21:19:05',0,1,'will be able to create Users and assign permissions and Setups',NULL);
insert  into `USERUSERGROUP`(`usergrpid`,`groupname`,`datecreated`,`enteredbyid`,`Active`,`comment`,`lstmainid`) values (3,'Power Users','2015-08-04 21:19:06',0,1,'will be able to access department level assigned to them',NULL);
insert  into `USERUSERGROUP`(`usergrpid`,`groupname`,`datecreated`,`enteredbyid`,`Active`,`comment`,`lstmainid`) values (4,'Users','2015-08-04 21:19:15',0,1,'will only access their current departments',NULL);

/*Table structure for table `USERUSERGROUPPERMISSION` */

DROP TABLE IF EXISTS `USERUSERGROUPPERMISSION`;

CREATE TABLE `USERUSERGROUPPERMISSION` (
  `grouppermid` int(11) NOT NULL AUTO_INCREMENT,
  `usergrpid` int(4) DEFAULT NULL,
  `permissionId` int(4) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '0',
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `enteredbyid` int(4) DEFAULT NULL,
  `active` smallint(1) DEFAULT '1',
  PRIMARY KEY (`grouppermid`),
  KEY `fkpermissionid` (`permissionId`),
  KEY `fkgroupid` (`usergrpid`),
  CONSTRAINT `fkgroupid` FOREIGN KEY (`usergrpid`) REFERENCES `USERUSERGROUP` (`usergrpid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fkpermissionid` FOREIGN KEY (`permissionId`) REFERENCES `USERPERMISSION` (`permissionid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `USERUSERGROUPPERMISSION` */

/*Table structure for table `USERUSERSINFO` */

DROP TABLE IF EXISTS `USERUSERSINFO`;

CREATE TABLE `USERUSERSINFO` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `Institutioncode` varchar(30) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(180) DEFAULT NULL,
  `firstname` varchar(50) DEFAULT NULL,
  `middlename` varchar(50) DEFAULT NULL,
  `lastname` varchar(50) DEFAULT NULL,
  `contactmobile` varchar(50) DEFAULT NULL,
  `contactemail` varchar(50) DEFAULT NULL,
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `enteredbyid` int(4) DEFAULT NULL,
  `Active` smallint(1) DEFAULT '1',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `USERUSERSINFO` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
