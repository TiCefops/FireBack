CREATE TABLE IF NOT EXISTS`requerimentos` (
  `id` bigint(20) NOT NULL ,
  `responsavel` varchar(255) DEFAULT 'ND',
  `aluno_id` varchar(255) DEFAULT NULL,
  `tiporequerimento_id` bigint(20) DEFAULT NULL,
  `dataatualizacao` datetime DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `abertoem` datetime DEFAULT current_timestamp(),
  `concluido` tinyint(1) DEFAULT 0,
  `entregue` date DEFAULT '2021-12-01',
  `status` varchar(20) DEFAULT 'Aberto',
  `idaluno` varchar(255) DEFAULT NULL,
  `nome_aluno` varchar(255) DEFAULT NULL,
  `status_pagameto` varchar(50) DEFAULT 'Aguardando',
  `observacao` varchar(255) DEFAULT NULL,
  `protocolo` varchar(20) DEFAULT NULL,
   `pdf_link` varchar(255) DEFAULT NULL


) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
