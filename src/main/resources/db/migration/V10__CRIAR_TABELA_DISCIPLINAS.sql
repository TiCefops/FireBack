
CREATE TABLE IF NOT EXISTS `disciplinas` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `carga_estagio` int(11) DEFAULT 0,
  `carga_teoria` int(11) DEFAULT 0,
  `carga_total` int(11) DEFAULT 0,
  `requisito_estagio` bit(1) DEFAULT NULL,
  `valor` double(6,2) DEFAULT 0.00
) ENGINE=InnoDB DEFAULT CHARSET=latin1;