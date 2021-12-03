CREATE TABLE IF NOT EXISTS `posts` (
  `id` int(11) NOT NULL,
  `datade_criacao` datetime DEFAULT NULL,
  `poste` longtext DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;