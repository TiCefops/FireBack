package com.br.cefops.cefopsBD.domain.escola.Documentos;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import lombok.Data;

@Entity
@Data
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(columnDefinition = "char(8)")
	private String cep;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	@Column(columnDefinition = "char(2)")
	private String uf;
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "aluno_id")
	private AlunosData aluno;

}
