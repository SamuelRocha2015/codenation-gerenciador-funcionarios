package br.com.codenation.gerenciador.dao.repositories;

import br.com.codenation.gerenciador.domain.mongo.Departamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartamentoRepository extends MongoRepository<Departamento, String> {
}
