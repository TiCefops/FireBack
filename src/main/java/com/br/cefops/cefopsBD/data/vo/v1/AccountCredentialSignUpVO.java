package com.br.cefops.cefopsBD.data.vo.v1;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
public class AccountCredentialSignUpVO  implements Serializable{
private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String email;
	private String fristName;
	private String lastName;
	private String cpf;
	private AlunosData aluno;

}

	
		
	

	
	

