package br.com.pc3.trabalho4.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Trabalho4Resource {	
	@GetMapping("/cursos/modalidade/{modalidade}")
	public String findCursoByModalidade(@PathVariable("modalidade") String
	modalidade) {
	return "Lista de cursos: "+modalidade;
	}

	@PostMapping("/login")
	public String login(@RequestParam("login") String login,
	@RequestParam("senha") String senha) {
	return "Login: "+login+", Senha: "+senha;
	}

	@PutMapping()
	public String put() {
		return "Método PUT sendo chamado";
	}

	@DeleteMapping()
	public String delete() {
		return "Método DELETE sendo chamado";
	}
}
