package ao.co.temmais.arquitetura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovoArquiteto;
import ao.co.temmais.arquitetura.modelo.Arquitetos;
import ao.co.temmais.arquitetura.modelo.Grau;
import ao.co.temmais.arquitetura.modelo.Moradas;
import ao.co.temmais.arquitetura.modelo.Usuario;
import ao.co.temmais.arquitetura.repository.ArquitetoRepository;
import ao.co.temmais.arquitetura.repository.GrauRepository;
import ao.co.temmais.arquitetura.repository.MoradasRepository;
import ao.co.temmais.arquitetura.repository.UsuarioRepository;

@Controller
@RequestMapping("arquitetos")
public class ArquitetosController {
	
	@Autowired
	private ArquitetoRepository repository;
	
	@Autowired
	private GrauRepository grauRepository;
	
	@Autowired
	private MoradasRepository moradasRepository;
	
	@Autowired
	private UsuarioRepository usuarioInscreveuRepository;

	@GetMapping("/abrir")
	public String abrir(RequisicaoNovoArquiteto requisicaoNovoArquiteto) {
		return "arquiteto/inserir";
		
	}
	
	@PostMapping("/novo")
	public String novo(RequisicaoNovoArquiteto requiscao, RedirectAttributes attr) {
		String email=SecurityContextHolder.getContext().getAuthentication().getName();
		Usuario usuario =usuarioInscreveuRepository.findByEmail(email);
		Arquitetos arquitetos = requiscao.toArquitetos();
		arquitetos.setUsuario(usuario);
		repository.save(arquitetos);
		return "redirect:/arquitetos/abrir";
	}
	
	@ModelAttribute("graus")
	public List<Grau> listaDeGrau(){
		return grauRepository.findAll();
	}
	
	@ModelAttribute("moradass")
	public List<Moradas> listaDeMoradas(){
		return moradasRepository.findAll();
	}
}
