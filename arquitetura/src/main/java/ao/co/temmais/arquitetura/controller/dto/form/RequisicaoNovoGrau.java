package ao.co.temmais.arquitetura.controller.dto.form;

import ao.co.temmais.arquitetura.modelo.Grau;

public class RequisicaoNovoGrau {

	private String grau;
	private String abreviatura;
	public String getGrau() {
		return grau;
	}
	public void setGrau(String grau) {
		this.grau = grau;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	public Grau toGrau() {
		Grau graus = new Grau();
		graus.setGrau(grau);
		graus.setAbreviatura(abreviatura);
		return graus;
	}
}
