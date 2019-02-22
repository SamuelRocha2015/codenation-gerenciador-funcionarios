package br.com.codenation.gerenciador.repositories;

import br.com.codenation.gerenciador.models.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

}
