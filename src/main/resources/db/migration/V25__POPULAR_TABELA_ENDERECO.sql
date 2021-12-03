INSERT INTO `escolaalmeidas01`.`endereco`
(`id`,`bairro`,`cep`,`cidade`,`complemento`,`estado`,
`numero`,`rua`,`uf`,`aluno_id`)
VALUES
(1,"Bairro_Teste","01234567","Cidade_Teste","Complemento_Teste","Estado_Teste","60","Rua_teste","Sp","testeMock");

UPDATE `escolaalmeidas01`.`alunos`
SET
`endereco_id` = 1
WHERE id ="testeMock";