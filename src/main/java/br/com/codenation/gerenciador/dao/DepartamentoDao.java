package br.com.codenation.gerenciador.dao;

import br.com.codenation.gerenciador.domain.mongo.Departamento;

import java.util.List;

public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
