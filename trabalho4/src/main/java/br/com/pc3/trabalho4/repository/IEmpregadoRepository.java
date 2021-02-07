package br.com.pc3.trabalho4.repository;

import java.util.List;
import br.com.pc3.trabalho4.domain.Empregado;

public interface IEmpregadoRepository {
	public void incluir(Empregado empregado);
	public void alterar(Empregado empregado);
	public void excluir(Empregado empregado);
	public List<Empregado> listarTodos();
	public Empregado buscarPeloCpf(Integer cpf);
}
