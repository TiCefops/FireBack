package com.br.cefops.cefopsBD.data.vo.v1;

import com.br.cefops.cefopsBD.domain.Financias.FluxoCaixa;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class FinancesInternaVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String Descricao;
	private double Valor;
	private Boolean Pago;
	private Date DataVencimento;
	private Date DataPagamento;
	private int Parcelas;
	private int parcelaAtual;
	private String unidade;
	private String meioPagamento;
	private Double valorPago;
	private String status;
	private Date datadeCriacao;
	private String tipoMovimentacao;
//	private FluxoCaixa fluxo;

}
