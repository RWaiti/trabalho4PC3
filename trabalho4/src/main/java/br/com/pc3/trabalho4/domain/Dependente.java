package br.com.pc3.trabalho4.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dependente { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cpfDependente;
	private String nome;
	private String grauParentesco;
	private String dataNascimento;
	
	

	public Dependente(Integer cpfDependente, String nome, String grauParentesco, String dataNascimento) {
		super();
		this.cpfDependente = cpfDependente;
		this.nome = nome;
		this.grauParentesco = grauParentesco;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String string) {
		this.dataNascimento = string;
	}

	public Integer getCpfDependente() {
		return cpfDependente;
	}

	public void setCpfDependente(Integer cpfDependente) {
		this.cpfDependente = cpfDependente;
	}


}