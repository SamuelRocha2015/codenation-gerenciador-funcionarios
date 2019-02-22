package br.com.codenation.gerenciador.service;

import br.com.codenation.gerenciador.models.Departamento;
import br.com.codenation.gerenciador.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class DepartamentoServiceImpl implements DepartamentoService {

	@Override
	public Departamento salvar(Departamento departamento) {
		return null;
	}

	@Override
	public Departamento editar(Departamento departamento) {
		return null;
	}

	@Override
	public void excluir(String id) {

	}

	@Override
	public Departamento buscarPorId(String id) {
		return null;
	}

	@Override
	public List<Departamento> buscarTodos() {
		return null;
	}

	@Override
	public boolean departamentoTemCargos(String id) {
		return false;
	}
}
