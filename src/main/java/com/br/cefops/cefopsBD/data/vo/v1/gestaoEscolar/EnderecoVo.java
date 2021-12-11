package com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
@Data
public class EnderecoVo  implements Serializable {
	
	private static final long serialVersionUID = 6940227609742292518L;
	private Long id;
	private String cep;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	public String uf;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private AlunosData aluno;



	
}
