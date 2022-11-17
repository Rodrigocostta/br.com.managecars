package br.com.manage_cars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_funcionario;
	private String cargo;
	private double salario;

	@ManyToAny(metaColumn = @Column)
	private Pessoa fk_pessoa_funcionario;

	@ManyToAny(metaColumn = @Column)
	private Contato fk_contato_funcionario;

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Pessoa getFk_pessoa_funcionario() {
		return fk_pessoa_funcionario;
	}

	public void setFk_pessoa_funcionario(Pessoa fk_pessoa_funcionario) {
		this.fk_pessoa_funcionario = fk_pessoa_funcionario;
	}

	public Contato getFk_contato_funcionario() {
		return fk_contato_funcionario;
	}

	public void setFk_contato_funcionario(Contato fk_contato_funcionario) {
		this.fk_contato_funcionario = fk_contato_funcionario;
	}
	
	

}