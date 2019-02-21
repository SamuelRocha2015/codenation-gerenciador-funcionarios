package br.com.codenation.gerenciador.repositories;

import br.com.codenation.gerenciador.models.Cargo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CargoRepository extends MongoRepository<Cargo, String> {
}
