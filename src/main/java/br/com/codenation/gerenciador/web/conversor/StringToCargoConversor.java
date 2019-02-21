package br.com.codenation.gerenciador.web.conversor;

import br.com.codenation.gerenciador.models.Cargo;
import br.com.codenation.gerenciador.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToCargoConversor implements Converter<String, Cargo> {

	@Autowired
	private CargoService service;
	
	@Override
	public Cargo convert(String id) {
		if (id.isEmpty()) {
			return null;
		}
		return service.buscarPorId(id);
	}
}
