package br.com.codenation.gerenciador.service;

import br.com.codenation.gerenciador.models.Cargo;
import br.com.codenation.gerenciador.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service @Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {
	
	@Autowired
	private CargoRepository repository;

	@Override
	public void salvar(Cargo cargo) {
		cargo.setId(UUID.randomUUID().toString());
		repository.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		repository.save(cargo);
	}

	@Override
	public void excluir(String id) {
		repository.deleteById(id);
	}

	@Override @Transactional(readOnly = true)
	public Cargo buscarPorId(String id) {
		Optional<Cargo> cargo = repository.findById(id);
		return cargo.get();
	}

	@Override @Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		return repository.findAll();
	}

	@Override
	public boolean cargoTemFuncionarios(String id) {
		return !buscarPorId(id).getFuncionarios().isEmpty();
	}
}
