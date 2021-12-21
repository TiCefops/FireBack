package com.br.cefops.cefopsBD.Services.escola;

import com.br.cefops.cefopsBD.converter.DozerConvert;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.NotasVo;
import com.br.cefops.cefopsBD.domain.escola.Curso.NotasAlunosData;
import com.br.cefops.cefopsBD.repository.GestaoEscolar.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotasServices {
    @Autowired
    NotasRepository repository;


    public List<NotasVo> EncontrarNotasPorID(String id) {
        var dados=repository.findAllByAlunoId(id);

        return DozerConvert.parseListObjects(dados,NotasVo.class);
    }

    public  NotasVo SetarNota(NotasVo notas){
        NotasVo nota=DozerConvert.parseObject(notas,NotasVo.class);
        NotasAlunosData notasAlunosData=DozerConvert.parseObject(nota,NotasAlunosData.class);
        repository.save(notasAlunosData);


        return nota;
    }

    public  NotasAlunosData AtualizarNotas(NotasAlunosData notas){
         return   repository.save(notas);

    }

}
