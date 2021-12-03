package com.br.cefops.cefopsBD.domain.escola.Requerimentos;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class TiposRequerimentos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String grupo;
	private Integer diasPentregar;
	@Column(columnDefinition = "double(5,2) default 0.00")
	private double valor;
	@Column(nullable = false,columnDefinition = "varchar(200) default 'https://escolaalmeidasantos.com.br/#cursos'")
	private String linkpagamento;
	
	
	
	
	
}
