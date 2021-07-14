/*
 Navicat Premium Data Transfer

 Source Server         : locahost
 Source Server Type    : MySQL
 Source Server Version : 50734
 Source Host           : localhost:3306
 Source Schema         : pmdemo

 Target Server Type    : MySQL
 Target Server Version : 50734
 File Encoding         : 65001

 Date: 14/07/2021 10:25:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for pm
-- ----------------------------
DROP TABLE IF EXISTS `pm`;
CREATE TABLE `pm`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `no` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deviceid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mpid` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `signalnumber` int(5) NULL DEFAULT NULL,
  `mpdes` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mptype` int(2) NULL DEFAULT NULL,
  `year` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `month` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `day` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `hour` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `curtime` datetime NULL DEFAULT NULL,
  `curvalue` double(10, 2) NULL DEFAULT NULL,
  `prehour` datetime NULL DEFAULT NULL,
  `prehourvalue` double(10, 2) NULL DEFAULT NULL,
  `difhour` double(10, 2) NULL DEFAULT NULL,
  `preday` datetime NULL DEFAULT NULL,
  `predayvalue` double(10, 2) NULL DEFAULT NULL,
  `difday` double(10, 2) NULL DEFAULT NULL,
  `premonth` datetime NULL DEFAULT NULL,
  `premonthvalue` double(10, 2) NULL DEFAULT NULL,
  `difmonth` double(10, 2) NULL DEFAULT NULL,
  `preyear` datetime NULL DEFAULT NULL,
  `preyearvalue` double(10, 2) NULL DEFAULT NULL,
  `difyear` double NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
