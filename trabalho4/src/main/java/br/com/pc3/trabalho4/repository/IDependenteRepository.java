package br.com.pc3.trabalho4.repository;

import java.util.List;
import br.com.pc3.trabalho4.domain.Dependente;


public interface IDependenteRepository {
	public void incluir(Dependente dependente);
	public void alterar(Dependente dependente);
	public void excluir(Dependente dependente);
	public List<Dependente> listarTodos();
	public Dependente buscaPeloCpfDependente(Integer cpfDependente);
}
