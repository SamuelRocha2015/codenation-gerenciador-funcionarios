package br.com.codenation.gerenciador.repositories;

import br.com.codenation.gerenciador.domain.Departamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartamentoRepository extends MongoRepository<Departamento, String> {
}
