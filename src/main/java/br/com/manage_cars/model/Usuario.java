package br.com.manage_cars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Usuario {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_usuario;
private String usuario;

@ManyToAny(metaColumn = @Column)
private Funcionario fk_funcionario;

@ManyToAny(metaColumn = @Column)
private Produto fk_produto;

@ManyToAny(metaColumn = @Column)
private Servico fk_servico;

@ManyToOne
private Caixa kf_caixa ;

public int getId_usuario() {
	return id_usuario;
}

public void setId_usuario(int id_usuario) {
	this.id_usuario = id_usuario;
}

public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public Funcionario getFk_funcionario() {
	return fk_funcionario;
}

public void setFk_funcionario(Funcionario fk_funcionario) {
	this.fk_funcionario = fk_funcionario;
}

public Produto getFk_produto() {
	return fk_produto;
}

public void setFk_produto(Produto fk_produto) {
	this.fk_produto = fk_produto;
}

public Servico getFk_servico() {
	return fk_servico;
}

public void setFk_servico(Servico fk_servico) {
	this.fk_servico = fk_servico;
}

public Caixa getKf_caixa() {
	return kf_caixa;
}

public void setKf_caixa(Caixa kf_caixa) {
	this.kf_caixa = kf_caixa;
}



}
