package com.br.cefops.cefopsBD.data.vo.v1.loja;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class ItensLojaVo {
    private Long id;
    private String nome;
    private String categoria;
    private double quantidade;
    private double valor;
    private double descontode;
    private boolean ativo;

}
