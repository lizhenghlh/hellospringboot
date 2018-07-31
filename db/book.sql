/*
 Navicat Premium Data Transfer

 Source Server         : hello
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Schema         : book

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 31/07/2018 18:35:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '书名',
  `author` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '作者',
  `category` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of book
-- ----------------------------
BEGIN;
INSERT INTO `book` VALUES (1, 'Java从入门到放弃', 'Damon', '健康');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
