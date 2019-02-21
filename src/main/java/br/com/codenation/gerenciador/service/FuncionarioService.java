package br.com.codenation.gerenciador.service;

import br.com.codenation.gerenciador.models.Funcionario;

import java.time.LocalDate;
import java.util.List;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(String id);

    Funcionario buscarPorId(String id);

    List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

	List<Funcionario> buscarPorCargo(String id);
	
	List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida);
}
