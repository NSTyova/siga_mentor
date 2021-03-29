package ao.co.temmais.arquitetura.controller.dto.form;

import ao.co.temmais.arquitetura.modelo.Municipio;
import ao.co.temmais.arquitetura.modelo.Provincia;

public class RequisicaoNovoMunicipio {

	private String descricao;
	private Provincia provincia;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	public Municipio toMunicipio() {
		Municipio municipio = new Municipio();
		municipio.setDescricao(descricao);
		municipio.setProvincia(provincia);
		return municipio;
	}
}
