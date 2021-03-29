package ao.co.temmais.arquitetura.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "grau")
public class Grau {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "grau", unique = true, nullable = false, length = 255)
	private String grau;
	@Column(name = "abrivatura_grau", nullable = false, unique = true)
	private String abreviatura;
	public String getGrau() {
		return grau;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setGrau(String grau) {
		this.grau = grau;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
