package ao.co.temmais.arquitetura.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovaTurma;
import ao.co.temmais.arquitetura.modelo.Turma;
import ao.co.temmais.arquitetura.repository.TurmaRepository;

@Controller
@RequestMapping("turmas")
public class TurmaController {

	@Autowired
	private TurmaRepository repository;
	
	@GetMapping("/abrir")
	public String abrir(RequisicaoNovaTurma requisicaoNovaTurma) {
		return "turma/inserir";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovaTurma requisicao, RedirectAttributes attr) {
		Turma turma = requisicao.toTurma();
		repository.save(turma);
		attr.addAttribute("sucesso", "Dados gravados com sucesso");
		return "redirect:/turmas/abrir";
	}
	
}
