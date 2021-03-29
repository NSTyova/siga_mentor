package ao.co.temmais.arquitetura.controller.dto.form;

import java.time.LocalDate;
import java.util.Date;

import org.apache.logging.log4j.message.StructuredDataMessage.Format;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import ao.co.temmais.arquitetura.modelo.Aluno;
import ao.co.temmais.arquitetura.modelo.Ano;
import ao.co.temmais.arquitetura.modelo.CicloAcademico;
import ao.co.temmais.arquitetura.modelo.Matricula;
import ao.co.temmais.arquitetura.modelo.PlanoPagamento;
import ao.co.temmais.arquitetura.modelo.Turma;
import ao.co.temmais.arquitetura.modelo.Usuario;

public class RequisicaoNovaMatricula {
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate data =LocalDate.now();
	// JUNÇÕES COM OUTRAS TABELAS...
	private Ano anoLectivo;
	private CicloAcademico cicloAcademico;
	private Aluno aluno;
	private Turma turmaBase;
	private PlanoPagamento planoPagamento;
	private Usuario usuarioInscreveu;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataInscricao = LocalDate.now();
	
	public Matricula toMatricula() {
		Matricula matricula = new Matricula();
		matricula.setData(data);
		matricula.setAnoLectivo(anoLectivo);
		matricula.setCicloAcademico(cicloAcademico);
		matricula.setAluno(aluno);
		matricula.setTurmaBase(turmaBase);
		matricula.setPlanoPagamento(planoPagamento);
		matricula.setUsuarioInscreveu(usuarioInscreveu);
		matricula.setDataInscricao(dataInscricao);
		return matricula;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
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

	
}
