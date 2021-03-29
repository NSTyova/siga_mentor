package ao.co.temmais.arquitetura.controller.dto.edit;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import ao.co.temmais.arquitetura.modelo.Aluno;
import ao.co.temmais.arquitetura.modelo.Municipio;
import ao.co.temmais.arquitetura.repository.AlunoRepository;
import ao.co.temmais.arquitetura.repository.EmolumentosRepository;

public class AtualizarAlunos {

	// Alualizar  somente os dados pessoa dos alunos.
	private String nome;
	private String email;
	private String telefone;
	private String telefone1;
	private String telefone2;
	private String nomeDoPai;
	private String nomeDaMae;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataNascimento;
	private Municipio municipio;
	private String sexo;
	private String necessidadeEducacaoEspecial;
	
	
	public Aluno toAlunto(Long id, AlunoRepository repository) {
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setNomeDoPai(nomeDoPai);
		aluno.setNomeDaMae(nomeDaMae);
		aluno.setTelefone(telefone);
		aluno.setTelefone1(telefone1);
		aluno.setTelefone2(telefone2);
		aluno.setDataNascimento(dataNascimento);
		aluno.setSexo(sexo);
		aluno.setMunicipio(municipio);
		aluno.setNecessidadeEducacaoEspecial(necessidadeEducacaoEspecial);
		return aluno;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getTelefone1() {
		return telefone1;
	}


	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}


	public String getTelefone2() {
		return telefone2;
	}


	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}


	public String getNomeDoPai() {
		return nomeDoPai;
	}


	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}


	public String getNomeDaMae() {
		return nomeDaMae;
	}


	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public Municipio getMunicipio() {
		return municipio;
	}


	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
