package ao.co.temmais.arquitetura.controller.dto.form;

import ao.co.temmais.arquitetura.modelo.Perguntas;
import ao.co.temmais.arquitetura.modelo.Resposta;

public class RequisicaoNovaResposta {

	private String descricao;
	private int correta;
	private Perguntas codigo_pergunta;
	
	public String getDescricao() {
		return descricao;
	}
	public Perguntas getCodigo_pergunta() {
		return codigo_pergunta;
	}
	public int getCorreta() {
		return correta;
	}
	public void setCodigo_pergunta(Perguntas codigo_pergunta) {
		this.codigo_pergunta = codigo_pergunta;
	}
	public void setCorreta(int correta) {
		this.correta = correta;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Resposta toResposta() {
		Resposta resposta = new Resposta();
		resposta.setDescricao(descricao);
		resposta.setCorreta(correta);
		resposta.setCodigo_pergunta(codigo_pergunta);
		return resposta;
	}
}
