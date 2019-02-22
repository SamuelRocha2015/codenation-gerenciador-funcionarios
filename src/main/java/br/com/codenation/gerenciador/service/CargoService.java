package br.com.codenation.gerenciador.service;

import br.com.codenation.gerenciador.models.Cargo;

import java.util.List;

public interface CargoService {

	Cargo salvar(Cargo cargo);
	
	Cargo editar(Cargo cargo);
	
	void excluir(String id);
	
	Cargo buscarPorId(String id);
	
	List<Cargo> buscarTodos();
	
	boolean cargoTemFuncionarios(String id);
}
