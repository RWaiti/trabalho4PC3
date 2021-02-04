package br.com.pc3.trabalho4.repository;

import br.com.pc3.trabalho4.domain.Empregado;
import org.springframework.data.repository.CrudRepository;

public interface EmpregadoRepository extends CrudRepository<Empregado, Integer>{
	
}
