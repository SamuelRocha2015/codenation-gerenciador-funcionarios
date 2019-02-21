package br.com.codenation.gerenciador.repositories;

import br.com.codenation.gerenciador.models.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
    List<Funcionario> findByNome(String nome);
    List<Funcionario> findByCargoId(String id);
    List<Funcionario> findByDataEntradaAndDataSaida(LocalDate entrada, LocalDate saida);
    List<Funcionario> findByDataEntrada(LocalDate entrada);
    List<Funcionario> findByDataSaida(LocalDate saida);

}
