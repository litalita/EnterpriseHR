/*
Navicat MySQL Data Transfer

Source Server         : wu
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : hospital

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2020-08-30 03:52:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for attendance
-- ----------------------------
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `employee_number` int(10) DEFAULT NULL,
  `day` date DEFAULT NULL,
  `time_type` enum('上午','下午','加班') DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  `start_type` enum('正常','迟到','未签到') DEFAULT '未签到',
  `end_time` time DEFAULT NULL,
  `end_type` enum('正常','早退','未签到') DEFAULT '未签到',
  `work_type` enum('上班','请假') DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendance
-- ----------------------------
INSERT INTO `attendance` VALUES ('48', '1007', '2020-08-29', '上午', '10:34:49', '迟到', '10:34:49', '正常', null, null);
INSERT INTO `attendance` VALUES ('49', '1001', '2020-08-29', '上午', '10:52:47', '迟到', '10:52:47', '正常', null, null);

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `department_number` int(10) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `manager` varchar(10) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `department_number` (`department_number`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '2001', '总经理办公室', '王安', '020-3456180', '行政楼201', '');
INSERT INTO `department` VALUES ('2', '2002', '行政部', '周易', '020-3456324', '行政楼304', '');
INSERT INTO `department` VALUES ('3', '2003', '人力资源部', '周一卓', '020-3456909', '行政楼205', '');
INSERT INTO `department` VALUES ('4', '2004', '财务部', '何关铭', '020-3456231', '办公楼102', '');
INSERT INTO `department` VALUES ('5', '2005', '生产技术部', '王文卓', '020-3456782', '生产间1-102', '');
INSERT INTO `department` VALUES ('6', '2006', '计划营销部', '席华文', '020-3456098', '办公楼101', '');
INSERT INTO `department` VALUES ('7', '2007', '安全监察部', '吴康', '020-3456143', '生产间2-101', '');
INSERT INTO `department` VALUES ('8', '2008', '营运部', '范伟', '020-3456677', '办公楼203', '');
INSERT INTO `department` VALUES ('9', '2009', '质量管理部  ', '吴亮华', '020-3456489', '生产间2-102', '');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `employee_number` int(10) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `gender` enum('男','女') DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `telephone` varchar(15) DEFAULT '',
  `email` varchar(30) DEFAULT '',
  `address` varchar(50) DEFAULT NULL,
  `photo` varchar(50) DEFAULT '',
  `education` varchar(20) DEFAULT '',
  `department_number` int(10) DEFAULT NULL,
  `position_number` int(10) DEFAULT NULL,
  `in_time` date DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `notes` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `department_number` (`department_number`),
  KEY `title_number` (`position_number`),
  KEY `employee_number` (`employee_number`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '1001', '李明（人事部主任）', '男', '1996-03-01', '18138798473', '1726933932@qq.com', '广州天河', '', '研究生', '2003', '3003', '2016-02-22', '1001', '');
INSERT INTO `employee` VALUES ('2', '1007', '梁苏（部门主任）', '女', '1996-03-04', '13138398433', '', '广州天河', '', '本科', '2003', '3009', '2013-01-13', '1007', '');
INSERT INTO `employee` VALUES ('3', '1008', '何柏盈（部门员工）', '女', '1997-06-06', '16668398433', '', '广州天河', '', '研究生', '2004', '3002', '2013-06-28', '1008', '');
INSERT INTO `employee` VALUES ('4', '1009', '李明昭', '男', '1995-09-24', '18888888833', '', '广州天河', '', '研究生', '2005', '3009', '2020-02-06', '1009', '');
INSERT INTO `employee` VALUES ('5', '1010', '杨康杰', '男', '1995-01-26', '13332228433', '', '广州天河', '', '本科', '2006', '3009', '2019-05-12', '1010', '');
INSERT INTO `employee` VALUES ('6', '1011', '唐治', '男', '1995-03-29', '18888888888', '', '广州天河', null, '本科', '2007', '3009', '2017-07-05', 'tz4', '');
INSERT INTO `employee` VALUES ('7', '1012', '张璐', '女', '1997-03-03', '13325263738', '1735621771@qq.com', '广州天河', null, '博士', '2008', '3009', '2012-07-05', '1001', '');
INSERT INTO `employee` VALUES ('8', '1013', '李罗一', '男', '1990-07-01', '18877788833', '', '广州天河', '', '研究生', '2005', '3002', '2020-02-06', '1013', '');

-- ----------------------------
-- Table structure for history
-- ----------------------------
DROP TABLE IF EXISTS `history`;
CREATE TABLE `history` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `employee_number` int(10) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `gender` enum('男','女') DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `telephone` varchar(20) DEFAULT '',
  `email` varchar(30) DEFAULT '',
  `address` varchar(50) DEFAULT '',
  `photo` varchar(50) DEFAULT '',
  `education` varchar(20) DEFAULT '',
  `in_time` date DEFAULT NULL,
  `out_time` date DEFAULT NULL,
  `department_number` int(10) DEFAULT NULL,
  `position_number` int(10) DEFAULT NULL,
  `status` enum('离职','在职','退休') DEFAULT NULL,
  `home` varchar(100) DEFAULT '',
  `notes` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of history
-- ----------------------------
INSERT INTO `history` VALUES ('2', '1002', '王秀英', '女', '1992-03-08', '18890678821', '', '', '', '', '2011-04-29', '2020-07-04', '2008', '3009', '离职', '', '');
INSERT INTO `history` VALUES ('3', '1003', '李强', '男', '1993-12-22', '15666668821', '', '', '', '', '2010-05-06', '2019-07-05', '2001', '3009', '退休', '', '');
INSERT INTO `history` VALUES ('4', '1004', '刘洋', '男', '1991-07-26', '15590678821', '', '', '', '', '2009-12-23', '2020-07-04', '2009', '3009', '退休', '', '');
INSERT INTO `history` VALUES ('5', '1005', '李敏', '女', '1991-01-03', '13791826142', '', '', '', '', '2010-03-29', '2017-07-05', '2008', '3009', '退休', '', '');
INSERT INTO `history` VALUES ('6', '1006', '王伟 ', '女', '1990-06-12', '13986207926', '', '', '', '', '2010-10-12', '2018-07-06', '2007', '3009', '离职', '', '');

-- ----------------------------
-- Table structure for lea
-- ----------------------------
DROP TABLE IF EXISTS `lea`;
CREATE TABLE `lea` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `employee_number` int(10) DEFAULT NULL,
  `department_number` int(10) DEFAULT NULL,
  `start_time` date DEFAULT NULL,
  `end_time` date DEFAULT NULL,
  `days` varchar(10) DEFAULT NULL,
  `reason` varchar(100) DEFAULT NULL,
  `type` enum('事假','病假') DEFAULT NULL,
  `manager` varchar(10) DEFAULT NULL,
  `status` enum('已批准','未批准') DEFAULT '未批准',
  `notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lea
-- ----------------------------
INSERT INTO `lea` VALUES ('1', '1007', '2002', '2020-07-11', '2020-07-12', '1', '家里有事', '事假', null, '已批准', null);
INSERT INTO `lea` VALUES ('2', '1008', '2001', '2020-07-11', '2020-07-12', '2', '身体不舒服', '病假', null, '已批准', null);
INSERT INTO `lea` VALUES ('3', '1009', '2004', '2020-07-11', '2020-07-12', '1', '身体不舒服', '病假', null, '已批准', null);
INSERT INTO `lea` VALUES ('7', '1010', '2005', '2020-07-11', '2020-07-12', '3', '家里有事', '事假', null, '已批准', null);
INSERT INTO `lea` VALUES ('8', '1009', '2014', '2020-07-12', '2020-07-12', '1', '家里有事', '事假', null, '已批准', null);
INSERT INTO `lea` VALUES ('9', '1012', '2007', '2020-07-12', '2020-07-12', '1', '家里有事', '事假', null, '已批准', null);
INSERT INTO `lea` VALUES ('10', '1011', '2006', '2020-07-12', '2020-07-12', '1', '家里有事', '事假', null, '已批准', null);
INSERT INTO `lea` VALUES ('15', '1001', '2003', '2020-08-06', '2020-08-06', '1', '有事外出', '事假', null, '已批准', null);
INSERT INTO `lea` VALUES ('16', '1009', '2005', '2020-08-30', '2020-08-30', '1', '家里有事需要回老家一趟，恳请领导批准。', '事假', null, '未批准', null);

-- ----------------------------
-- Table structure for move
-- ----------------------------
DROP TABLE IF EXISTS `move`;
CREATE TABLE `move` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `employee_number` int(10) DEFAULT NULL,
  `before` int(10) DEFAULT NULL,
  `after` int(10) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `manager` varchar(10) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of move
-- ----------------------------
INSERT INTO `move` VALUES ('1', '1011', '2010', '2006', '2020-07-10 20:40:20', '张彤', null);
INSERT INTO `move` VALUES ('3', '1007', '2003', '2002', '2020-07-11 09:53:12', '张彤', null);

-- ----------------------------
-- Table structure for overtime
-- ----------------------------
DROP TABLE IF EXISTS `overtime`;
CREATE TABLE `overtime` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `department_number` int(10) DEFAULT NULL,
  `employee_number` int(10) DEFAULT NULL,
  `day` date DEFAULT NULL,
  `start_time` time DEFAULT NULL,
  `end_time` time DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of overtime
-- ----------------------------
INSERT INTO `overtime` VALUES ('1', '2002', '1007', '2019-07-12', '21:00:00', '22:00:00', null);
INSERT INTO `overtime` VALUES ('2', '2003', '1001', '2020-07-12', '20:01:30', '23:59:00', null);
INSERT INTO `overtime` VALUES ('13', '2005', '1007', '2020-08-05', null, null, null);

-- ----------------------------
-- Table structure for position
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `position_number` int(10) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `level` enum('部门主任','部门员工','人事部主任','人事部员工') DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `position_number` (`position_number`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', '3001', '总经理', '人事部主任', '');
INSERT INTO `position` VALUES ('2', '3002', '部门主管', '部门主任', '');
INSERT INTO `position` VALUES ('3', '3003', '人力资源主管', '人事部主任', '');
INSERT INTO `position` VALUES ('4', '3004', '财务主管', '部门主任', '');
INSERT INTO `position` VALUES ('5', '3005', '生产技术主管', '部门主任', '');
INSERT INTO `position` VALUES ('6', '3006', '计划营销员', '部门员工', '');
INSERT INTO `position` VALUES ('7', '3007', '安全监察员', '部门员工', '');
INSERT INTO `position` VALUES ('8', '3008', '营运员', '部门员工', '');
INSERT INTO `position` VALUES ('9', '3009', '部门员工', '部门员工', '');

-- ----------------------------
-- Table structure for rewards_punishment
-- ----------------------------
DROP TABLE IF EXISTS `rewards_punishment`;
CREATE TABLE `rewards_punishment` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `employee_number` int(10) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `reason` varchar(100) DEFAULT NULL,
  `money` float(8,0) DEFAULT NULL,
  `time` datetime(6) DEFAULT NULL,
  `manager` varchar(10) DEFAULT NULL,
  `notes` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `employee_number` (`employee_number`),
  CONSTRAINT `rewards_punishment_ibfk_1` FOREIGN KEY (`employee_number`) REFERENCES `employee` (`employee_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rewards_punishment
-- ----------------------------
