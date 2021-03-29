package ao.co.temmais.arquitetura.modelo;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "perfis")
public class Perfil {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "descricao", nullable = false, unique = true)
	private String desc;

	public Perfil(long cod) {
		
	}

	public Perfil() {
		super();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
