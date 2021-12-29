package com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.hateoas.RepresentationModel;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import com.br.cefops.cefopsBD.domain.escola.Requerimentos.TiposRequerimentos;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.dozermapper.core.Mapping;

import javax.persistence.*;

@Data
@JsonPropertyOrder({ "id","tipo","Status","AbertoEm","requerimento","Responsavel","Entregue","Concluido"})
public class RequerimentoVo  implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	private long id;
	private Date Entregue;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private AlunosData aluno;
	private String nomeAluno;
	private String idaluno;
	private Boolean Concluido;
	private String Status;
	private String Responsavel;
	private TiposRequerimentos tipo;
	private Date Abertoem;
	private Date dataatualizacao;
	private String statusPagameto;
	private String observacao;
	private String protocolo;
	private String pdfLink;



}
