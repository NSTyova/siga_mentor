package ao.co.temmais.arquitetura.controller.converter;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ao.co.temmais.arquitetura.modelo.Perguntas;
import ao.co.temmais.arquitetura.repository.PerguntasRepository;


@Component
public class PerguntasConverter implements Converter<String[], Set<Perguntas>> {

	@Autowired
	private PerguntasRepository repository;

	@Override
	public Set<Perguntas> convert(String[] descricao) {
		
		Set<Perguntas> perguntas = new HashSet<>();
		if (descricao != null && descricao.length > 0) {
			perguntas.addAll(repository.findAll());			
		}
		return perguntas;
	}
}
