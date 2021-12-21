package com.br.cefops.cefopsBD.Controller.GestaoEscolar;
import java.util.List;
import java.util.Optional;

import com.br.cefops.cefopsBD.Services.escola.CursoService;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.Curso.cursoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.br.cefops.cefopsBD.domain.escola.Curso.CursoData;
import com.br.cefops.cefopsBD.repository.GestaoEscolar.CursoRepository;

@RestController
@RequestMapping("/api/v1/cursos")
public class CursoController {
	
	@Autowired
	CursoRepository cursointerface;
	@Autowired
	CursoService service;
	

	@PostMapping(consumes = "application/json")
	public cursoVo criarCurso(@RequestBody cursoVo curso) {
		return service.novoCurso(curso);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> obterCursoId(@PathVariable Integer id) {
		Optional<CursoData> optCurso = cursointerface.findById(id);
		if (optCurso.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(optCurso.get());
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}

	@DeleteMapping(value = "/cursos/{id}")
	public ResponseEntity<?> eliminarCurso(@PathVariable Integer id) {
		Optional<CursoData> optCurso = cursointerface.findById(id);
		if (!optCurso.isPresent()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		cursointerface.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body(optCurso.get());
	}

	@ResponseBody
	@PutMapping(value = "/{id}")
	public cursoVo alterarCursos(@PathVariable Integer id, @RequestBody cursoVo curso) {

		return service.novoCurso(curso);
		
		
	}

	@GetMapping()
	public List<cursoVo> obterCursos() {
		return  service.buscarTodos();
	}

}
