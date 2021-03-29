package ao.co.temmais.arquitetura.controller.dto.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import ao.co.temmais.arquitetura.modelo.Aluno;
import ao.co.temmais.arquitetura.modelo.Ano;
import ao.co.temmais.arquitetura.modelo.Emolumentos;
import ao.co.temmais.arquitetura.modelo.GuiaPagamentoHistorico;
import ao.co.temmais.arquitetura.modelo.Usuario;

public class RequisicaoNovaGuiaPagamentoHistorico {

	private Usuario usuario;
	private Emolumentos emolumento;
	private double valor;
	private Aluno aluno;
	private Ano anoLectivo;
	private String numeroDeAluno;
	private String bourderoux;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataPagamento;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataRegistro = LocalDate.now();
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate dataVencimento;
	
	
	public GuiaPagamentoHistorico toGuiaPagamentoHistorico() {
		GuiaPagamentoHistorico guiaPagamentoHistorico = new GuiaPagamentoHistorico();
		guiaPagamentoHistorico.setUsuario(usuario);
		guiaPagamentoHistorico.setEmolumento(emolumento);
		guiaPagamentoHistorico.setNumeroDeAluno(numeroDeAluno);
		guiaPagamentoHistorico.setAnoLectivo(anoLectivo);
		guiaPagamentoHistorico.setValor(valor);
		guiaPagamentoHistorico.setAluno(aluno);
		guiaPagamentoHistorico.setDataPagamento(dataPagamento);
		guiaPagamentoHistorico.setDataVencimento(dataVencimento);
		guiaPagamentoHistorico.setBourderoux(bourderoux);
		return guiaPagamentoHistorico;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Emolumentos getEmolumento() {
		return emolumento;
	}


	public void setEmolumento(Emolumentos emolumento) {
		this.emolumento = emolumento;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public Ano getAnoLectivo() {
		return anoLectivo;
	}


	public void setAnoLectivo(Ano anoLectivo) {
		this.anoLectivo = anoLectivo;
	}


	public String getNumeroDeAluno() {
		return numeroDeAluno;
	}


	public void setNumeroDeAluno(String numeroDeAluno) {
		this.numeroDeAluno = numeroDeAluno;
	}


	public String getBourderoux() {
		return bourderoux;
	}


	public void setBourderoux(String bourderoux) {
		this.bourderoux = bourderoux;
	}


	public LocalDate getDataPagamento() {
		return dataPagamento;
	}


	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	public LocalDate getDataRegistro() {
		return dataRegistro;
	}


	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}


	public LocalDate getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}
