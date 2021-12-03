CREATE TABLE IF NOT EXISTS `requerimentos` (
  `id` bigint(20) NOT NULL ,
  `responsavel` varchar(255) DEFAULT 'ND',
  `aluno_id` varchar(255) DEFAULT NULL,
  `tiporequerimento_id` bigint(20) DEFAULT NULL,
  `dataatualizacao` datetime DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `abertoem` datetime DEFAULT current_timestamp(),
  `concluido` tinyint(1) NOT NULL DEFAULT 0,
  `entregue` date DEFAULT '2021-12-01',
  `status` varchar(20) NOT NULL DEFAULT 'Aberto',
  `idaluno` varchar(255) DEFAULT NULL,
  `nome_aluno` varchar(255) DEFAULT NULL,
  `status_pagameto` varchar(50) NOT NULL DEFAULT 'Aguardando'

) ENGINE=InnoDB DEFAULT CHARSET=latin1;
