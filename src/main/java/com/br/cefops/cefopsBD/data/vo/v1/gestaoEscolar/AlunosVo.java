package com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dozermapper.core.Mapping;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonPropertyOrder({ "id", "name", "lastName","cpf","dataNanscimento","email","teleFone","teleFoneCelular" ,"photo","enabled","requerimentos","endereco","documentos"})
@Data
public class AlunosVo extends RepresentationModel<AlunosVo> implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	
	@Mapping("Id")
	@JsonProperty("id")
	private String key;
	private String Name;
	private	Date dataNanscimento;
	private	String LastName;
	private	String Nacionalidade;
	private	String Email;
	private	String genero;
	private	String estadoCivil;
	private	String TeleFoneCelular;
	private	String TeleFone;
	private	Boolean enabled;
	private	String photo;



}
