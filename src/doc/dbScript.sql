CREATE DATABASE demo CHARACTER SET utf8;

/*
Navicat MySQL Data Transfer

Source Server         : MyLocalDB
Source Server Version : 50624
Source Host           : 127.0.0.1:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-01-30 16:48:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '序列号',
    `code` varchar(50) DEFAULT NULL COMMENT '用户编号',
    `name` varchar(100) DEFAULT NULL COMMENT '用户名',
    `password` varchar(100) DEFAULT NULL COMMENT '密码',
    `status` varchar(1) DEFAULT '0' COMMENT '状态',
    `org_code` varchar(20) DEFAULT NULL COMMENT '机构编号',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('2', 'root', 'root', '123456', '1', '010101');
INSERT INTO `sys_user` VALUES ('3', 'root1', 'root1', '123456', '1', '010101');
