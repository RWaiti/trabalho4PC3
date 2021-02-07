package br.com.pc3.trabalho4.service;


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
}