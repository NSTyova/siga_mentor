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

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovaResposta;
import ao.co.temmais.arquitetura.modelo.Perguntas;
import ao.co.temmais.arquitetura.modelo.Resposta;
import ao.co.temmais.arquitetura.repository.PerguntasRepository;
import ao.co.temmais.arquitetura.repository.RespostaRepostiroty;

@Controller
@RequestMapping("respostas")
public class RespostasController {
	@Autowired
	private RespostaRepostiroty repository;
	
	@Autowired
	private PerguntasRepository perguntasRepository;

	@GetMapping("/abrir")
	public ModelAndView abrir(RequisicaoNovaResposta requisicaoNovaResposta) {
		List<Resposta> todasRespostas= repository.findAll();
		ModelAndView mv = new ModelAndView("respostas/inserir");
		mv.addObject("respostas", todasRespostas);
		return mv;
	}
	@PostMapping("/novo")
	public String novo(RequisicaoNovaResposta requisicao, RedirectAttributes attr) {
		Resposta resposta = requisicao.toResposta();
		repository.save(resposta);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso!");
		return "redirect:/respostas/inserir";
	}
	
	@ModelAttribute("perguntas")
	public List<Perguntas> listaDePerguntas(){
		return perguntasRepository.findAll();
	}
}

