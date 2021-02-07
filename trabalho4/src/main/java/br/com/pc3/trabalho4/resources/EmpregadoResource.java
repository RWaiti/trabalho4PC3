package br.com.pc3.trabalho4.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Empregado save(@RequestBody Empregado empregado) {
		return empregadoService.save(empregado);
	}

	@GetMapping
	public List<Empregado> findAll() {
		return empregadoService.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Empregado> findById(@PathVariable("id") Long id) {
		return empregadoService.findById(id);
	}

	@PutMapping(value = "/{id}")
	public Empregado update(@PathVariable("id") Long id, @RequestBody Empregado empregado) {
		Optional<Empregado> optional = empregadoService.findById(id);
		if (optional.isPresent()) {
			Empregado c = optional.get();
			c.setCpf(empregado.getCpf());
			c.setNome(empregado.getNome());
			c.setSalario(empregado.getSalario());
			empregadoService.update(c);
			return c;
		} else {
			throw new RuntimeException("Não foi possível alterar registro");
		}
	}
}