package br.com.pc3.trabalho4.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.pc3.trabalho4.domain.Empregado;

@Repository
public interface EmpregadoRepository extends CrudRepository<Empregado, Integer>{
	
}
