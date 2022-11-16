package br.com.manage_cars.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contato {
	
	@Id
	private int id_contato;
	private int telefone;
	private String email;
	public int getId_contato() {
		return id_contato;
	}
	public void setId_contato(int id_contato) {
		this.id_contato = id_contato;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
