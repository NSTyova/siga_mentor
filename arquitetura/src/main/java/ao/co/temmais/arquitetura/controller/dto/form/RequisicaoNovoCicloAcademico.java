package ao.co.temmais.arquitetura.controller.dto.form;

import ao.co.temmais.arquitetura.modelo.CicloAcademico;

public class RequisicaoNovoCicloAcademico {

	private String classe;
	private String descricao;
	
	public CicloAcademico toCicloAcademico() {
		CicloAcademico cicloAcademico = new CicloAcademico();
		cicloAcademico.setDescricao(descricao);
		cicloAcademico.setClasse(classe);
		return cicloAcademico;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
