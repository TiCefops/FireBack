package com.br.cefops.cefopsBD.Services.escola;

import com.br.cefops.cefopsBD.converter.DozerConvert;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.RequerimentoVo;
import com.br.cefops.cefopsBD.domain.Exception.ResourceNotFoundException;
import com.br.cefops.cefopsBD.domain.escola.Requerimentos.Requerimentos;
import com.br.cefops.cefopsBD.repository.GestaoEscolar.RequerimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
@Service
public class RequerimentoService {
    @Autowired
    RequerimentoRepository repository;


    public List<RequerimentoVo> buscarTodosRequerimentos(){



        return   DozerConvert.parseListObjects(
                repository.findAll(),
                RequerimentoVo.class);
    }

    public RequerimentoVo buscarRequerimentoId(Long id){

        return DozerConvert.parseObject(
                repository.findById(id),
                RequerimentoVo.class);
    }

    public RequerimentoVo novoRequerimento(RequerimentoVo requerimentoVo){
        var novoRequerimento=DozerConvert.parseObject(
                requerimentoVo,
                Requerimentos.class);
                repository.save(novoRequerimento);
        return requerimentoVo ;
    }
    public RequerimentoVo alterarRequerimento(RequerimentoVo requerimentoVo){
        var novoRequerimento=DozerConvert.parseObject(
                requerimentoVo,
                Requerimentos.class);
        repository.save(novoRequerimento);
        return requerimentoVo ;
    }
    public ResponseEntity deletarRequerimento(Long id){
        var requerimento=repository.findById(id);
        if (requerimento.isPresent()){
            repository.deleteById(id);
            ResponseEntity.ok();
        }throw new ResourceNotFoundException("Registro não encontrado");
    }

    public List<RequerimentoVo> buscarPorIdAluno(String id){
        var dados=repository.buscarAlunoId(id);

        return DozerConvert.parseListObjects(
                dados,
                RequerimentoVo.class);
    }


    @Transactional
    public void setResponsavel(Long id, String responsavel, String status){
        repository.setResponsavel(id,responsavel,status);

    }
    @Transactional
    public void setStatus(Long id,String status){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        repository.setStatus(id,status,calendar.getTime());

    }
}
