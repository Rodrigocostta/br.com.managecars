package br.com.manage_cars.model;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_servico;
	private Long odomentro;
	private String opcional;
	private Timestamp data;

	@ManyToOne
	@JoinColumn(name = " cliente_id")
	private Cliente cliente;

	public Long getId_servico() {
		return id_servico;
	}

	public void setId_servico(Long id_servico) {
		this.id_servico = id_servico;
	}

	public Long getOdomentro() {
		return odomentro;
	}

	public void setOdomentro(Long odomentro) {
		this.odomentro = odomentro;
	}

	public String getOpcional() {
		return opcional;
	}

	public void setOpcional(String opcional) {
		this.opcional = opcional;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
