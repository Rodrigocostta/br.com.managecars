package br.com.manage_cars.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_servico;

	private int odomentro;
	private Timestamp data_de_servico;

	@ManyToAny(metaColumn = @Column)
	private Cliente fk_cliente;

	@ManyToAny(metaColumn = @Column)
	private Tipo_servico fk_tipo_servico;

	@ManyToAny(metaColumn = @Column)
	private Veiculo fk_veiculo;

	public int getId_servico() {
		return id_servico;
	}

	public void setId_servico(int id_servico) {
		this.id_servico = id_servico;
	}

	public int getOdomentro() {
		return odomentro;
	}

	public void setOdomentro(int odomentro) {
		this.odomentro = odomentro;
	}

	public Timestamp getData_de_servico() {
		return data_de_servico;
	}

	public void setData_de_servico(Timestamp data_de_servico) {
		this.data_de_servico = data_de_servico;
	}

	public Cliente getFk_cliente() {
		return fk_cliente;
	}

	public void setFk_cliente(Cliente fk_cliente) {
		this.fk_cliente = fk_cliente;
	}

	public Tipo_servico getFk_tipo_servico() {
		return fk_tipo_servico;
	}

	public void setFk_tipo_servico(Tipo_servico fk_tipo_servico) {
		this.fk_tipo_servico = fk_tipo_servico;
	}

	public Veiculo getFk_veiculo() {
		return fk_veiculo;
	}

	public void setFk_veiculo(Veiculo fk_veiculo) {
		this.fk_veiculo = fk_veiculo;
	}

}
