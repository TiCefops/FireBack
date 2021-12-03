CREATE TABLE IF NOT EXISTS `notas` (
  `id` bigint(20) NOT NULL,
  `data_nota` datetime DEFAULT NULL,
  `nota` double DEFAULT NULL,
  `aluno_id` varchar(255) DEFAULT NULL,
  `atividade_id` int(11) DEFAULT NULL,
  `disciplina_id_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;