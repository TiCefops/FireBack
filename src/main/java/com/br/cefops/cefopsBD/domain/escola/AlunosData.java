package com.br.cefops.cefopsBD.domain.escola;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import com.br.cefops.cefopsBD.domain.escola.Curso.CursoData;
import com.br.cefops.cefopsBD.domain.escola.Documentos.Endereco;
import com.br.cefops.cefopsBD.domain.escola.Requerimentos.Requerimentos;
import com.br.cefops.cefopsBD.domain.seguranca.User;
import com.br.cefops.cefopsBD.domain.escola.Documentos.DocumentosData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "alunos")
@Data
public class AlunosData implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	@Id 
	private String Id;
	private String name;
	@Column(columnDefinition = "DATE()")
	private Date dataNanscimento;
	private String LastName;
	private	String Nacionalidade;
	private String Email;
	private String genero;
	private  String cpf;
	private String estadoCivil;
	@Column(columnDefinition = "char(11)")
	private	String TeleFoneCelular;
	@Column(columnDefinition = "char(10)")
	private	String TeleFone;
	@Column(nullable = false, columnDefinition ="tinyint(1) default 1"  )
	private	Boolean enabled;
	@Column(name = "foto_usuario", nullable = true, columnDefinition="varchar(200) default 'https://media.istockphoto.com/photos/astronaut-lying-in-the-meadow-picture-id1304263738?s=612x612'")
	private	String photo;
	@OneToOne(cascade = CascadeType.REMOVE)
	private Endereco endereco;
	@OneToMany(mappedBy = "aluno")
	@Getter(AccessLevel.NONE)
	@JsonIgnore
	private List<Requerimentos>  requerimentos;
	@JsonIgnore
	@OneToOne(mappedBy = "alunos")
	private User user;
	@ManyToMany(mappedBy = "aluno",cascade = CascadeType.REMOVE)
	@Getter(AccessLevel.NONE)
	@JsonIgnore
	private List<CursoData> cursosId;
	@OneToOne(mappedBy = "alunosId",cascade = CascadeType.REMOVE)
	private DocumentosData documentos;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	private Date datacadastro;

}
