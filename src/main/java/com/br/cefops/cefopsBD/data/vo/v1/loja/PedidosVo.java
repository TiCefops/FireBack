package com.br.cefops.cefopsBD.data.vo.v1.loja;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import com.br.cefops.cefopsBD.domain.escola.Loja.ItensLoja;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@EqualsAndHashCode
public class PedidosVo {
    private Long id;
    private String idTransicao;
    private String codigoTrasicao;
    private List<ItensLoja> itens;
    private AlunosData alunoId;
    private Boolean vencido;
    private Date dataPagamento;
    private Date dataRequisicao;
    private  Date dataVencimento;
    private  int statusPagamento;
    private  int tipoPagamento;
    private  Double valor;
    private  Double valorTotal;
    private  Double desconto;
    private  Double valorTotalComDesconto;
    private  Double valorPago;
}
