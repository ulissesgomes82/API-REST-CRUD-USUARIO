package com.ulisses.myapi.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "O campo NOME é mandatório")
	@Length(min = 3, max = 100, message = "O NOME deve ter entre 3 e 100 caractere")
	private String name;

	@NotEmpty(message = "O campo LOGIN é mandatório")
	@Length(min = 3, max = 100, message = "O LOGIN deve ter entre 3 e 100 caractere")
	private String login;

	@NotEmpty(message = "O campo SENHA é mandatório")
	@Length(min = 3, max = 100, message = "O SENHA deve ter entre 3 e 100 caractere")
	private String senha;

	public Usuario() {
		super();
	}

	public Usuario(Long id, String name, String login, String senha) {
		super();
		this.id = id;
		this.name = name;
		this.login = login;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}

}
