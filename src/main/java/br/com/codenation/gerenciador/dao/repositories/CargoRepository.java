package br.com.codenation.gerenciador.dao.repositories;

import br.com.codenation.gerenciador.domain.mongo.Cargo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CargoRepository extends MongoRepository<Cargo, String> {
}
