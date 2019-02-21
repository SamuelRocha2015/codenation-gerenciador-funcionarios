package br.com.codenation.gerenciador.web.conversor;

import br.com.codenation.gerenciador.domain.mongo.Departamento;
import br.com.codenation.gerenciador.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento> {
	
	@Autowired
	private DepartamentoService service;

	@Override
	public Departamento convert(String id) {
		if (id.isEmpty()) {
			return null;
		}
		return service.buscarPorId(id);
	}

}
