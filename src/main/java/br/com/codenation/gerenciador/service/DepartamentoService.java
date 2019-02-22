package br.com.codenation.gerenciador.service;

import br.com.codenation.gerenciador.models.Departamento;

import java.util.List;

public interface DepartamentoService {

    Departamento salvar(Departamento departamento);

    Departamento editar(Departamento departamento);

    void excluir(String id);

    Departamento buscarPorId(String id);
    
    List<Departamento> buscarTodos();

	boolean departamentoTemCargos(String id);
}
