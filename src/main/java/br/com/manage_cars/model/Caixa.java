package br.com.manage_cars.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Caixa {

	
@Id
private int id_caixa;
private double gasto_dia;
private double faturamento;
public int getId_caixa() {
	return id_caixa;
}
public void setId_caixa(int id_caixa) {
	this.id_caixa = id_caixa;
}
public double getGasto_dia() {
	return gasto_dia;
}
public void setGasto_dia(double gasto_dia) {
	this.gasto_dia = gasto_dia;
}
public double getFaturamento() {
	return faturamento;
}
public void setFaturamento(double faturamento) {
	this.faturamento = faturamento;
}









}
