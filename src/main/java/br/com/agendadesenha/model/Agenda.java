package br.com.agendadesenha.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "agenda_senha")
public class Agenda implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@NotNull(message = "O campo descricao deve ser preenchido")
	private String descricao;
	@NotNull(message = "O campo username deve ser preenchido")
	private String username;
	@NotNull(message = "O campo password deve ser preenchido")
	private String password;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date data = new Date();
	
	public Agenda() {
		super();
	}

	public Agenda(Long id, String descricao, String username, String password, Date data) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.username = username;
		this.password = password;
		this.data = data;
	}

	public Agenda(String descricao, String username, String password, Date data) {
		super();
		this.descricao = descricao;
		this.username = username;
		this.password = password;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
