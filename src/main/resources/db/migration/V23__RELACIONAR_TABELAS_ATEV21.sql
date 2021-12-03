ALTER TABLE `alunos`
  ADD PRIMARY KEY (`id`), ADD KEY `FK4nvfryuyeo8mksx1k9kjomo3j` (`endereco_id`);

--
-- Índices de tabela `atividades`
--
ALTER TABLE `atividades`
  ADD PRIMARY KEY (`id`), ADD KEY `FK489otcnyqrcj4arrxw5doounc` (`disciplina_id`);

--
-- Índices de tabela `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `curso_aluno`
--
ALTER TABLE `curso_aluno`
  ADD KEY `FK4c91fsyv52w4lkg3n625wlbcy` (`aluno_id`), ADD KEY `FK40sy3vkdse4p8ja4t624am53e` (`cursos_id_id`);

--
-- Índices de tabela `curso_disciplinas`
--
ALTER TABLE `curso_disciplinas`
  ADD KEY `FKacxu02tu4s0mc66opppf65men` (`disciplinas_id`), ADD KEY `FKhc6evgy4o6jysjna05vl0o5wd` (`curso_id`);

--
-- Índices de tabela `disciplinas`
--
ALTER TABLE `disciplinas`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `disciplinas_atividade_id`
--
ALTER TABLE `disciplinas_atividade_id`
  ADD UNIQUE KEY `UK_s2qqge619h2n12o0qtu7fdpii` (`atividade_id_id`), ADD KEY `FK7712inwm4udcpgbiox4b4upnu` (`disciplinas_data_id`);

--
-- Índices de tabela `documentos`
--
ALTER TABLE `documentos`
  ADD PRIMARY KEY (`id`), ADD KEY `FK67pxi8rxlst5tiftgcl9j4fa1` (`alunos_id_id`);

--
-- Índices de tabela `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`id`), ADD KEY `FK4us705xm0mxouyv8kab8ocf2p` (`aluno_id`);

--
-- Índices de tabela `entidades_grupo`
--
ALTER TABLE `entidades_grupo`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `finança_interna`
--
ALTER TABLE `finança_interna`
  ADD PRIMARY KEY (`id`);

--


--
-- Índices de tabela `meio_pagamento`
--
ALTER TABLE `meio_pagamento`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `modulos`
--
ALTER TABLE `modulos`
  ADD PRIMARY KEY (`id`), ADD KEY `FKb78g205nrfmswrux55e1xg2r2` (`curso_id`);

--
-- Índices de tabela `modulos_disciplinas`
--
ALTER TABLE `modulos_disciplinas`
  ADD UNIQUE KEY `UK_f8yfqssrxh3e9tvqt1n4yiq52` (`disciplinas_id`), ADD KEY `FKpxvakt4yoxbsfsfq1jv0i7phd` (`modulo_data_id`);

--
-- Índices de tabela `notas`
--
ALTER TABLE `notas`
  ADD PRIMARY KEY (`id`), ADD KEY `FKtril82q8l63osqidsxuaaw4y8` (`aluno_id`), ADD KEY `FKm8j8gcxh46piw4y2r5dgboxev` (`atividade_id`), ADD KEY `FK22at27uhgs8t7yi2hbepivhg5` (`disciplina_id_id`);

--
-- Índices de tabela `password_reset_token`
--
ALTER TABLE `password_reset_token`
  ADD PRIMARY KEY (`id`), ADD KEY `FK83nsrttkwkb6ym0anu051mtxn` (`user_id`);

--
-- Índices de tabela `permission`
--
ALTER TABLE `permission`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`id`);

--


--
-- Índices de tabela `requerimentos`
--
ALTER TABLE `requerimentos`
  ADD PRIMARY KEY (`id`), ADD KEY `FKqid9wd99k3vx185d92chrj39u` (`aluno_id`), ADD KEY `FKq4d5c8fvgg9oc6tx8n3dlb97b` (`tiporequerimento_id`);

--
-- Índices de tabela `tipos_requerimentos`
--
ALTER TABLE `tipos_requerimentos`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `UK_k8d0f2n7n88w1a16yhua64onx` (`user_name`), ADD KEY `FKtskq3hrmo6eh3jg2c72jab2i` (`aluno_id`);

