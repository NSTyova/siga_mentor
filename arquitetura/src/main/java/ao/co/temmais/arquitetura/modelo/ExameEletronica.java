package ao.co.temmais.arquitetura.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name = "exameElectronico")
public class ExameEletronica{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "codigo_pergunta")
	private Perguntas codigo_pergunta;
	@ManyToOne
	@JoinColumn(name = "codigo_resposta")
	private Resposta codigo_resposta;
	// com o lazy ele nao fara uma pesquisa dos usuario com jpa
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_usuario_candidato")
	private Usuario codigo_usuario;
	@ManyToOne
	@JoinColumn(name = "codigo_ano")
	private Ano codigo_ano;
	private int certa;
/*	private double classificacao;
	private String tipo_exame;*/
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataInicio;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataFim;
	public Perguntas getCodigo_pergunta() {
		return codigo_pergunta;
	}
	public void setCodigo_pergunta(Perguntas codigo_pergunta) {
		this.codigo_pergunta = codigo_pergunta;
	}
	public Resposta getCodigo_resposta() {
		return codigo_resposta;
	}
	public void setCodigo_resposta(Resposta codigo_resposta) {
		this.codigo_resposta = codigo_resposta;
	}
	public Usuario getCodigo_usuario() {
		return codigo_usuario;
	}
	public void setCodigo_usuario(Usuario codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}
	public Ano getCodigo_ano() {
		return codigo_ano;
	}
	public void setCodigo_ano(Ano codigo_ano) {
		this.codigo_ano = codigo_ano;
	}
	public int getCerta() {
		return certa;
	}
	public void setCerta(int certa) {
		this.certa = certa;
	}
	/*public double getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(double classificacao) {
		this.classificacao = classificacao;
	}
	public String getTipo_exame() {
		return tipo_exame;
	}
	public void setTipo_exame(String tipo_exame) {
		this.tipo_exame = tipo_exame;
	}*/
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
