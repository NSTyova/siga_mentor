package ao.co.temmais.arquitetura.controller.dto.form;

import org.hibernate.validator.constraints.NotBlank;

import ao.co.temmais.arquitetura.modelo.Ano;

@SuppressWarnings("deprecation")
public class RequisicaoNovoAno {

	
	private int ano;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Ano toAno() {
		Ano anos = new Ano();
		anos.setAno(ano);
		return anos;
	}
}
