package ao.co.temmais.arquitetura.controller.dto.edit;

import ao.co.temmais.arquitetura.modelo.ExameEletronica;
import ao.co.temmais.arquitetura.modelo.Perguntas;
import ao.co.temmais.arquitetura.modelo.Resposta;
import ao.co.temmais.arquitetura.repository.ExameElectronicaRepository;

public class RequisicaoExameElectronico {

	private Long id;
	private Perguntas codigo_pergunta;
	private Resposta codigo_resposta;
	
	public ExameEletronica toExameElectronico(Long id, ExameElectronicaRepository electronicaRepository) {
		ExameEletronica exameEletronica = electronicaRepository.getOne(id);
		exameEletronica.setCodigo_resposta(codigo_resposta);
		exameEletronica.setCodigo_resposta(codigo_resposta);
		return exameEletronica;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Perguntas getCodigo_pergunta() {
		return codigo_pergunta;
	}
	public void setCodigo_pergunta(Perguntas codigo_pergunta) {
		this.codigo_pergunta = codigo_pergunta;
	}
	public Resposta getCodigo_resposta() {
		return codigo_resposta;
	}
	public void setCodigo_resposta(Resposta codigo_resposta) {
		this.codigo_resposta = codigo_resposta;
	}
}
