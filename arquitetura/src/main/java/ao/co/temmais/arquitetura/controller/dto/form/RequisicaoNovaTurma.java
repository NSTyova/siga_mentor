package ao.co.temmais.arquitetura.controller.dto.form;

import ao.co.temmais.arquitetura.modelo.Turma;

public class RequisicaoNovaTurma {

	private String descricao;
	private String turno;
	
	public Turma toTurma() {
		Turma turma = new Turma();
		turma.setDescricao(descricao);
		turma.setTurno(turno);
		return turma;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
}
