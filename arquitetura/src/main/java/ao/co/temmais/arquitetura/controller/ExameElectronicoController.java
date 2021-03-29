package ao.co.temmais.arquitetura.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.edit.RequisicaoExameElectronico;
import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovoExameEletronico;
import ao.co.temmais.arquitetura.modelo.ExameEletronica;
import ao.co.temmais.arquitetura.modelo.Municipio;
import ao.co.temmais.arquitetura.modelo.Perguntas;
import ao.co.temmais.arquitetura.modelo.Resposta;
import ao.co.temmais.arquitetura.repository.ExameElectronicaRepository;
import ao.co.temmais.arquitetura.repository.PerguntasRepository;
import ao.co.temmais.arquitetura.repository.RespostaRepostiroty;

@Controller
@RequestMapping("exameElectronico")
public class ExameElectronicoController {
	
	@Autowired
	private ExameElectronicaRepository repository;
	
	@Autowired
	private PerguntasRepository perguntasRepository;
	
	@Autowired
	private RespostaRepostiroty respostaRepostiroty;

	@GetMapping("/abrir")
	//O Principal pega os dados do usuario logado
	public ModelAndView abrir(RequisicaoExameElectronico requisicaoExameElectronico,Principal principal) {
		// fazer um query para comprar as datas de exames
		List<ExameEletronica> todosExames = repository.findAllByCodigo_usuario(principal.getName());
		ModelAndView mv = new ModelAndView("exameElectronico/inserir");
		mv.addObject("exames", todosExames);
		return mv;
	}
	
	
	@PostMapping("novo")
	public String gravar(RequisicaoNovoExameEletronico requisicao, RedirectAttributes attr) {
		ExameEletronica exameEletronica = requisicao.toExameElectronico();
		repository.save(exameEletronica);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso!");
		return "redirect:/exameElectronico";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("requisicaoExameElectronico", repository.getOne(id));
		return "exameElectronico/inserir";
	}
	
	@ModelAttribute("perguntas")
	public List<Perguntas> listaPerguntas() {
		return perguntasRepository.findAll();
	}
	@ModelAttribute("respostas")
	public List<Resposta> listaRespostas() {
		return respostaRepostiroty.findAll();
	}
}
