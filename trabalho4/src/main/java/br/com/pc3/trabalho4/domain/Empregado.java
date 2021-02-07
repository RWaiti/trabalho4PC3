package br.com.pc3.trabalho4.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empregado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer cpf;
	private String nome;
	private Double salario;
	//private Dependente dependente;

	public Empregado() {
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

//	public Dependente getDependente() {
//		return dependente;
//	}
//
//	public void setDependente(Dependente dependente) {
//		this.dependente = dependente;
//	}


}