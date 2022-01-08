CREATE TABLE IF NOT EXISTS `documentos` (
  `id` bigint(20) NOT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `rg` varchar(11) DEFAULT NULL,
  `dataemissaorg` DATE  DEFAULT NULL,
  `estadoemissorrg` varchar(90) DEFAULT NULL,
  `orgaoemissorrg` varchar(90) DEFAULT NULL,
  `tituloeleitor` varchar(11) DEFAULT NULL,
  `dataemissaotitulo` DATE DEFAULT NULL,
  `estadoemissortitulo` varchar(90) DEFAULT NULL,
  `secao` varchar(20) DEFAULT NULL,
  `zona` varchar(10) DEFAULT NULL,
  `nomedamae` varchar(255) DEFAULT NULL,
  `nomedopai` varchar(255) DEFAULT NULL,
  `alunos_id_id` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;