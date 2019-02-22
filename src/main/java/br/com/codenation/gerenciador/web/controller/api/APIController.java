package br.com.codenation.gerenciador.web.controller.api;

import java.util.List;

public interface APIController<T> {

    List<T> buscaTodos();
    T  buscaPorId(String id);
    void remove(String id);
    T adiciona(T t);
    T atualiza(String id, T t);

}
