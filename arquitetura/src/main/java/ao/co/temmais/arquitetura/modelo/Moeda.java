package ao.co.temmais.arquitetura.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "moedas")
public class Moeda{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "descricao", length = 20, nullable = false, unique = true)
	private String descricao;
	@Column(name = "abreviacao", length = 20, nullable = false, unique = true)
	private String abriviacao;
	@Column(name = "status", length = 1, nullable = false)
	private int status;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAbriviacao() {
		return abriviacao;
	}
	public void setAbriviacao(String abriviacao) {
		this.abriviacao = abriviacao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
