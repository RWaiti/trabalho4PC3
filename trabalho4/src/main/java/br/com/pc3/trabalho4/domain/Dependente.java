package br.com.pc3.trabalho4.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dependente")
public class Dependente { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "cpfDependente")
	private Integer cpfDependente;
	@Column(name = "nome")
	private String nome;
	@Column(name = "grauParentesco")
	private String grauParentesco;
	@Column(name = "dataNascimento")
	private String dataNascimento;
	
	@ManyToOne @JoinColumn(name="cpf")
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


}