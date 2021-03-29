package ao.co.temmais.arquitetura.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ao.co.temmais.arquitetura.modelo.Ano;
import ao.co.temmais.arquitetura.repository.AnoRepository;

@Service
public class AnoService {

	@Autowired
	private AnoRepository repository;
	
	
	@Transactional(readOnly = false)
	public void gravar(Ano ano) {
		repository.save(ano);
	}
}
