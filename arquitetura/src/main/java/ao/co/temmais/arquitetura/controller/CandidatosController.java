package ao.co.temmais.arquitetura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovoCandidato;
import ao.co.temmais.arquitetura.modelo.Ano;
import ao.co.temmais.arquitetura.modelo.Candidatos;
import ao.co.temmais.arquitetura.modelo.Grau;
import ao.co.temmais.arquitetura.modelo.Moradas;
import ao.co.temmais.arquitetura.repository.AnoRepository;
import ao.co.temmais.arquitetura.repository.CandidadtosRepository;
import ao.co.temmais.arquitetura.repository.GrauRepository;
import ao.co.temmais.arquitetura.repository.MoradasRepository;

@Controller
@RequestMapping("candidatos")
public class CandidatosController {

	@Autowired
	private CandidadtosRepository repository;
	@Autowired
	private GrauRepository repositoryGrau;
	@Autowired
	private AnoRepository repositoryAno;
	@Autowired
	private MoradasRepository repositoryMoradas;
	@GetMapping("/abrir")
	public String abrir(RequisicaoNovoCandidato requisicaoNovoCandidato) {
		return "candidato/inserir";
	}
	
	@PostMapping("/novo")
	public String novo(RequisicaoNovoCandidato requiscao, RedirectAttributes attr) {
		Candidatos candidatos = requiscao.toCandidatos();
		repository.save(candidatos);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso!");
		return "redirect:/candidatos/abrir";
	}
	
	@ModelAttribute("graus")
	public List<Grau> listaDeGraus(){
		return repositoryGrau.findAll();
	}
	
	@ModelAttribute("anos")
	public List<Ano> listaDeAno(){
		return repositoryAno.findAll();
	}
	
	@ModelAttribute("moradas")
	public List<Moradas> listaDeMoradas(){
		return repositoryMoradas.findAll();
	}
}
