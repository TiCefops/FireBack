package com.br.cefops.cefopsBD.Services.escola;

import com.br.cefops.cefopsBD.converter.DozerConvert;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.DocumentosVo;
import com.br.cefops.cefopsBD.domain.Exception.ResourceDuplicateException;
import com.br.cefops.cefopsBD.domain.Exception.ResourceNotFoundException;
import com.br.cefops.cefopsBD.domain.escola.Documentos.DocumentosData;
import com.br.cefops.cefopsBD.repository.GestaoEscolar.Documentos.DocumentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service

public class DocumentosService {
    @Autowired
    DocumentosRepository repository;

    public DocumentosVo buscarDocumentos(String id) {

        var data = repository.buscarAlunoId(id);

        if (data == null) {

            throw new ResourceNotFoundException("Aluno não cadastrado");
        }

        var documento = DozerConvert.parseObject(
                data, DocumentosVo.class);
        return documento;


    }



    public ResponseEntity<DocumentosVo> novoDocumento(DocumentosVo documentosVo) {

        DocumentosData entity = DozerConvert.parseObject(documentosVo, DocumentosData.class);
        DocumentosData doc = DozerConvert.parseObject(repository.save(entity), DocumentosData.class);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }



    public ResponseEntity<DocumentosVo> attDocumento(DocumentosVo data) {

        DocumentosData entity = DozerConvert.parseObject(data, DocumentosData.class);
        try {
            repository.save(entity);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
