package com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import com.br.cefops.cefopsBD.domain.escola.Curso.AtividadesData;
import com.br.cefops.cefopsBD.domain.escola.Curso.DisciplinasData;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
public class NotasVo {
    private Long Id;
    private Double nota;
    private AtividadesData atividade;
    @Setter
    private AlunosData alunoId;
    private Date dataNota;
    private DisciplinasData disciplinaId;
}
