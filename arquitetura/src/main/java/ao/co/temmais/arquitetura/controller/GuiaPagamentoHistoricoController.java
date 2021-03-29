package ao.co.temmais.arquitetura.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovaGuiaPagamentoHistorico;
import ao.co.temmais.arquitetura.modelo.Aluno;
import ao.co.temmais.arquitetura.modelo.Ano;
import ao.co.temmais.arquitetura.modelo.Emolumentos;
import ao.co.temmais.arquitetura.modelo.GuiaPagamentoHistorico;
import ao.co.temmais.arquitetura.modelo.Usuario;
import ao.co.temmais.arquitetura.repository.AlunoRepository;
import ao.co.temmais.arquitetura.repository.AnoRepository;
import ao.co.temmais.arquitetura.repository.EmolumentosRepository;
import ao.co.temmais.arquitetura.repository.GuiaPagamentoHisotricoRepository;
import ao.co.temmais.arquitetura.repository.UsuarioRepository;

@Controller
@RequestMapping("guiaPagamentos")
public class GuiaPagamentoHistoricoController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private EmolumentosRepository emolumentoRepository;
	@Autowired 
	private AlunoRepository alunoRepository;
	@Autowired
	private AnoRepository anoRepository;
	@Autowired
	private GuiaPagamentoHisotricoRepository repository;
	@GetMapping("/abrir")
	public String abrir(RequisicaoNovaGuiaPagamentoHistorico requisicaoNovaGuiaPagamentoHistorico) {
		return "guiaPagamento/inserir";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovaGuiaPagamentoHistorico requisicao, RedirectAttributes attr) {
		String email =SecurityContextHolder.getContext().getAuthentication().getName();
		Usuario usuario = usuarioRepository.findByEmail(email);
		GuiaPagamentoHistorico guiaPagamentoHistorico = requisicao.toGuiaPagamentoHistorico();
		guiaPagamentoHistorico.setUsuario(usuario);
		repository.save(guiaPagamentoHistorico);
		attr.addAttribute("sucesso", "dados gravados com sucesso");
		return "redirect:/guiaPagamento/abrir";
	}
	
	@ModelAttribute("emolumentos")
	public List<Emolumentos> listaEmolumentos(){
		return emolumentoRepository.findAll();
	}
	
	@ModelAttribute("alunos")
	public List<Aluno> listaAlunos(){
		return alunoRepository.findAll();
	}
	
	@ModelAttribute("anos")
	public List<Ano> listaAnos(){
		return anoRepository.findAll();
	}
}
