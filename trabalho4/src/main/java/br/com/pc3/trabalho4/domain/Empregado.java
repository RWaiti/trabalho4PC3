package br.com.pc3.trabalho4.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empregado")
public class Empregado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "cpf")
	private Integer cpf;
	@Column(name = "nome")
	private String nome;
	@Column(name = "salario")
	private Double salario;

	@OneToMany (mappedBy="empregado",targetEntity=Dependente.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Dependente> dependente;
	
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