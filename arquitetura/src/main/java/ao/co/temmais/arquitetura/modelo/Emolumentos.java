package ao.co.temmais.arquitetura.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.thymeleaf.expression.Sets;

@SuppressWarnings("serial")
@Entity
@Table(name = "emolumentos")
public class Emolumentos {
 
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "codigo_emolumento", unique = true, nullable = false, length = 8)
	private int codigo;
	@Column(name = "descricao", unique = true, nullable = false, length = 30)
	private String descricao;
	@Column(name = "status", nullable = false, length = 1)
	private int status;
	@Column(name = "desconto", nullable = false, length = 1)
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
