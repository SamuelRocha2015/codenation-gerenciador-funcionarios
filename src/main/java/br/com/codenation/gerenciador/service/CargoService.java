package br.com.codenation.gerenciador.service;

import br.com.codenation.gerenciador.domain.Cargo;

import java.util.List;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(String id);
	
	Cargo buscarPorId(String id);
	
	List<Cargo> buscarTodos();
	
	boolean cargoTemFuncionarios(String id);
}
