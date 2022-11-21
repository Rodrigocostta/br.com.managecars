package br.com.manage_cars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Contato {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_contato;
	private Long telefone;
	private String email;
	
	@ManyToOne
	@JoinColumn( name = "pessoa_id")
	private Pessoa pessoa;

	public Long getId_contato() {
		return id_contato;
	}

	public void setId_contato(Long id_contato) {
		this.id_contato = id_contato;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	

}
