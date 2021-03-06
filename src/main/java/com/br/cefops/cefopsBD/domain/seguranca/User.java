package com.br.cefops.cefopsBD.domain.seguranca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;


@Entity
@Data
@Table(name = "users")
public class User implements UserDetails, Serializable  {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@OneToOne
	@JoinColumn(name="Aluno_ID")
	private AlunosData alunos;
	@Column(name = "user_name", unique = true)
	private String userName;
	@Column(name = "frist_name")
	private String fristName;
	@Column(name = "last_name")
	private String LastName;
	@Column(name = "email")
	private String email;
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "account_non_expired",columnDefinition ="tinyint(1) default 1")
	private Boolean accountNonExpired;
	
	@Column(name = "account_non_locked",columnDefinition ="tinyint(1) default 1")
	private Boolean accountNonLocked;
	
	@Column(name = "credentials_non_expired",columnDefinition ="tinyint(1) default 1")
	private Boolean credentialsNonExpired;
	
	@Column(name = "enabled",columnDefinition ="tinyint(1) default 1")
	private Boolean enabled;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_permission", joinColumns = { @JoinColumn (name = "id_user") },
			inverseJoinColumns = { @JoinColumn (name = "id_permission")})
	private List<Permission> permissions;
	
	public List<String> getRoles() {
		List<String> roles = new ArrayList<>();
		for (Permission permission : this.permissions) {
			roles.add(permission.getDescription());
		}
		return roles;
	}

	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.permissions;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	@Override
	public int hashCode() {
		return Objects.hash(LastName, accountNonExpired, accountNonLocked, alunos, cpf, credentialsNonExpired, email,
				enabled, fristName, id, password, permissions, userName);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(LastName, other.LastName) && Objects.equals(accountNonExpired, other.accountNonExpired)
				&& Objects.equals(accountNonLocked, other.accountNonLocked) && Objects.equals(alunos, other.alunos)
				&& Objects.equals(cpf, other.cpf) && Objects.equals(credentialsNonExpired, other.credentialsNonExpired)
				&& Objects.equals(email, other.email) && Objects.equals(enabled, other.enabled)
				&& Objects.equals(fristName, other.fristName) && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password) && Objects.equals(permissions, other.permissions)
				&& Objects.equals(userName, other.userName);
	}







}
