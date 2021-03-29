package ao.co.temmais.arquitetura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovaPergunta;
import ao.co.temmais.arquitetura.modelo.Ano;
import ao.co.temmais.arquitetura.modelo.Perguntas;
import ao.co.temmais.arquitetura.repository.AnoRepository;
import ao.co.temmais.arquitetura.repository.PerguntasRepository;

@Controller
@RequestMapping("perguntas")
public class PerguntasController {

	@Autowired
	private PerguntasRepository repository;
	@Autowired
	private AnoRepository anoRepository;
	@GetMapping("/abrir")
	public ModelAndView abrir(RequisicaoNovaPergunta requisicaoNovaPergunta) {
		List<Perguntas> todasPerguntas = repository.findAll();
		ModelAndView mv = new ModelAndView("pergunta/inserir");
		mv.addObject("perguntass", todasPerguntas);
		return mv;
	}
	
	@PostMapping("/novo")
	public String novo(RequisicaoNovaPergunta requisicao, RedirectAttributes attr) {
		Perguntas perguntas = requisicao.toPerguntas();
		repository.save(perguntas);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso!");
		return "redirect:/perguntas/abrir";
	}
	
	@ModelAttribute("anos")
	public List<Ano> listaDeAnos(){
		return anoRepository.findAll();
	}
}
