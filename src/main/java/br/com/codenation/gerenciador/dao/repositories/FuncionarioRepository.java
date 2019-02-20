package br.com.codenation.gerenciador.dao.repositories;

import br.com.codenation.gerenciador.domain.mongo.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
}
