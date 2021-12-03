CREATE TABLE IF NOT EXISTS `entidades_grupo` (
  `id` bigint(20) NOT NULL,
  `cnpj` varchar(255) DEFAULT NULL,
  `nome_abreviado_string` varchar(255) DEFAULT NULL,
  `nome_completo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;