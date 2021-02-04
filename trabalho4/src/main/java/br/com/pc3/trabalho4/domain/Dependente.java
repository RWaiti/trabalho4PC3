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
	private Empregado empregado;
	
	public Dependente() {
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

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

}