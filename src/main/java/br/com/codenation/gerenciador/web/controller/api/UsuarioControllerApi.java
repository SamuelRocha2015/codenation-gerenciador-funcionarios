package br.com.codenation.gerenciador.web.controller.api;

import br.com.codenation.gerenciador.dao.repositories.CargoRepository;
import br.com.codenation.gerenciador.dao.repositories.DepartamentoRepository;
import br.com.codenation.gerenciador.dao.repositories.FuncionarioRepository;
import br.com.codenation.gerenciador.dao.repositories.UsuarioRepository;
import br.com.codenation.gerenciador.domain.Usuario;
import br.com.codenation.gerenciador.domain.mongo.Cargo;
import br.com.codenation.gerenciador.domain.mongo.Departamento;
import br.com.codenation.gerenciador.domain.mongo.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioControllerApi {

    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private DepartamentoRepository dptoRep;
    @Autowired
    private CargoRepository cargRepo;
    @Autowired
    private FuncionarioRepository funcRepo;

    @PostMapping("/usuario")
    public Usuario addUsuario(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }

    @PostMapping("/departamento")
    public Departamento add(@RequestBody Departamento usuario){
        return dptoRep.save(usuario);
    }

    @PostMapping("/cargo")
    public Cargo add(@RequestBody Cargo usuario){
        return cargRepo.save(usuario);
    }

    @PostMapping("/funcionario")
    public Funcionario add(@RequestBody Funcionario usuario){
        return funcRepo.save(usuario);
    }


}
