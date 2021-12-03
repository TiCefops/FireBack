CREATE TABLE IF NOT EXISTS `modulos` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `curso_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;