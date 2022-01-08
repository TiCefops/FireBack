package com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import javax.persistence.OneToOne;
import java.util.Date;
@Data
public class DocumentosVo {

    private Long id;
    private String cpf;
    private String rg;
    private Date dataemissaorg;
    private String orgaoemissorrg;
    private String estadoemissorrg;
    private String tituloeleitor;
    private String zona;
    private String secao;
    private Date dataemissaotitulo;
    private String estadoemissortitulo;
    private String nomedamae;
    private String nomedopai;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private AlunosData alunosId;

}
