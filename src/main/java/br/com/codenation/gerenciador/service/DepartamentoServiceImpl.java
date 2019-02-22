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

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoRepository dao;

	@Transactional(readOnly = false)
	@Override
	public Departamento salvar(Departamento departamento) {
		departamento.setId(UUID.randomUUID().toString());
		return dao.save(departamento);
	}

	@Transactional(readOnly = false)
	@Override
	public Departamento editar(Departamento departamento) {
		return dao.save(departamento);
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(String id) {
		dao.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Departamento buscarPorId(String id) {
		Optional<Departamento> departamento = dao.findById(id);
		return departamento.get();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Departamento> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean departamentoTemCargos(String id) {
		return !CollectionUtils.isEmpty(buscarPorId(id).getCargos());
	}

}
