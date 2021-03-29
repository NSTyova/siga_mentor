package ao.co.temmais.arquitetura.modelo;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name = "candidatos")
public class Candidatos {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome_completo", nullable = false, length = 50)
	private String nome;
	@Column(name = "numero_bilhete", nullable = false, length = 50)
	private String numeroBilhete;
	@Column(name = "data_inscricao", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dtInscricao = LocalDate.now();
	@Column(name = "data_nascimento", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dtNascimento;
	@Column(name = "documento_identificacoa", nullable = false, length = 50)
	private String documentoIdentificacao;
	@Column(name = "email", nullable = false, length = 50)
	private String email;
	@Column(name = "estado_civil", nullable = false, length = 50)
	private String estadoCivil;
	@Column(name = "exame", nullable = true)
	private String exame;
	@Column(name = "necessidades_especiais", nullable = false, length = 50)
	private String necessidadeEspecial;
	@Column(name = "nota_exame", nullable = true, length = 50)
	private String notaExame;
	@Column(name = "seriado", nullable = false, columnDefinition = "TINYINT")
	private String seriado = "0";
	@Column(name = "telefone", nullable = false, length = 50)
	private String telefone;
	@ManyToOne
	@JoinColumn(name = "ano_exame")
	private Ano ano;
	@ManyToOne
	@JoinColumn(name = "grau_academico")
	private Grau grau;
	@ManyToOne
	@JoinColumn(name = "provincia_mora")
	private Moradas morada;
	@Column(name = "faculdade_estudou")
	private String faculdade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroBilhete() {
		return numeroBilhete;
	}
	public void setNumeroBilhete(String numeroBilhete) {
		this.numeroBilhete = numeroBilhete;
	}
	public LocalDate getDtInscricao() {
		return dtInscricao;
	}
	public void setDtInscricao(LocalDate dtInscricao) {
		this.dtInscricao = dtInscricao;
	}
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
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
	public String getNecessidadeEspecial() {
		return necessidadeEspecial;
	}
	public void setNecessidadeEspecial(String necessidadeEspecial) {
		this.necessidadeEspecial = necessidadeEspecial;
	}
	public String getNotaExame() {
		return notaExame;
	}
	public void setNotaExame(String notaExame) {
		this.notaExame = notaExame;
	}
	public String getSeriado() {
		return seriado;
	}
	public void setSeriado(String seriado) {
		this.seriado = seriado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Ano getAno() {
		return ano;
	}
	public void setAno(Ano ano) {
		this.ano = ano;
	}
	public Grau getGrau() {
		return grau;
	}
	public void setGrau(Grau grau) {
		this.grau = grau;
	}
	public Moradas getMorada() {
		return morada;
	}
	public void setMorada(Moradas morada) {
		this.morada = morada;
	}
	public String getFaculdade() {
		return faculdade;
	}
	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	
	
}
