package ao.co.temmais.arquitetura.controller.dto.form;



import javax.validation.constraints.NotNull;

import ao.co.temmais.arquitetura.modelo.Ano;
import ao.co.temmais.arquitetura.modelo.Perguntas;

public class RequisicaoNovaPergunta {

	@NotNull(message = "A perguntao nao deve ser nula")
	private String descricao;
	private int classificacao;
	private String tipo_exame;
	private Ano codigo_ano;
	
	public Ano getCodigo_ano() {
		return codigo_ano;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public String getTipo_exame() {
		return tipo_exame;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	public void setTipo_exame(String tipo_exame) {
		this.tipo_exame = tipo_exame;
	}
	
	
	public Perguntas toPerguntas() {
		Perguntas perguntas = new Perguntas();
		perguntas.setCodigo_ano(codigo_ano);
		perguntas.setDescricao(descricao);
		perguntas.setTipo_exame(tipo_exame);
		perguntas.setClassificacao(classificacao);
		return perguntas;
	}
}
