package br.com.manage_cars.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tipo_servico {
	
	
	@Id
	private int id_tipo_servico;
	private String descricao;
	private double preco;
	public int getId_tipo_servico() {
		return id_tipo_servico;
	}
	public void setId_tipo_servico(int id_tipo_servico) {
		this.id_tipo_servico = id_tipo_servico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	

}
