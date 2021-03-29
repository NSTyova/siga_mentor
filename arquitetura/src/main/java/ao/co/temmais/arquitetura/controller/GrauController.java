package ao.co.temmais.arquitetura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovoGrau;
import ao.co.temmais.arquitetura.modelo.Grau;
import ao.co.temmais.arquitetura.repository.GrauRepository;

@Controller
@RequestMapping("grau")
public class GrauController {
	
	@Autowired
	private GrauRepository grauRepository;

	@GetMapping("/abrir")
	public String abrir(RequisicaoNovoGrau requisicaoNovoGrau) {
		return "grau/inserir";
	}
	
	@PostMapping("/novo")
	public String novo(RequisicaoNovoGrau requisicao, RedirectAttributes attr) {
		Grau graus = requisicao.toGrau();
		grauRepository.save(graus);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso!");
		return "redirect:/grau/abrir";
	}
}
