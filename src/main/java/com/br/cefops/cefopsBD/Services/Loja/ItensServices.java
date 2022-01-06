package com.br.cefops.cefopsBD.Services.Loja;

import com.br.cefops.cefopsBD.converter.DozerConvert;
import com.br.cefops.cefopsBD.data.vo.v1.loja.ItensLojaVo;
import com.br.cefops.cefopsBD.domain.escola.Loja.ItensLoja;
import com.br.cefops.cefopsBD.repository.Loja.IntensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItensServices {

    private IntensRepository _repository;

    public ItensServices(IntensRepository repository) {
        _repository = repository;
    }

    public ResponseEntity<ItensLojaVo> createNewIten(ItensLojaVo data) {
        ItensLoja converted = DozerConvert.parseObject(data, ItensLoja.class);
        _repository.save(converted);
        return ResponseEntity.status(HttpStatus.CREATED).body(data);

    }

    public ResponseEntity<List<ItensLojaVo>> getAllItems() {
        List<ItensLoja> data = _repository.findAll();
        List<ItensLojaVo> converted = DozerConvert.parseListObjects(data, ItensLojaVo.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(converted);

    }

}
