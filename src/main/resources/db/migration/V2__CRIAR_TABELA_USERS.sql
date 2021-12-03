CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint(20) NOT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `account_non_expired` tinyint(1) DEFAULT 1,
  `account_non_locked` tinyint(1) DEFAULT 1,
  `cpf` varchar(255) DEFAULT NULL,
  `credentials_non_expired` tinyint(1) DEFAULT 1,
  `email` varchar(255) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT 1,
  `frist_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `aluno_id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;