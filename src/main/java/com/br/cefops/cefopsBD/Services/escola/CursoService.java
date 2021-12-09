package com.br.cefops.cefopsBD.Services.escola;

import com.br.cefops.cefopsBD.converter.DozerConvert;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.Curso.cursoVo;
import com.br.cefops.cefopsBD.domain.escola.Curso.CursoData;
import com.br.cefops.cefopsBD.repository.GestaoEscolar.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    CursoRepository repository;

    public cursoVo novoCurso(cursoVo data){
       var entity=DozerConvert.parseObject(data,CursoData.class);
        var vo=DozerConvert.parseObject(repository.save(entity),cursoVo.class);
        return vo;

    }
    public List<cursoVo> buscarTodos(){
        var vo=DozerConvert.parseListObjects(repository.findAll(),cursoVo.class);
        return  vo;
    }


}
