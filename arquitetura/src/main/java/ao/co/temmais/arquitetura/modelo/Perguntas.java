package ao.co.temmais.arquitetura.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "perguntas")
public class Perguntas{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descricao", nullable = false, length = 255)
	private String descricao;
	private int classificacao;
	@ManyToOne
	@JoinColumn(name = "codigo_ano")
	private Ano codigo_ano;
	@Column(name = "tipo_exame", nullable = false)
	private String tipo_exame;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	public Ano getCodigo_ano() {
		return codigo_ano;
	}
	public void setCodigo_ano(Ano codigo_ano) {
		this.codigo_ano = codigo_ano;
	}
	public String getTipo_exame() {
		return tipo_exame;
	}
	public void setTipo_exame(String tipo_exame) {
		this.tipo_exame = tipo_exame;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
