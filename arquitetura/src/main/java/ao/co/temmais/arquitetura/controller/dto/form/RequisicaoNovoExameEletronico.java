package ao.co.temmais.arquitetura.controller.dto.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import ao.co.temmais.arquitetura.modelo.*;

public class RequisicaoNovoExameEletronico {

	
	private Perguntas codigo_pergunta;
	private Resposta codigo_resposta;
	private Usuario codigo_usuario_candidato;
	private Ano codigo_ano;
	private int certa;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataInicio;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataFim;
	
	public ExameEletronica toExameElectronico() {
		ExameEletronica exameEletronica = new ExameEletronica();
		exameEletronica.setCerta(certa);
		exameEletronica.setCodigo_ano(codigo_ano);
		exameEletronica.setCodigo_pergunta(codigo_pergunta);
		exameEletronica.setCodigo_resposta(codigo_resposta);
		exameEletronica.setDataFim(dataFim);
		exameEletronica.setDataInicio(dataInicio);
		return exameEletronica;
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

	public Usuario getCodigo_usuario_candidato() {
		return codigo_usuario_candidato;
	}

	public void setCodigo_usuario_candidato(Usuario codigo_usuario_candidato) {
		this.codigo_usuario_candidato = codigo_usuario_candidato;
	}

	public Ano getCodigo_ano() {
		return codigo_ano;
	}

	public void setCodigo_ano(Ano codigo_ano) {
		this.codigo_ano = codigo_ano;
	}

	public int getCerta() {
		return certa;
	}

	public void setCerta(int certa) {
		this.certa = certa;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	
	
	
}
