/*
 Navicat MySQL Data Transfer

 Source Server         : 123.58.128.123
 Source Server Version : 50173
 Source Host           : 123.58.128.123
 Source Database       : zuoqing

 Target Server Version : 50173
 File Encoding         : utf-8

 Date: 11/27/2017 10:12:52 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `city`
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(11) NOT NULL,
  `province_id` int(11) DEFAULT NULL,
  `city_name` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `city`
-- ----------------------------
BEGIN;
INSERT INTO `city` VALUES ('1', '111', '111', 'sdfsdfsdfsdfsdf');
COMMIT;

-- ----------------------------
--  Table structure for `girl`
-- ----------------------------
DROP TABLE IF EXISTS `girl`;
CREATE TABLE `girl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `cup_size` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `girl`
-- ----------------------------
BEGIN;
INSERT INTO `girl` VALUES ('24', '1', '111111'), ('25', '33', '111111'), ('26', '33', '111111'), ('27', '19', '111111'), ('28', '19', '111111'), ('29', '19', '111111'), ('30', '19', '111111');
COMMIT;

-- ----------------------------
--  Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_code` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `menu_level` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `menu_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `menu_note` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `menu_parent_id` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `menu_type` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `menu_url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `state` int(11) NOT NULL,
  PRIMARY KEY (`menu_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
--  Records of `menu`
-- ----------------------------
BEGIN;
INSERT INTO `menu` VALUES ('1', '000001', '1', '订单管理', null, null, null, null, '0'), ('2', '000002', '1', '用户管理', null, null, null, null, '0'), ('3', '000003', '1', '消息管理', null, null, null, null, '0');
COMMIT;

-- ----------------------------
--  Table structure for `u_permission`
-- ----------------------------
DROP TABLE IF EXISTS `u_permission`;
CREATE TABLE `u_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `url` varchar(256) DEFAULT NULL COMMENT 'url地址',
  `name` varchar(64) DEFAULT NULL COMMENT 'url描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `u_permission`
-- ----------------------------
BEGIN;
INSERT INTO `u_permission` VALUES ('1', '/user', 'usermanager'), ('2', '/index1', null);
COMMIT;

-- ----------------------------
--  Table structure for `u_role`
-- ----------------------------
DROP TABLE IF EXISTS `u_role`;
CREATE TABLE `u_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL COMMENT '角色名称',
  `type` varchar(10) DEFAULT NULL COMMENT '角色类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `u_role`
-- ----------------------------
BEGIN;
INSERT INTO `u_role` VALUES ('1', 'admin', '1');
COMMIT;

-- ----------------------------
--  Table structure for `u_role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `u_role_permission`;
CREATE TABLE `u_role_permission` (
  `rid` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `pid` bigint(20) DEFAULT NULL COMMENT '权限ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `u_role_permission`
-- ----------------------------
BEGIN;
INSERT INTO `u_role_permission` VALUES ('1', '1'), ('1', '2');
COMMIT;

-- ----------------------------
--  Table structure for `u_user`
-- ----------------------------
DROP TABLE IF EXISTS `u_user`;
CREATE TABLE `u_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱|登录帐号',
  `pswd` varchar(32) DEFAULT NULL COMMENT '密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` bigint(1) DEFAULT '1' COMMENT '1:有效，0:禁止登录',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `u_user`
-- ----------------------------
BEGIN;
INSERT INTO `u_user` VALUES ('1', 'admin', null, '1234567', '2017-05-10 20:22:59', null, '1');
COMMIT;

-- ----------------------------
--  Table structure for `u_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `u_user_role`;
CREATE TABLE `u_user_role` (
  `uid` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `rid` bigint(20) DEFAULT NULL COMMENT '角色ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `u_user_role`
-- ----------------------------
BEGIN;
INSERT INTO `u_user_role` VALUES ('1', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
