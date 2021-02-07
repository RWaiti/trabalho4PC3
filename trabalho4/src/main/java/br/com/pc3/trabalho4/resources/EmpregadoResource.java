package br.com.pc3.trabalho4.resources;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.pc3.trabalho4.domain.Empregado;
import br.com.pc3.trabalho4.service.EmpregadoService;

@RestController
@RequestMapping("/api/v1/trabalho4")
public class EmpregadoResource {
	@GetMapping()
	public List<Empregado> get() {
	EmpregadoService empregadoService = new EmpregadoService();
	return empregadoService.ListarTodos();
	}
}