package br.com.pc3.trabalho4.repository;

import java.util.ArrayList;
import java.util.List;
import br.com.pc3.trabalho4.domain.Dependente;
import br.com.pc3.trabalho4.domain.Empregado;

public class EmpregadoRepository implements IEmpregadoRepository{
	@Override
	public void incluir(Empregado empregado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Empregado empregado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Empregado empregado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empregado> listarTodos() {
		List<Empregado> empregado = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			List<Dependente> dependente = new ArrayList<>();
			String filho1 = "Pedrinho Victozinho" + i;
			String filho2 = "Rogerim" + i;
			String pai = "PEdro Victor" + i;
			dependente.add(new Dependente(1234560+i, filho1, "filho", "01/01/2021"));
			dependente.add(new Dependente(6543210+i, filho2, "filho", "01/01/2021"));
			empregado.add(new Empregado(1230+i, pai, 11000.0,dependente));
		}

		return empregado;
	}

	@Override
	public Empregado buscarPeloCpf(Integer cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
