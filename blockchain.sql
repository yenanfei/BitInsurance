/*
Navicat MySQL Data Transfer

Source Server         : 111111
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : blockchain

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-09-11 09:58:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for claim
-- ----------------------------
DROP TABLE IF EXISTS `claim`;
CREATE TABLE `claim` (
  `claimid` int(11) NOT NULL,
  `policyid` int(11) DEFAULT NULL,
  `reason` varchar(45) DEFAULT NULL,
  `allowed` varchar(10) DEFAULT '待审核',
  `denyreason` varchar(45) DEFAULT NULL,
  `allowedperson` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`claimid`),
  UNIQUE KEY `claimid_UNIQUE` (`claimid`),
  KEY `policyid_idx` (`policyid`),
  CONSTRAINT `policyid` FOREIGN KEY (`policyid`) REFERENCES `policy` (`policyid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of claim
-- ----------------------------

-- ----------------------------
-- Table structure for frozen
-- ----------------------------
DROP TABLE IF EXISTS `frozen`;
CREATE TABLE `frozen` (
  `frozenid` int(11) NOT NULL,
  `from` varchar(45) DEFAULT NULL,
  `to` varchar(45) DEFAULT NULL,
  `reason` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`frozenid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of frozen
-- ----------------------------

-- ----------------------------
-- Table structure for insurance
-- ----------------------------
DROP TABLE IF EXISTS `insurance`;
CREATE TABLE `insurance` (
  `productid` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `text` varchar(100) DEFAULT NULL,
  `intruduction` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`productid`),
  UNIQUE KEY `productid_UNIQUE` (`productid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of insurance
-- ----------------------------

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `text` varchar(100) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `from` int(11) DEFAULT NULL,
  `title` varchar(45) NOT NULL,
  PRIMARY KEY (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------

-- ----------------------------
-- Table structure for policy
-- ----------------------------
DROP TABLE IF EXISTS `policy`;
CREATE TABLE `policy` (
  `policyid` int(11) NOT NULL,
  `productid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `userpayed` varchar(5) DEFAULT '未支付',
  `govpayed` varchar(5) DEFAULT '未支付',
  `stime` varchar(20) DEFAULT NULL,
  `etime` varchar(20) DEFAULT NULL,
  `userrecordid` varchar(45) DEFAULT NULL,
  `goverecordid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`policyid`),
  UNIQUE KEY `id_UNIQUE` (`policyid`),
  KEY `productid_idx` (`productid`),
  CONSTRAINT `productid` FOREIGN KEY (`productid`) REFERENCES `insurance` (`productid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of policy
-- ----------------------------

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `recordid` int(11) NOT NULL,
  `from` int(11) DEFAULT NULL,
  `productid` int(11) DEFAULT NULL,
  `time` time DEFAULT NULL,
  PRIMARY KEY (`recordid`),
  UNIQUE KEY `recordid_UNIQUE` (`recordid`),
  KEY `productid1_idx` (`productid`),
  CONSTRAINT `productid1` FOREIGN KEY (`productid`) REFERENCES `insurance` (`productid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------

-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report` (
  `reportid` int(11) NOT NULL,
  `from` varchar(20) DEFAULT NULL,
  `to` varchar(20) DEFAULT NULL,
  `reason` varchar(45) DEFAULT NULL,
  `agree` varchar(10) DEFAULT NULL,
  `recordid` varchar(20) DEFAULT NULL,
  `agreeperson` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`reportid`),
  UNIQUE KEY `id_UNIQUE` (`reportid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of report
-- ----------------------------

-- ----------------------------
-- Table structure for salesmaninfo
-- ----------------------------
DROP TABLE IF EXISTS `salesmaninfo`;
CREATE TABLE `salesmaninfo` (
  `salesmanid` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `post` varchar(45) DEFAULT NULL,
  `idcard` varchar(45) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `age` int(4) DEFAULT NULL,
  `realname` varchar(45) DEFAULT NULL,
  `gender` enum('男','女') DEFAULT NULL,
  PRIMARY KEY (`salesmanid`),
  UNIQUE KEY `admininfoid_UNIQUE` (`salesmanid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salesmaninfo
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` varchar(11) DEFAULT NULL,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `level` int(3) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `ip` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`name`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (null, '1', '1', '2', null, null);
INSERT INTO `user` VALUES (null, '111', '1', '2', null, '0');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `name` varchar(45) NOT NULL,
  `age` varchar(4) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `disease` varchar(150) DEFAULT NULL,
  `idcard` varchar(45) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `realname` varchar(20) DEFAULT NULL,
  `gender` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`name`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('111', '', '1', '', '', '', '1', '0', '', '');
INSERT INTO `userinfo` VALUES ('3', '', '3', '', '', '', '3', '0', '', '');
INSERT INTO `userinfo` VALUES ('4', '', '4', '', '', '', '4', '0', '', '');
INSERT INTO `userinfo` VALUES ('用户', '', '4', '', '', '', '4', '0', '', '');
