package ao.co.temmais.arquitetura.modelo;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "arquitetos")
public class Arquitetos{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;
	@Column(name = "telefone", nullable = false, length = 15, unique = true)
	private String telefone;
	@Column(name = "data_nascimento", nullable = false)
	private LocalDate dtNascimento;
	@Column(name = "numero_ordem")
	private String numeroOrdem;
	@ManyToOne
	@JoinColumn(name = "codigo_grau")
	private Grau grau;
	@ManyToOne
	@JoinColumn(name = "codigo_moradas")
	private Moradas moradas;
	@Column(name = "faculdade_estudou")
	private String faculdade;
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	private String email;
	private String estadoCivil;
	
	public Arquitetos() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getNumeroOrdem() {
		return numeroOrdem;
	}
	public void setNumeroOrdem(String numeroOrdem) {
		this.numeroOrdem = numeroOrdem;
	}
	public Grau getGrau() {
		return grau;
	}
	public void setGrau(Grau grau) {
		this.grau = grau;
	}
	public Moradas getMoradas() {
		return moradas;
	}
	public void setMoradas(Moradas moradas) {
		this.moradas = moradas;
	}
	public String getFaculdade() {
		return faculdade;
	}
	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
