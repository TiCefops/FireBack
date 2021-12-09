package com.br.cefops.cefopsBD.Controller.GestaoEscolar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.br.cefops.cefopsBD.Services.escola.RequerimentoService;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.RequerimentoVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Requerimetos Controle",description = "Responsavel por controlar todoas as requisições de requerimentos")
@RestController
@RequestMapping("/api/v1/requerimetos")
public class RequerimentosController {

	@Autowired
	RequerimentoService service;

	@ResponseBody
	@PostMapping
	public ResponseEntity<RequerimentoVo> novoRequerimento(@RequestBody RequerimentoVo requerimento) {
System.out.println(requerimento);
		service.novoRequerimento(requerimento);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping(value = "/aluno/{id}")
	public ResponseEntity<List<RequerimentoVo>> obterRequerimetosAlunoid(@PathVariable String id) {
		 List<RequerimentoVo> optRequerimento = service.buscarPorIdAluno(id);

		if (optRequerimento.equals(null)) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(optRequerimento);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<RequerimentoVo> obterRequerimetosId(@PathVariable Long id) {
		RequerimentoVo optRequerimento = service.buscarRequerimentoId(id);

		if (optRequerimento.equals(null)) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(optRequerimento);
	}
	@GetMapping()
	public ResponseEntity<List<RequerimentoVo>> obterTodosRequerimentos() {
		List<RequerimentoVo> requerimentos = service.buscarTodosRequerimentos();
		Map<String,List<RequerimentoVo>>  model= new HashMap();


		return ResponseEntity.ok(requerimentos);
	}
    @PatchMapping
	public ResponseEntity<HttpStatus> SetResponsavel(
			@RequestParam(value = "id") Long id,
			@RequestParam(value = "responsavel") String responsavel,
			@RequestParam (value = "status") String status){
		service.setResponsavel(id,responsavel,status);


		return ResponseEntity.ok().build();
	}
	@PatchMapping(value = "/status")
	public ResponseEntity<HttpStatus> SetStatus(
			@RequestParam(value = "id") Long id,
			@RequestParam (value = "status") String status){
		service.setStatus(id,status);


		return ResponseEntity.ok().build();
	}


	@PutMapping(value = "/{id}")
	public ResponseEntity<RequerimentoVo> alterarReqerimento(@PathVariable Long id, @RequestBody RequerimentoVo req) {
		 RequerimentoVo requerimentoVo=service.buscarRequerimentoId(id);
		if (requerimentoVo.equals(null)){
			ResponseEntity.notFound();
		}
		var alterado=service.alterarRequerimento(req);
		return ResponseEntity.ok(alterado);
		
	}
	
		
}
