package ao.co.temmais.arquitetura.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.edit.RequisicaoEditaAno;
import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovoAno;
import ao.co.temmais.arquitetura.modelo.Ano;
import ao.co.temmais.arquitetura.repository.AnoRepository;

@Controller
@RequestMapping("ano")
public class AnoController {
	
	@Autowired
	private AnoRepository anoRepository;

	@GetMapping("/inserir")
	public ModelAndView abrir(RequisicaoNovoAno requisicaoNovoAno) {
		List<Ano> todosAnos = anoRepository.findAll();
		ModelAndView mv = new ModelAndView("ano/inserir");
		mv.addObject("anosLectivos", todosAnos);
		return mv;
	}
	
	@PostMapping("/novo")
	public String novo (@Valid RequisicaoNovoAno requisicao, BindingResult result, RedirectAttributes attr) {
		if(result.hasErrors()) {
			return "ano/inserir";
		}
		Ano ano = requisicao.toAno();
		anoRepository.save(ano);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso!");
		return "redirect:/ano/inserir";
	}
	@RequestMapping("{id}")
	public ModelAndView editar(@PathVariable Long id, RequisicaoEditaAno requisicaoEditaAno) {
		System.out.println(">>>>>>>>> id recebido: "+ id);
		Optional<Ano> ano = anoRepository.findById(id);
		ModelAndView mv = new ModelAndView("ano/Editar");
		mv.addObject(ano);
		return mv;
	}
}
