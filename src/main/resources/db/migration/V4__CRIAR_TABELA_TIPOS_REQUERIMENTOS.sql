CREATE TABLE IF NOT EXISTS `tipos_requerimentos` (
  `id` bigint(20) NOT NULL,
  `dias_pentregar` int(11) DEFAULT NULL,
  `grupo` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `valor` double(5,2) DEFAULT 0.00,
  `linkpagamento` varchar(200) NOT NULL DEFAULT 'https://escolaalmeidasantos.com.br/#cursos'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
