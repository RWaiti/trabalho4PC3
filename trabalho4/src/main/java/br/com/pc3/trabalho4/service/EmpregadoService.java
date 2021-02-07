package br.com.pc3.trabalho4.service;

import java.util.List;
import br.com.pc3.trabalho4.domain.Empregado;
import br.com.pc3.trabalho4.repository.EmpregadoRepository;

public class EmpregadoService {
	public List<Empregado> ListarTodos(){
		EmpregadoRepository empregadoRepository = new EmpregadoRepository();
		return empregadoRepository.listarTodos();
	}
}