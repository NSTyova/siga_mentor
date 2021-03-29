package ao.co.temmais.arquitetura.controller.dto.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import ao.co.temmais.arquitetura.modelo.Arquitetos;
import ao.co.temmais.arquitetura.modelo.Grau;
import ao.co.temmais.arquitetura.modelo.Moradas;
import ao.co.temmais.arquitetura.modelo.Usuario;

public class RequisicaoNovoArquiteto {

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dtNascimento;
	private String faculdade;
	private Grau grau;
	private Moradas moradas;
	private String nome;
	private String numeroOrdem;
	private String telefone;
	private String email;
	private String estadoCivil;
	private Usuario usuario;
	public Arquitetos toArquitetos() {
		Arquitetos arquitetos = new Arquitetos();
		arquitetos.setDtNascimento(dtNascimento);
		arquitetos.setFaculdade(faculdade);
		arquitetos.setGrau(grau);
		arquitetos.setMoradas(moradas);
		arquitetos.setNome(nome);
		arquitetos.setNumeroOrdem(numeroOrdem);
		arquitetos.setTelefone(telefone);
		arquitetos.setEmail(email);
		arquitetos.setEstadoCivil(estadoCivil);
		arquitetos.setUsuario(usuario);
		return arquitetos;
	}
	public LocalDate getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getFaculdade() {
		return faculdade;
	}
	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroOrdem() {
		return numeroOrdem;
	}
	public void setNumeroOrdem(String numeroOrdem) {
		this.numeroOrdem = numeroOrdem;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
