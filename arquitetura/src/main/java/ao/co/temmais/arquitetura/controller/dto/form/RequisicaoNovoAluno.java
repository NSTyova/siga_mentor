package ao.co.temmais.arquitetura.controller.dto.form;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import ao.co.temmais.arquitetura.modelo.Aluno;
import ao.co.temmais.arquitetura.modelo.CicloAcademico;
import ao.co.temmais.arquitetura.modelo.Municipio;

public class RequisicaoNovoAluno {

//1. DADOS PESSOAIS ---------------------------------->   OK
	private String nome;
	private CicloAcademico cicloAcademico;
	private String sexo;
//2. DADOS DE NASCIMENTO------------------------------>   OK
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataNascimento;
	private Municipio municipio;
//3. DADOS DE CONTACTOS------------------------------->   OK
	private String morada;
	private String bairro;
	private String email;
	private String telefone;
	private String telefone1;
	private String telefone2;
//4. DADOS DE IDENTIFICAÇÃO-------------------------->   OK
	private String documentoIdentificacao;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataEmissaoDocumento;
	private String numeroDocumento;
	private String arquivoIdentificacao;
	private String nomeDoPai;
	private String nomeDaMae;
	private String necessidadeEducacaoEspecial;
//5. DADOS DA SITUAÇÃO ACADEMICA----------------------->  OK
	private Boolean atestadoMedico=true;
	private Boolean copiaDocumentoIdentificacao=true;
	private Boolean copiaCertificado=true;
	private Boolean copiaDocumentoMilitar=true;
	private Boolean inactivo=true;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataInscricao = LocalDate.now();
	private Boolean primeiraMatricula=true;
	
	public Aluno toAluno() {
		Aluno aluno = new Aluno();
		aluno.setArquivoIdentificacao(arquivoIdentificacao);
		aluno.setAtestadoMedico(atestadoMedico);
		aluno.setBairro(bairro);
		aluno.setCicloAcademico(cicloAcademico);
		aluno.setCopiaCertificado(copiaCertificado);
		aluno.setCopiaDocumentoIdentificacao(copiaDocumentoIdentificacao);
		aluno.setCopiaDocumentoMilitar(copiaDocumentoMilitar);
		aluno.setDataEmissaoDocumento(dataEmissaoDocumento);
		aluno.setDataInscricao(dataInscricao);
		aluno.setDataNascimento(dataNascimento);
		aluno.setDocumentoIdentificacao(documentoIdentificacao);
		aluno.setEmail(email);
		aluno.setInactivo(inactivo);
		aluno.setMorada(morada);
		aluno.setMunicipio(municipio);
		aluno.setNecessidadeEducacaoEspecial(necessidadeEducacaoEspecial);
		aluno.setNome(nome);
		aluno.setNomeDaMae(nomeDaMae);
		aluno.setNomeDoPai(nomeDoPai);
		aluno.setNumeroDocumento(numeroDocumento);
		aluno.setPrimeiraMatricula(primeiraMatricula);
		aluno.setSexo(sexo);
		aluno.setTelefone(telefone);
		aluno.setTelefone1(telefone1);
		aluno.setTelefone2(telefone2);
		return aluno;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CicloAcademico getCicloAcademico() {
		return cicloAcademico;
	}
	public void setCicloAcademico(CicloAcademico cicloAcademico) {
		this.cicloAcademico = cicloAcademico;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getDocumentoIdentificacao() {
		return documentoIdentificacao;
	}
	public void setDocumentoIdentificacao(String documentoIdentificacao) {
		this.documentoIdentificacao = documentoIdentificacao;
	}
	public LocalDate getDataEmissaoDocumento() {
		return dataEmissaoDocumento;
	}
	public void setDataEmissaoDocumento(LocalDate dataEmissaoDocumento) {
		this.dataEmissaoDocumento = dataEmissaoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getArquivoIdentificacao() {
		return arquivoIdentificacao;
	}
	public void setArquivoIdentificacao(String arquivoIdentificacao) {
		this.arquivoIdentificacao = arquivoIdentificacao;
	}
	public String getNomeDoPai() {
		return nomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	public String getNecessidadeEducacaoEspecial() {
		return necessidadeEducacaoEspecial;
	}
	public void setNecessidadeEducacaoEspecial(String necessidadeEducacaoEspecial) {
		this.necessidadeEducacaoEspecial = necessidadeEducacaoEspecial;
	}
	public Boolean getAtestadoMedico() {
		return atestadoMedico;
	}
	public void setAtestadoMedico(Boolean atestadoMedico) {
		this.atestadoMedico = atestadoMedico;
	}
	public Boolean getCopiaDocumentoIdentificacao() {
		return copiaDocumentoIdentificacao;
	}
	public void setCopiaDocumentoIdentificacao(Boolean copiaDocumentoIdentificacao) {
		this.copiaDocumentoIdentificacao = copiaDocumentoIdentificacao;
	}
	public Boolean getCopiaCertificado() {
		return copiaCertificado;
	}
	public void setCopiaCertificado(Boolean copiaCertificado) {
		this.copiaCertificado = copiaCertificado;
	}
	public Boolean getCopiaDocumentoMilitar() {
		return copiaDocumentoMilitar;
	}
	public void setCopiaDocumentoMilitar(Boolean copiaDocumentoMilitar) {
		this.copiaDocumentoMilitar = copiaDocumentoMilitar;
	}
	public Boolean getInactivo() {
		return inactivo;
	}
	public void setInactivo(Boolean inactivo) {
		this.inactivo = inactivo;
	}
	public LocalDate getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(LocalDate dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public Boolean getPrimeiraMatricula() {
		return primeiraMatricula;
	}
	public void setPrimeiraMatricula(Boolean primeiraMatricula) {
		this.primeiraMatricula = primeiraMatricula;
	}
	
	
}
