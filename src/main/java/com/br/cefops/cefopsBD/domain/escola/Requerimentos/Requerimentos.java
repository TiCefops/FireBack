package com.br.cefops.cefopsBD.domain.escola.Requerimentos;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import com.github.dozermapper.core.Mapping;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Data
public class Requerimentos implements Serializable {

	private static final long serialVersionUID = -5249726956644179526L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    @Temporal(TemporalType.DATE)
	@Column(columnDefinition ="date default '2021-12-01'"  )
	private Date Entregue;
	@ManyToOne()
	@JoinColumn(name = "aluno_id")
	private AlunosData aluno;
	@JoinColumn(name = "nome_Aluno")
	private String nomeAluno;
	private String idaluno;
	@Column(columnDefinition = "tinyint(1) default 0" )
	private Boolean Concluido;
	@Column(columnDefinition = "varchar(20) default 'Aberto'")
	private String Status;
	@Column(columnDefinition = "varchar(255) default 'ND'")
	private String Responsavel;
	@ManyToOne()
	@JoinColumn(name = "tiporequerimento_id")
	private TiposRequerimentos tipo;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private Date Abertoem;
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataatualizacao;
	@Column(columnDefinition = "varchar(50) default 'Aguardando'")
	private String statusPagameto;
	private String observacao;
	@Column(columnDefinition = "varchar(20)")
	private String protocolo;
	private String pdfLink;



}
