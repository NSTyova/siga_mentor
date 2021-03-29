package ao.co.temmais.arquitetura.controller.dto.edit;

import ao.co.temmais.arquitetura.modelo.Ano;

public class RequisicaoEditaAno {

	private Long id;
	private int ano;
	
	public Ano toAno() {
		Ano anos = new Ano();
		anos.setAno(ano);
		return anos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	
}
