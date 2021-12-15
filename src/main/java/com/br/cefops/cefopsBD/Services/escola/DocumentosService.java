package com.br.cefops.cefopsBD.Services.escola;

import com.br.cefops.cefopsBD.converter.DozerConvert;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.DocumentosVo;
import com.br.cefops.cefopsBD.domain.Exception.ResourceDuplicateException;
import com.br.cefops.cefopsBD.domain.Exception.ResourceNotFoundException;
import com.br.cefops.cefopsBD.domain.escola.Documentos.DocumentosData;
import com.br.cefops.cefopsBD.repository.GestaoEscolar.Documentos.DocumentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentosService {
    @Autowired
    DocumentosRepository repository;

    public DocumentosVo buscarDocumentos(String id){
        var data=repository.buscarAlunoId(id);

        if (data==null){

            throw  new ResourceNotFoundException("Aluno não cadastrado");
        }
       else {
            var documento= DozerConvert.parseObject(
                    data, DocumentosVo.class);
           return documento;
        }

    };
    public  DocumentosVo novoDocumento(DocumentosVo documentosVo){

            var entity=DozerConvert.parseObject(documentosVo,DocumentosData.class);
            var doc=   DozerConvert.parseObject(repository.save(entity), DocumentosData.class);
            return documentosVo;

    };
}
