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
@Table(name = "resposta")
public class Resposta {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private int correta;
	@ManyToOne
	@JoinColumn(name = "codigo_pergunta")
	private Perguntas codigo_pergunta;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCorreta() {
		return correta;
	}
	public void setCorreta(int correta) {
		this.correta = correta;
	}
	public Perguntas getCodigo_pergunta() {
		return codigo_pergunta;
	}
	public void setCodigo_pergunta(Perguntas codigo_pergunta) {
		this.codigo_pergunta = codigo_pergunta;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
