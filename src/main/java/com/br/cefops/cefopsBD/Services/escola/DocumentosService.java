package com.br.cefops.cefopsBD.Services.escola;

import com.br.cefops.cefopsBD.converter.DozerConvert;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.DocumentosVo;
import com.br.cefops.cefopsBD.repository.GestaoEscolar.Documentos.DocumentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentosService {
    @Autowired
    DocumentosRepository repository;

    public DocumentosVo buscarDocumentos(String id){
        var data=repository.buscarAlunoId(id);
        var documento= DozerConvert.parseObject(
                data, DocumentosVo.class);
        return documento;


    };
}
