package br.com.manage_cars.model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	private  Long id_pessoa;
	private Long cpf;
	private String nome;
	
	private int idade;
	
	
	public Long getId_pessoa() {
		return id_pessoa;
	}
	public void setId_pessoa(Long id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	

}
