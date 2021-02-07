package br.com.pc3.trabalho4.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empregado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cpf;
	private String nome;
	private Double salario;
	private List<Dependente> dependente;

	public Empregado(Integer cpf, String nome, Double salario, List<Dependente> dependente) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.dependente = dependente;
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

	public List<Dependente> getDependente() {
		return dependente;
	}

	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}
}