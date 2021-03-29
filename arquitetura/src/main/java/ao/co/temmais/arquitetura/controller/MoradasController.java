package ao.co.temmais.arquitetura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovaMorada;
import ao.co.temmais.arquitetura.modelo.Moradas;
import ao.co.temmais.arquitetura.repository.MoradasRepository;

@Controller
@RequestMapping("moradass")
public class MoradasController {
	
	@Autowired
	private MoradasRepository repository;

	@GetMapping("/abrir")
	public String abrir(RequisicaoNovaMorada requisicaoNovaMorada) {
		return "morada/inserir";
	}
	
	@PostMapping("/novo")
	public String novo(RequisicaoNovaMorada requisicao, RedirectAttributes attr) {
		Moradas moradas = requisicao.toMoradas();
		repository.save(moradas);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso!");
		return "redirect:/moradass/abrir";
	}
}
