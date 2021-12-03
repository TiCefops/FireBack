package com.br.cefops.cefopsBD.repository.GestaoEscolar.Documentos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.br.cefops.cefopsBD.domain.escola.Documentos.Endereco;

public interface EndrerecoRepository extends JpaRepository<Endereco,Long >  {
	
	@Query(value = "SELECT E FROM Endereco as E  WHERE E.alunoId.id = ?1")
    Endereco buscarAlunoId(String id);

}
