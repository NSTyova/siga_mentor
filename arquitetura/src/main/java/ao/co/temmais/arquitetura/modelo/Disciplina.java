package ao.co.temmais.arquitetura.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "disciplina")
public class Disciplina{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private int horas;
	private String sigla;
	private int status;
	private int horas_semanais;
	@ManyToOne
	@JoinColumn(name = "cicloAcademico")
	private CicloAcademico cicloAcademico;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getHoras_semanais() {
		return horas_semanais;
	}
	public void setHoras_semanais(int horas_semanais) {
		this.horas_semanais = horas_semanais;
	}
	public CicloAcademico getCicloAcademico() {
		return cicloAcademico;
	}
	public void setCicloAcademico(CicloAcademico cicloAcademico) {
		this.cicloAcademico = cicloAcademico;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
