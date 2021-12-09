package com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.Curso;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import com.br.cefops.cefopsBD.domain.escola.Curso.DisciplinasData;
import lombok.Data;

import java.util.List;

@Data
public class cursoVo {
    private Integer Id;
    private String Name;
    private boolean isOnline;
    private List<AlunosData> aluno;
    private List <DisciplinasData> disciplinas;
}
