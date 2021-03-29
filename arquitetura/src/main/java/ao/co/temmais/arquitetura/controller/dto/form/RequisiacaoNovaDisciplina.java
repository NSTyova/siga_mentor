package ao.co.temmais.arquitetura.controller.dto.form;

import ao.co.temmais.arquitetura.modelo.CicloAcademico;
import ao.co.temmais.arquitetura.modelo.Disciplina;

public class RequisiacaoNovaDisciplina {

	private String descricao;
	private int horas;
	private String sigla;
	private int status;
	private int horas_semanais;
	private CicloAcademico cicloAcademico;
	
	
	public Disciplina toDisciplina() {
		Disciplina disciplina = new Disciplina();
		disciplina.setDescricao(descricao);
		disciplina.setHoras(horas);
		disciplina.setHoras_semanais(horas_semanais);
		disciplina.setCicloAcademico(cicloAcademico);
		disciplina.setSigla(sigla);
		return  disciplina;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public String getSigla() {
		return sigla;
	}


	public void setSigla(String sigla) {
		this.sigla = sigla;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public int getHoras_semanais() {
		return horas_semanais;
	}


	public void setHoras_semanais(int horas_semanais) {
		this.horas_semanais = horas_semanais;
	}


	public CicloAcademico getCicloAcademico() {
		return cicloAcademico;
	}


	public void setCicloAcademico(CicloAcademico cicloAcademico) {
		this.cicloAcademico = cicloAcademico;
	}
	
	
}
