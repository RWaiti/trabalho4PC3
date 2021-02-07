package br.com.pc3.trabalho4.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pc3.trabalho4.domain.Empregado;
import br.com.pc3.trabalho4.service.EmpregadoService;

@RestController
@RequestMapping("/api/v1/trabalho4")
public class EmpregadoResource {
	@Autowired
	private EmpregadoService empregadoService;
	
	@PostMapping
	public Empregado save(Empregado empregado) {
		return empregadoService.save(empregado);
	}

}