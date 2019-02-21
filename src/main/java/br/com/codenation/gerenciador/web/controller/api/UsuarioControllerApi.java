package br.com.codenation.gerenciador.web.controller.api;

import br.com.codenation.gerenciador.domain.Cargo;
import br.com.codenation.gerenciador.domain.Departamento;
import br.com.codenation.gerenciador.domain.Funcionario;
import br.com.codenation.gerenciador.domain.Usuario;
import br.com.codenation.gerenciador.repositories.DepartamentoRepository;
import br.com.codenation.gerenciador.repositories.FuncionarioRepository;
import br.com.codenation.gerenciador.repositories.UsuarioRepository;
import br.com.codenation.gerenciador.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioControllerApi {

    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private DepartamentoRepository dptoRep;
    @Autowired
    private CargoService cargRepo;
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
    public void add(@RequestBody Cargo usuario){
         cargRepo.salvar(usuario);
    }


    @GetMapping("/cargo")
    public List<Cargo> getAll(){
        return cargRepo.buscarTodos();
    }


    @PostMapping("/funcionario")
    public Funcionario add(@RequestBody Funcionario usuario){
        return funcRepo.save(usuario);
    }


}
