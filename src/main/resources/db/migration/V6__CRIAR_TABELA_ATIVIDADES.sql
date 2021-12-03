CREATE TABLE IF NOT EXISTS `atividades` (
  `id` int(11) NOT NULL,
  `data` datetime DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `nota` double DEFAULT NULL,
  `disciplina_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;