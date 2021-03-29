package ao.co.temmais.arquitetura.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "guia_pagamento_historico")
public class GuiaPagamentoHistorico{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="codigo_usuario_emitiu")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name="codigo_usuario_anulou")
	private Usuario usuarioAnulou;
	@ManyToOne
	@JoinColumn(name="codigo_emolumento")
	private Emolumentos emolumento;
	private double valor;
	private String obs;
	@ManyToOne
	@JoinColumn(name="codigo_aluno")
	private Aluno aluno;
	@ManyToOne
	@JoinColumn(name="codigo_anoLectivo")
	private Ano anoLectivo;
	private String numeroDeAluno;
	private String bourderoux;
	private LocalDate dataPagamento;
	private LocalDate dataRegistro;
	private LocalDate dataVencimento;

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Emolumentos getEmolumento() {
		return emolumento;
	}
	public void setEmolumento(Emolumentos emolumento) {
		this.emolumento = emolumento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Ano getAnoLectivo() {
		return anoLectivo;
	}
	public void setAnoLectivo(Ano anoLectivo) {
		this.anoLectivo = anoLectivo;
	}
	public String getNumeroDeAluno() {
		return numeroDeAluno;
	}
	public void setNumeroDeAluno(String numeroDeAluno) {
		this.numeroDeAluno = numeroDeAluno;
	}
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public LocalDate getDataRegistro() {
		return dataRegistro;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getBourderoux() {
		return bourderoux;
	}
	public void setBourderoux(String bourderoux) {
		this.bourderoux = bourderoux;
	}
}
