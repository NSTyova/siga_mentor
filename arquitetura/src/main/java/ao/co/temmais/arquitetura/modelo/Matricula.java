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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;



@SuppressWarnings("serial")
@Entity
@Table(name = "matricula")
public class Matricula{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@Temporal(TemporalType.DATE)
	@Column(name = "data_matricula")
	private LocalDate data;
	private boolean anulado;
	//@Temporal(TemporalType.DATE)
	private LocalDate dataAnulamento;
	@Column(name = "numero_estudante")
	private Long numeroDeAluno;
	// JUNÇÕES COM OUTRAS TABELAS...
	@ManyToOne
	@JoinColumn(name = "codigo_ano_lectivo")
	private Ano anoLectivo;
	@ManyToOne
	@JoinColumn(name = "codigo_cicloAcademico")
	private CicloAcademico cicloAcademico;
	@ManyToOne
	@JoinColumn(name = "codigo_aluno")
	private Aluno aluno;
	@ManyToOne
	@JoinColumn(name = "codigo_turma_base")
	private Turma turmaBase;
	@ManyToOne
	@JoinColumn(name = "codigo_plano_pagamento")
	private PlanoPagamento planoPagamento;

	@Column(nullable = true)
	private Boolean processamentoReferencia;

	@ManyToOne
	@JoinColumn(name = "codigo_usuario_inscreveu")
	private Usuario usuarioInscreveu;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataInscricao;

	@ManyToOne
	@JoinColumn(name = "codigo_usuario_alterou")
	private Usuario UsuarioAlterou;

	@ManyToOne
	@JoinColumn(name = "codigo_alterou_tipo_inscricao")
	private Usuario alterouTipoInscricao;

	private LocalDate dataAlteracaoTipoInscricao;

	private LocalDate dataAlteracao;

	@ManyToOne
	@JoinColumn(name = "codigo_usuario_anulou")
	private Usuario usuarioAnulou;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public boolean isAnulado() {
		return anulado;
	}

	public void setAnulado(boolean anulado) {
		this.anulado = anulado;
	}

	public LocalDate getDataAnulamento() {
		return dataAnulamento;
	}

	public void setDataAnulamento(LocalDate dataAnulamento) {
		this.dataAnulamento = dataAnulamento;
	}

	public Long getNumeroDeAluno() {
		return numeroDeAluno;
	}
	public void setNumeroDeAluno(Long numeroDeAluno) {
		this.numeroDeAluno = numeroDeAluno;
	}

	public Ano getAnoLectivo() {
		return anoLectivo;
	}

	public void setAnoLectivo(Ano anoLectivo) {
		this.anoLectivo = anoLectivo;
	}

	public CicloAcademico getCicloAcademico() {
		return cicloAcademico;
	}

	public void setCicloAcademico(CicloAcademico cicloAcademico) {
		this.cicloAcademico = cicloAcademico;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurmaBase() {
		return turmaBase;
	}

	public void setTurmaBase(Turma turmaBase) {
		this.turmaBase = turmaBase;
	}

	public PlanoPagamento getPlanoPagamento() {
		return planoPagamento;
	}

	public void setPlanoPagamento(PlanoPagamento planoPagamento) {
		this.planoPagamento = planoPagamento;
	}

	public Boolean getProcessamentoReferencia() {
		return processamentoReferencia;
	}

	public void setProcessamentoReferencia(Boolean processamentoReferencia) {
		this.processamentoReferencia = processamentoReferencia;
	}

	public Usuario getUsuarioInscreveu() {
		return usuarioInscreveu;
	}

	public void setUsuarioInscreveu(Usuario usuarioInscreveu) {
		this.usuarioInscreveu = usuarioInscreveu;
	}

	public LocalDate getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(LocalDate dataInscricao) {
		this.dataInscricao = dataInscricao;
	}

	public Usuario getUsuarioAlterou() {
		return UsuarioAlterou;
	}

	public void setUsuarioAlterou(Usuario usuarioAlterou) {
		UsuarioAlterou = usuarioAlterou;
	}

	public Usuario getAlterouTipoInscricao() {
		return alterouTipoInscricao;
	}

	public void setAlterouTipoInscricao(Usuario alterouTipoInscricao) {
		this.alterouTipoInscricao = alterouTipoInscricao;
	}

	public LocalDate getDataAlteracaoTipoInscricao() {
		return dataAlteracaoTipoInscricao;
	}

	public void setDataAlteracaoTipoInscricao(LocalDate dataAlteracaoTipoInscricao) {
		this.dataAlteracaoTipoInscricao = dataAlteracaoTipoInscricao;
	}

	public LocalDate getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(LocalDate dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public Usuario getUsuarioAnulou() {
		return usuarioAnulou;
	}

	public void setUsuarioAnulou(Usuario usuarioAnulou) {
		this.usuarioAnulou = usuarioAnulou;
	}

}
