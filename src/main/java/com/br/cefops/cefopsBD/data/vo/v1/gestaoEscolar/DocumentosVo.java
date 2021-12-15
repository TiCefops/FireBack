package com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;



import java.util.Date;
@Data
public class DocumentosVo {

    private Long id;
    private String cpf;
    private String rg;
    private Date dataemissao;
    private String orgaoemissor;
    private String estadoemissor;
    private String tituloeleitor;
    private String zona;
    private String secao;
    private Date dataemissaotitulo;
    private String estemissortitulo;
    @JsonIgnore
    private String reservista;
    @JsonIgnore
    private String categoriamilitar;
    @JsonIgnore
    private String circoinscricaomitlitar;
    private String regiaomilitar;
    @JsonIgnore
    private Date dataemissaoreservista;
    @JsonIgnore
    private String orgaoemissorreservista;
    @JsonIgnore
    private String situacaomilitar;
    private String nomedamae;
    private String nomedopai;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private AlunosData alunosId;

}
