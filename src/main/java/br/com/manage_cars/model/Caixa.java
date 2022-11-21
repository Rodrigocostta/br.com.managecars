package br.com.manage_cars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Caixa {
	
	@Id
	@GeneratedValue( strategy =  GenerationType.IDENTITY)
	private Long caixa;
	private Double gasto_dia;
	private  Double faturamento;
	
	
	
	
	@OneToOne
	@JoinColumn( name = "usuario_id")
	private Usuario usuario;




	public Long getCaixa() {
		return caixa;
	}




	public void setCaixa(Long caixa) {
		this.caixa = caixa;
	}




	public Double getGasto_dia() {
		return gasto_dia;
	}




	public void setGasto_dia(Double gasto_dia) {
		this.gasto_dia = gasto_dia;
	}




	public Double getFaturamento() {
		return faturamento;
	}




	public void setFaturamento(Double faturamento) {
		this.faturamento = faturamento;
	}




	public Usuario getUsuario() {
		return usuario;
	}




	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	
	
}
