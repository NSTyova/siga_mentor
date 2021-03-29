package ao.co.temmais.arquitetura.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovoCicloAcademico;
import ao.co.temmais.arquitetura.modelo.CicloAcademico;
import ao.co.temmais.arquitetura.repository.CicloAcademicoRepository;

@Controller
@RequestMapping("cicloAcademicos")
public class CicloAcademicoController {

	@Autowired
	CicloAcademicoRepository repository;
	
	
	@GetMapping("/abrir")
	public String abrir(RequisicaoNovoCicloAcademico requisicaoNovoCicloAcademico) {
		return "cicloAcademico/inserir";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovoCicloAcademico requisicao, BindingResult result, RedirectAttributes attr) {
		CicloAcademico cicloAcademico = requisicao.toCicloAcademico();
		repository.save(cicloAcademico);
		attr.addAttribute("sucesso", "dados gravados com sucesso");
		return "redirect:/cicloAcademicos/abrir";
	}
	
}
