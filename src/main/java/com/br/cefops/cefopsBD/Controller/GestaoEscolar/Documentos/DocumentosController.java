package com.br.cefops.cefopsBD.Controller.GestaoEscolar.Documentos;

import com.br.cefops.cefopsBD.Services.escola.DocumentosService;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.AlunosVo;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.DocumentosVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Controle de Documentos", description = "Responsavel por controlar os get de Documentos")
@RestController
@RequestMapping("/api/v1/documentos")
public class DocumentosController {
    @Autowired
    DocumentosService service;

    @GetMapping(value = "/{id}")
    public DocumentosVo buscarPorID(@PathVariable("id") String id) {
        return service.buscarDocumentos(id);
    }

    @PostMapping()
    public ResponseEntity<DocumentosVo> novoAluno(@RequestBody DocumentosVo documentosVo) {
        System.out.println(documentosVo);
        return service.novoDocumento(documentosVo);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<DocumentosVo> attDocumento(
            @RequestBody DocumentosVo documentosVo) {
        System.out.println(documentosVo);
        return service.attDocumento(documentosVo);
    }

}
