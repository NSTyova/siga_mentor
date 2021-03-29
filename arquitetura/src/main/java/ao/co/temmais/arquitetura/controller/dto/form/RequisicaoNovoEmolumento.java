package ao.co.temmais.arquitetura.controller.dto.form;

import ao.co.temmais.arquitetura.modelo.Emolumentos;

public class RequisicaoNovoEmolumento {

	public Long id;
	private String descricao;
	private int codigo;
	private int desconto;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Emolumentos toEmolumentos() {
		
		Emolumentos emolumentos = new Emolumentos();
		emolumentos.setCodigo(codigo);
		emolumentos.setDescricao(descricao);
		emolumentos.setDesconto(desconto);
		return emolumentos;
	}
	
}
