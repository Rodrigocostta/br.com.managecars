package br.com.manage_cars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Cliente {
	
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY) 
	private int Id_cliente;
	
	@ManyToAny(metaColumn = @Column)
	private Veiculo fk_veiculo;
	
	@ManyToAny(metaColumn = @Column)
	private Pessoa fk_pessoa_cliente;
	
	@ManyToAny(metaColumn = @Column)
	private Contato fk_contato_cliente;

	public int getId_cliente() {
		return Id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		Id_cliente = id_cliente;
	}

	public Veiculo getFk_veiculo() {
		return fk_veiculo;
	}

	public void setFk_veiculo(Veiculo fk_veiculo) {
		this.fk_veiculo = fk_veiculo;
	}

	public Pessoa getFk_pessoa_cliente() {
		return fk_pessoa_cliente;
	}

	public void setFk_pessoa_cliente(Pessoa fk_pessoa_cliente) {
		this.fk_pessoa_cliente = fk_pessoa_cliente;
	}

	public Contato getFk_contato_cliente() {
		return fk_contato_cliente;
	}

	public void setFk_contato_cliente(Contato fk_contato_cliente) {
		this.fk_contato_cliente = fk_contato_cliente;
	}
	
	

}
