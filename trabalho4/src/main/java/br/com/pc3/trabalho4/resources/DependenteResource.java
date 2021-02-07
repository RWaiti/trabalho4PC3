package br.com.pc3.trabalho4.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.pc3.trabalho4.domain.Dependente;
import br.com.pc3.trabalho4.service.DependenteService;

@RestController
@RequestMapping("/api/v1/dependente")
public class DependenteResource {
	@Autowired
	private DependenteService dependenteService;

	@PostMapping
	public Dependente save(@RequestBody Dependente dependente) {
		return dependenteService.save(dependente);
	}

	@GetMapping
	public List<Dependente> findAll() {
		return dependenteService.findAll();
	}

	@GetMapping(path = { "/{id}" })
	public Optional<Dependente> findById(@PathVariable("id") Long id) {
		return dependenteService.findById(id);
	}

	@PutMapping(value = "/{id}")
	public Dependente update(@PathVariable("id") Long id, @RequestBody Dependente dependente) {
		Optional<Dependente> optional = dependenteService.findById(id);
		if (optional.isPresent()) {
			Dependente c = optional.get();
			c.setCpfDependente(dependente.getCpfDependente());
			c.setNome(dependente.getNome());
			c.setGrauParentesco(dependente.getGrauParentesco());
			c.setDataNascimento(dependente.getDataNascimento());
			dependenteService.update(c);
			return c;
		} else {
			throw new RuntimeException("Não foi possível alterar registro");
		}
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") Long id) {
		dependenteService.deleteById(id);
	}
}
