package ao.co.temmais.arquitetura.controller.dto.edit;

import ao.co.temmais.arquitetura.modelo.Emolumentos;
import ao.co.temmais.arquitetura.repository.EmolumentosRepository;

public class AtualizarEmolumentos {

	private String descricao;
	private int codigo;
	private int desconto;
	private Long id;
	
	public Emolumentos toAtualizar(Long id, EmolumentosRepository repository) {
		Emolumentos emolumentos = repository.getOne(id);
		emolumentos.setDesconto(desconto);
		emolumentos.setDescricao(descricao);
		//emolumentos.setCodigo(codigo);
		return emolumentos;
	}

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

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
