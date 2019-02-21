package br.com.codenation.gerenciador.service;

import br.com.codenation.gerenciador.models.Departamento;
import br.com.codenation.gerenciador.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoRepository dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Departamento departamento) {
		dao.save(departamento);
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
		return !buscarPorId(id).getCargos().isEmpty();
	}

}
