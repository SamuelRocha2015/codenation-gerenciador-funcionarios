package br.com.codenation.gerenciador.service;

import br.com.codenation.gerenciador.models.Funcionario;
import br.com.codenation.gerenciador.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class FuncionarioServiceImpl implements FuncionarioService {

	@Override
	public Funcionario salvar(Funcionario funcionario) {
		return null;
	}

	@Override
	public Funcionario editar(Funcionario funcionario) {
		return null;
	}

	@Override
	public void excluir(String id) {

	}

	@Override
	public Funcionario buscarPorId(String id) {
		return null;
	}

	@Override
	public List<Funcionario> buscarTodos() {
		return null;
	}

	@Override
	public List<Funcionario> buscarPorNome(String nome) {
		return null;
	}

	@Override
	public List<Funcionario> buscarPorCargo(String id) {
		return null;
	}

	@Override
	public List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida) {
		return null;
	}
}
