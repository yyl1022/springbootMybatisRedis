DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `num` VARCHAR(11) DEFAULT NULL,
  `name` VARCHAR(255) DEFAULT NULL,
  `gender` VARCHAR(255) DEFAULT NULL,
  `age` INT(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '324324', '第五期定期', '女', '34');
INSERT INTO `student` VALUES ('2', '42522', '几点回去', '男', '32');
INSERT INTO `student` VALUES ('3', '243532', '黑奴', '女', '23');