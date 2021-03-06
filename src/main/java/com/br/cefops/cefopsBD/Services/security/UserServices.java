package com.br.cefops.cefopsBD.Services.security;

import com.br.cefops.cefopsBD.domain.Exception.ResourceDuplicateException;
import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.cefops.cefopsBD.converter.UserConverter;
import com.br.cefops.cefopsBD.data.vo.v1.AccountCredentialSignUpVO;
import com.br.cefops.cefopsBD.domain.seguranca.Permission;
import com.br.cefops.cefopsBD.repository.Seguranca.PermissionRepository;
import com.br.cefops.cefopsBD.repository.Seguranca.UserRepository;

import java.util.Arrays;

@Service
public class UserServices  implements UserDetailsService{
	@Autowired
	UserRepository repository;
	@Autowired
	UserConverter converter;
	@Autowired
	PermissionRepository repository2;
	
	public UserServices(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		var user = repository.findByUsername(username);
		if (user != null) {
			return user;
		} else {
			throw new UsernameNotFoundException("Username " + username + " not found");
		}
		
	}

	
	public AccountCredentialSignUpVO saveUser(
			String email,String password,String user, String fristName,String lastName,String cpf,
			AlunosData aluno) {
		AccountCredentialSignUpVO credential= new AccountCredentialSignUpVO();
	var entity= converter.convertVoToEntity(credential);
	Permission permission= repository2.findByName("Aluno");
	
	entity.setEmail(email);
	entity.setPassword(password);
	entity.setFristName(fristName);
	entity.setLastName(lastName);
	entity.setUserName(user);
	entity.setCpf(cpf);
	entity.setAlunos(aluno);
	entity.setAccountNonExpired(true);
	entity.setAccountNonLocked(true);
	entity.setCredentialsNonExpired(true);
	entity.setEnabled(true);
	entity.setPermissions(Arrays.asList(permission));
	System.out.println(entity);



	if (repository.findUserByEmail(email)==null){

		return  converter.converterEntiteToVo(repository.save(entity));

	}
	else {throw new ResourceDuplicateException("Email j?? cadastrado");
	}


	}

}