--
-- Índices de tabela `user_permission`
--
ALTER TABLE `user_permission`
  ADD KEY `FKo47t1we6do84ku6rb9jcey2s9` (`id_permission`), ADD KEY `FKprpp02ivhe66b5nrc0a3a4lk8` (`id_user`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `atividades`
--
ALTER TABLE `atividades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `curso`
--
ALTER TABLE `curso`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `disciplinas`
--
ALTER TABLE `disciplinas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `endereco`
--
ALTER TABLE `endereco`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `entidades_grupo`
--
ALTER TABLE `entidades_grupo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `finança_interna`
--
ALTER TABLE `finança_interna`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `modulos`
--
ALTER TABLE `modulos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `permission`
--
ALTER TABLE `permission`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `requerimentos`
--
ALTER TABLE `requerimentos`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Restrições para dumps de tabelas
--

--
-- Restrições para tabelas `alunos`
--
ALTER TABLE `alunos`
ADD CONSTRAINT `FK4nvfryuyeo8mksx1k9kjomo3j` FOREIGN KEY (`endereco_id`) REFERENCES `endereco` (`id`);

--
-- Restrições para tabelas `atividades`
--
ALTER TABLE `atividades`
ADD CONSTRAINT `FK489otcnyqrcj4arrxw5doounc` FOREIGN KEY (`disciplina_id`) REFERENCES `disciplinas` (`id`);

--
-- Restrições para tabelas `curso_aluno`
--
ALTER TABLE `curso_aluno`
ADD CONSTRAINT `FK40sy3vkdse4p8ja4t624am53e` FOREIGN KEY (`cursos_id_id`) REFERENCES `curso` (`id`),
ADD CONSTRAINT `FK4c91fsyv52w4lkg3n625wlbcy` FOREIGN KEY (`aluno_id`) REFERENCES `alunos` (`id`);

--
-- Restrições para tabelas `curso_disciplinas`
--
ALTER TABLE `curso_disciplinas`
ADD CONSTRAINT `FKacxu02tu4s0mc66opppf65men` FOREIGN KEY (`disciplinas_id`) REFERENCES `disciplinas` (`id`),
ADD CONSTRAINT `FKhc6evgy4o6jysjna05vl0o5wd` FOREIGN KEY (`curso_id`) REFERENCES `curso` (`id`);

--
-- Restrições para tabelas `disciplinas_atividade_id`
--
ALTER TABLE `disciplinas_atividade_id`
ADD CONSTRAINT `FK3fesam5ltj26eubjcm8phwcho` FOREIGN KEY (`atividade_id_id`) REFERENCES `atividades` (`id`),
ADD CONSTRAINT `FK7712inwm4udcpgbiox4b4upnu` FOREIGN KEY (`disciplinas_data_id`) REFERENCES `disciplinas` (`id`);

--
-- Restrições para tabelas `documentos`
--
ALTER TABLE `documentos`
ADD CONSTRAINT `FK67pxi8rxlst5tiftgcl9j4fa1` FOREIGN KEY (`alunos_id_id`) REFERENCES `alunos` (`id`);

--
-- Restrições para tabelas `endereco`
--
ALTER TABLE `endereco`
ADD CONSTRAINT `FK4us705xm0mxouyv8kab8ocf2p` FOREIGN KEY (`aluno_id`) REFERENCES `alunos` (`id`);

--
-- Restrições para tabelas `modulos`
--
ALTER TABLE `modulos`
ADD CONSTRAINT `FKb78g205nrfmswrux55e1xg2r2` FOREIGN KEY (`curso_id`) REFERENCES `curso` (`id`);

--
-- Restrições para tabelas `modulos_disciplinas`
--
ALTER TABLE `modulos_disciplinas`
ADD CONSTRAINT `FK6bdnlve7b9vrlbpiu3rqs6ijc` FOREIGN KEY (`disciplinas_id`) REFERENCES `disciplinas` (`id`),
ADD CONSTRAINT `FKpxvakt4yoxbsfsfq1jv0i7phd` FOREIGN KEY (`modulo_data_id`) REFERENCES `modulos` (`id`);

--
-- Restrições para tabelas `notas`
--
ALTER TABLE `notas`
ADD CONSTRAINT `FK22at27uhgs8t7yi2hbepivhg5` FOREIGN KEY (`disciplina_id_id`) REFERENCES `disciplinas` (`id`),
ADD CONSTRAINT `FKm8j8gcxh46piw4y2r5dgboxev` FOREIGN KEY (`atividade_id`) REFERENCES `atividades` (`id`),
ADD CONSTRAINT `FKtril82q8l63osqidsxuaaw4y8` FOREIGN KEY (`aluno_id`) REFERENCES `alunos` (`id`);

--
-- Restrições para tabelas `password_reset_token`
--
ALTER TABLE `password_reset_token`
ADD CONSTRAINT `FK83nsrttkwkb6ym0anu051mtxn` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Restrições para tabelas `requerimentos`
--
ALTER TABLE `requerimentos`
ADD CONSTRAINT `FKq4d5c8fvgg9oc6tx8n3dlb97b` FOREIGN KEY (`tiporequerimento_id`) REFERENCES `tipos_requerimentos` (`id`),
ADD CONSTRAINT `FKqid9wd99k3vx185d92chrj39u` FOREIGN KEY (`aluno_id`) REFERENCES `alunos` (`id`);

--
-- Restrições para tabelas `users`
--
ALTER TABLE `users`
ADD CONSTRAINT `FKtskq3hrmo6eh3jg2c72jab2i` FOREIGN KEY (`aluno_id`) REFERENCES `alunos` (`id`);

--
-- Restrições para tabelas `user_permission`
--
ALTER TABLE `user_permission`
ADD CONSTRAINT `FKo47t1we6do84ku6rb9jcey2s9` FOREIGN KEY (`id_permission`) REFERENCES `permission` (`id`),
ADD CONSTRAINT `FKprpp02ivhe66b5nrc0a3a4lk8` FOREIGN KEY (`id_user`) REFERENCES `users` (`id`);