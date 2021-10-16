DROP TABLE IF EXISTS card_payment_details;

DROP TABLE IF EXISTS card;

DROP TABLE IF EXISTS login_user;


CREATE TABLE `login_user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` varchar(128) DEFAULT NULL COMMENT 'ユーザーID',
  `password` varchar(128) DEFAULT NULL COMMENT 'パスワード',
  `name` varchar(32) DEFAULT NULL COMMENT 'ユーザー名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='ログイン';

CREATE TABLE `card` (
  `id` char(36) NOT NULL COMMENT 'カードID',
  `user_id` int NOT NULL COMMENT 'ユーザーID',
  `name` varchar(32) DEFAULT NULL COMMENT 'カード名',
  `company` varchar(64) NOT NULL COMMENT 'カード会社',
  `brand` varchar(12) NOT NULL COMMENT 'カードブランド',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `login_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='カード';

CREATE TABLE `card_payment_details` (
  `id` char(36) NOT NULL COMMENT 'カードID',
  `payment_year` int NOT NULL COMMENT '支払い年',
  `payment_month` int NOT NULL COMMENT '支払い月',
  `payment_amount` int DEFAULT '0' COMMENT '支払い額',
  PRIMARY KEY (`id`,`payment_year`,`payment_month`),
  CONSTRAINT `card_payment_details_ibfk_1` FOREIGN KEY (`id`) REFERENCES `card` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='カード支払明細';


