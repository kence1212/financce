/*
Navicat MySQL Data Transfer

Source Server         : shenhang
Source Server Version : 50717
Source Host           : localhost:3307
Source Database       : finance

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-08-22 16:19:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for finance_kind
-- ----------------------------
DROP TABLE IF EXISTS `finance_kind`;
CREATE TABLE `finance_kind` (
  `id` int(11) NOT NULL COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '类型名称',
  `money` double DEFAULT NULL COMMENT '当前金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='初始化信息表';
