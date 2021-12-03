CREATE TABLE IF NOT EXISTS `alunos` (
  `id` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `nacionalidade` varchar(255) DEFAULT NULL,
  `tele_fone` char(10) DEFAULT NULL,
  `tele_fone_celular` char(11) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `data_nanscimento` DATE DEFAULT NULL,
  `datacadastro` datetime DEFAULT CURRENT_TIMESTAMP,
  `enabled` tinyint(1) NOT NULL DEFAULT 1,
  `estado_civil` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `foto_usuario` varchar(200) DEFAULT 'https://media.istockphoto.com/photos/astronaut-lying-in-the-meadow-picture-id1304263738?s=612x612',
  `genero` varchar(255) DEFAULT NULL,
  `endereco_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
