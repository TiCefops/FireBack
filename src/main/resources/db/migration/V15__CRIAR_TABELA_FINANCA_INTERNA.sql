CREATE TABLE IF NOT EXISTS `finança_interna` (
  `id` bigint(20) NOT NULL,
  `data_pagamento` datetime DEFAULT NULL,
  `data_vencimento` date DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `pago` bit(1) DEFAULT NULL,
  `parcelas` int(11) NOT NULL,
  `valor` double NOT NULL,
  `datade_criacao` datetime DEFAULT NULL,
  `meios_pagamento` varchar(90) DEFAULT NULL,
  `parcela_atual` int(3) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `unidade` varchar(255) DEFAULT NULL,
  `valor_pago` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;