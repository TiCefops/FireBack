package com.br.cefops.cefopsBD.domain.Financias;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Data
@Table(name = "finança_interna")
public class FinanceInterna  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String Descricao;
	private double Valor;
	private Boolean Pago;
	private Date DataVencimento;
	private Date DataPagamento;
	private int Parcelas;
	private int parcelaAtual;
	@Column(name = "unidade")
	private String unidade;
	@Column(name = "meios_pagamento")
	private String meioPagamento;
	@Column(name = "valor_pago")
	private Double valorPago;
	private String status;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date datadeCriacao;
	private String tipoMovimentacao;

//	@ManyToOne
//	@JoinColumn(name = "fluxo_id")
//	private FluxoCaixa fluxo;



}
