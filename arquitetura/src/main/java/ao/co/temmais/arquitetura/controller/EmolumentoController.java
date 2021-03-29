package ao.co.temmais.arquitetura.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.edit.AtualizarEmolumentos;
import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovoEmolumento;
import ao.co.temmais.arquitetura.modelo.Emolumentos;
import ao.co.temmais.arquitetura.repository.EmolumentosRepository;

@Controller
@RequestMapping("emolumentos")
public class EmolumentoController {
	
	@Autowired
	private EmolumentosRepository emolumentosRepository;

	@GetMapping("/abrir")
	public ModelAndView abrir(RequisicaoNovoEmolumento requisicaoNovoEmolumento, 
			@PageableDefault(size = 4) Pageable pageable, String descricao) {
		//List<Emolumentos> todosEmolumentos = emolumentosRepository.findAll();
		ModelAndView mv = new ModelAndView("emolumento/inserir");
		System.out.println(">>>>>>>>>> pageNumber " +pageable.getPageNumber());
		System.out.println(">>>>>>>>>> pageSizer " +pageable.getPageSize());
		mv.addObject("emolumentos", emolumentosRepository.findAll(pageable));
		return mv;
		
	}
	
	
	@PostMapping("/novo")
	public String novo(RequisicaoNovoEmolumento requisicao, RedirectAttributes attr) {
		Emolumentos emolumentos = requisicao.toEmolumentos();
		emolumentosRepository.save(emolumentos);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso!");
		return "redirect:/emolumentos/abrir";
		
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("requisicaoNovoEmolumento", emolumentosRepository.getOne(id));
		return "emolumento/editar";
	}
	
	@PostMapping("/editar")
	public String editar(@Valid AtualizarEmolumentos requisicao, Long id,  RedirectAttributes attr) {
		Emolumentos emolumentos = requisicao.toAtualizar(id, emolumentosRepository);
		emolumentosRepository.save(emolumentos);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso!");
		return "redirect:/emolumentos/abrir";
	}
}
