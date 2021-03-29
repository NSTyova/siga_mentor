package ao.co.temmais.arquitetura.controller.dto.form;


import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import ao.co.temmais.arquitetura.modelo.Ano;
import ao.co.temmais.arquitetura.modelo.Candidatos;
import ao.co.temmais.arquitetura.modelo.Grau;
import ao.co.temmais.arquitetura.modelo.Moradas;

public class RequisicaoNovoCandidato {

	private String nome;
	private Ano ano;
	private Moradas morada;
	private Grau grau;
	private String documentoIdentificacao;
	private String email;
	private String estadoCivil;
	private String exame;
	private String faculdade;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dtNascimento;
	private String necessidadeEspecial;
	private String numeroBilhete;
	private String telefone;
	
	
	public Candidatos toCandidatos() {
		Candidatos candidatos = new Candidatos();
		candidatos.setAno(ano);
		candidatos.setDocumentoIdentificacao(documentoIdentificacao);
		candidatos.setDtNascimento(dtNascimento);
		candidatos.setEmail(email);
		candidatos.setEstadoCivil(estadoCivil);
		candidatos.setFaculdade(faculdade);
		candidatos.setMorada(morada);
		candidatos.setExame(exame);
		candidatos.setFaculdade(faculdade);
		candidatos.setGrau(grau);
		candidatos.setNecessidadeEspecial(necessidadeEspecial);
		candidatos.setNumeroBilhete(numeroBilhete);
		candidatos.setNome(nome);
		candidatos.setTelefone(telefone);
		return candidatos;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Ano getAno() {
		return ano;
	}


	public void setAno(Ano ano) {
		this.ano = ano;
	}


	public Moradas getMorada() {
		return morada;
	}


	public void setMorada(Moradas morada) {
		this.morada = morada;
	}


	public Grau getGrau() {
		return grau;
	}


	public void setGrau(Grau grau) {
		this.grau = grau;
	}


	public String getDocumentoIdentificacao() {
		return documentoIdentificacao;
	}


	public void setDocumentoIdentificacao(String documentoIdentificacao) {
		this.documentoIdentificacao = documentoIdentificacao;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public String getExame() {
		return exame;
	}


	public void setExame(String exame) {
		this.exame = exame;
	}


	public String getFaculdade() {
		return faculdade;
	}


	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}


	public LocalDate getDtNascimento() {
		return dtNascimento;
	}


	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}


	public String getNecessidadeEspecial() {
		return necessidadeEspecial;
	}


	public void setNecessidadeEspecial(String necessidadeEspecial) {
		this.necessidadeEspecial = necessidadeEspecial;
	}


	public String getNumeroBilhete() {
		return numeroBilhete;
	}


	public void setNumeroBilhete(String numeroBilhete) {
		this.numeroBilhete = numeroBilhete;
	}

	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
