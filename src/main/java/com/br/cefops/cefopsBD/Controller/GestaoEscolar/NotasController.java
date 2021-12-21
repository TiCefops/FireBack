package com.br.cefops.cefopsBD.Controller.GestaoEscolar;

import com.br.cefops.cefopsBD.Services.escola.NotasServices;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.NotasVo;
import com.br.cefops.cefopsBD.domain.escola.Curso.NotasAlunosData;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Endpoint Notas",description = "EndPoint Responsavel Por Controlar A notas dos Alunos")
@RequestMapping("/api/v1/notas")
public class NotasController {
    @Autowired
    NotasServices service;


    @GetMapping(value = "/{id}")
    public ResponseEntity<List<NotasVo>> obterNotasId(@PathVariable("id") String id) {
        List<NotasVo> notas=service.EncontrarNotasPorID(id);
            if (!notas.isEmpty()){
                return ResponseEntity.ok().body(notas);
            }
            return ResponseEntity.badRequest().build();
        }
        @PutMapping(value = "/id")
        public NotasVo alterarNota(@PathVariable String id, @RequestBody NotasVo nota) {
            NotasVo notas =service.SetarNota(nota);
            return notas;

        }
    @PostMapping(consumes = "application/json")
    public NotasVo novaNota(@RequestBody NotasVo nota) {

        return service.SetarNota(nota);
    }
}
