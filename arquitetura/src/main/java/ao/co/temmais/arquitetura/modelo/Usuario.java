package ao.co.temmais.arquitetura.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome_usuario")
	private String nome;
	@Column(name = "email", unique = true, nullable = false)
	private String email;
	@Column(name = "senha", nullable = false)
	private String senha;

	@Column(name = "ativo", nullable = false, columnDefinition = "TINYINT(1)")
	private boolean ativo;

	@Column(name = "codigo_verificador", length = 6)
	private String codigoVerificador;

	@ManyToMany
	@JoinTable(name = "usuarios_tem_perfis", joinColumns = {
			@JoinColumn(name = "usuario_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "perfis_id", referencedColumnName = "id") })
	private List<Perfil> perfis;

	// adiciona perfis a lista
	public void addPerfil(PerfilTipo tipo) {
		if (this.perfis == null) {
			this.perfis = new ArrayList<>();
		}
		this.perfis.add(new Perfil(tipo.getCod()));
	}

	public Usuario() {
		super();
	}

	public Usuario(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getCodigoVerificador() {
		return codigoVerificador;
	}

	public void setCodigoVerificador(String codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
