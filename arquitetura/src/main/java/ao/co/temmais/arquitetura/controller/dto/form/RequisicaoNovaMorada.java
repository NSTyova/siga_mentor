package ao.co.temmais.arquitetura.controller.dto.form;


import ao.co.temmais.arquitetura.modelo.Moradas;

public class RequisicaoNovaMorada {

	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public Moradas toMoradas() {
		Moradas moradas = new Moradas();
		moradas.setDescricao(descricao);
		return moradas;
	}
}
