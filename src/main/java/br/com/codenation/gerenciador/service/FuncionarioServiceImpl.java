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

@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {
	
	@Autowired
	private FuncionarioRepository dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Funcionario funcionario) {
		dao.save(funcionario);
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(String id) {
		dao.deleteById (id);
	}

	@Override
	public Funcionario buscarPorId(String id) {
		Optional<Funcionario> func = dao.findById(id);
		return func.get();
	}

	@Override
	public List<Funcionario> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public List<Funcionario> buscarPorNome(String nome) {
		return dao.findByNome(nome);
	}

	@Override
	public List<Funcionario> buscarPorCargo(String id) {
		return dao.findByCargoId(id);
	}

	@Override
    public List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida) {
	    if (entrada != null && saida != null) {	    	
            return dao.findByDataEntradaAndDataSaida(entrada, saida);
        } else if (entrada != null) {        	
	        return dao.findByDataEntrada(entrada);
        } else if (saida != null) {        	
	        return dao.findByDataSaida(saida);
        } else {
        	return new ArrayList<>();
        }
    }
}
