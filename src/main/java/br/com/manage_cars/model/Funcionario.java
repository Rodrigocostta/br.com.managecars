package br.com.manage_cars.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
public class Funcionario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_funcionario;
	private String cargo;
	private  Double salario; 
	
	
	
	@ManyToOne
	@JoinColumn( name = "usuario_id")
	 private Usuario usuario;



	public Long getId_funcionario() {
		return id_funcionario;
	}



	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public Double getSalario() {
		return salario;
	}



	public void setSalario(Double salario) {
		this.salario = salario;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
