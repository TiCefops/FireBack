CREATE TABLE IF NOT EXISTS `curso` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `is_online` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;