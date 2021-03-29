package ao.co.temmais.arquitetura.modelo;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import groovy.transform.Generated;


@Entity
@Table(name = "alunos")
public class Aluno {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//1. DADOS PESSOAIS ---------------------------------->   OK
	private String nome;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codigo_ciclo_Academico", nullable = true)
	private CicloAcademico cicloAcademico;
	private String sexo;
//2. DADOS DE NASCIMENTO------------------------------>   OK
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;
	@ManyToOne
	@JoinColumn(name = "codigo_municipio_nascimento") // novo
	private Municipio municipio;
//3. DADOS DE CONTACTOS------------------------------->   OK
	private String morada;
	private String bairro;
	@ManyToOne
	@JoinColumn(name = "codigo_municio_residencia")
	private Municipio municipioResidencia;
	private String email;
	private String telefone;
	private String telefone1;
	private String telefone2;
//4. DADOS DE IDENTIFICAÇÃO-------------------------->   OK
	private String documentoIdentificacao;
	@Column(name = "data_emissao_identidade")
	private LocalDate dataEmissaoDocumento;
	@Column(name = "numero_documento_identificacao")
	private String numeroDocumento;
	@Column(name = "arquivo_identificacao")
	private String arquivoIdentificacao;
	@Column(name = "nome_do_pai")
	private String nomeDoPai;
	@Column(name = "nome_da_mae")
	private String nomeDaMae;
	private String necessidadeEducacaoEspecial;
//5. DADOS DA SITUAÇÃO ACADEMICA----------------------->  OK
	@Column(name = "atestado_medico", nullable = true)
	private Boolean atestadoMedico;
	private Boolean copiaDocumentoIdentificacao;
	@Column(nullable = true)
	private Boolean CopiaCertificado;
	private Boolean fotografias;
	private Boolean copiaDocumentoMilitar;
	private Boolean inactivo;
	private LocalDate dataInscricao;
	@Column(nullable = false)
	private Boolean primeiraMatricula;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Transient
	private byte[] foto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Municipio getMunicipioResidencia() {
		return municipioResidencia;
	}
	public void setMunicipioResidencia(Municipio municipioResidencia) {
		this.municipioResidencia = municipioResidencia;
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
		return CopiaCertificado;
	}
	public void setCopiaCertificado(Boolean copiaCertificado) {
		CopiaCertificado = copiaCertificado;
	}
	public Boolean getFotografias() {
		return fotografias;
	}
	public void setFotografias(Boolean fotografias) {
		this.fotografias = fotografias;
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
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	

}
