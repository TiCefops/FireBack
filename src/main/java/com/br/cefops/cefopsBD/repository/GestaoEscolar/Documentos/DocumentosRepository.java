package com.br.cefops.cefopsBD.repository.GestaoEscolar.Documentos;

import com.br.cefops.cefopsBD.domain.escola.Documentos.DocumentosData;
import com.br.cefops.cefopsBD.domain.escola.Documentos.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DocumentosRepository  extends JpaRepository<DocumentosData,Long> {

    @Query(value = "SELECT E FROM DocumentosData as E  WHERE E.alunosId.id  =:id")
    DocumentosData buscarAlunoId(String id);

}
