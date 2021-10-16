DROP TABLE IF EXISTS card_payment_details;

DROP TABLE IF EXISTS card;

DROP TABLE IF EXISTS login_user;


CREATE TABLE `login_user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` varchar(128) DEFAULT NULL COMMENT '���[�U�[ID',
  `password` varchar(128) DEFAULT NULL COMMENT '�p�X���[�h',
  `name` varchar(32) DEFAULT NULL COMMENT '���[�U�[��',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='���O�C��';

CREATE TABLE `card` (
  `id` char(36) NOT NULL COMMENT '�J�[�hID',
  `user_id` int NOT NULL COMMENT '���[�U�[ID',
  `name` varchar(32) DEFAULT NULL COMMENT '�J�[�h��',
  `company` varchar(64) NOT NULL COMMENT '�J�[�h���',
  `brand` varchar(12) NOT NULL COMMENT '�J�[�h�u�����h',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `login_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='�J�[�h';

CREATE TABLE `card_payment_details` (
  `id` char(36) NOT NULL COMMENT '�J�[�hID',
  `payment_year` int NOT NULL COMMENT '�x�����N',
  `payment_month` int NOT NULL COMMENT '�x������',
  `payment_amount` int DEFAULT '0' COMMENT '�x�����z',
  PRIMARY KEY (`id`,`payment_year`,`payment_month`),
  CONSTRAINT `card_payment_details_ibfk_1` FOREIGN KEY (`id`) REFERENCES `card` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='�J�[�h�x������';


