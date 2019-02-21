package br.com.codenation.gerenciador.repositories;

import br.com.codenation.gerenciador.domain.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}