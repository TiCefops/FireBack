CREATE TABLE IF NOT EXISTS `finança_interna` (
  `id` bigint(20) NOT NULL,
  `data_pagamento` datetime DEFAULT NULL,
  `data_vencimento` datetime DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `pago` bit(1) DEFAULT NULL,
  `pago_na_data` bit(1) DEFAULT NULL,
  `parcelas` int(11) NOT NULL,
  `valor` double NOT NULL,
  `abertura_caiaxa` tinyint(1) DEFAULT 0,
  `datade_criacao` datetime DEFAULT NULL,
  `fechamento_caixa` tinyint(1) DEFAULT 0,
  `meios_pagamento` varchar(255) DEFAULT NULL,
  `parcela_atual` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `unidade` varchar(255) DEFAULT NULL,
  `valor_pago` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;