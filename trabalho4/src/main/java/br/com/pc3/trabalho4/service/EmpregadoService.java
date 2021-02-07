package br.com.pc3.trabalho4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pc3.trabalho4.domain.Empregado;
import br.com.pc3.trabalho4.repository.EmpregadoRepository;

@Service
public class EmpregadoService {
	@Autowired
	private EmpregadoRepository empregadoRepository;

	public Empregado save(Empregado empregado) {
		return empregadoRepository.save(empregado);
	}

	public List<Empregado> findAll() {
		return (List<Empregado>) empregadoRepository.findAll();
	}

	public Optional<Empregado> findById(Long id) {
		return empregadoRepository.findById(id);
	}

	public Empregado update(Empregado empregado) {
		return empregadoRepository.save(empregado);
	}

	public void deleteById(Long id) {
		empregadoRepository.deleteById(id);
	}

//	public List<Empregado> findByCpf(Integer cpf) {
//		return (List<Empregado>) empregadoRepository.findByCpf(cpf);
//	}
}