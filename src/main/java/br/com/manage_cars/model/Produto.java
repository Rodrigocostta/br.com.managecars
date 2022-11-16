package br.com.manage_cars.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	
	
	@Id
	private int id_produto;
	private String descricao;
	private double preco;
	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
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
