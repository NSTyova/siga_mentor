package ao.co.temmais.arquitetura.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.form.RequisiacaoNovaDisciplina;
import ao.co.temmais.arquitetura.modelo.CicloAcademico;
import ao.co.temmais.arquitetura.modelo.Disciplina;
import ao.co.temmais.arquitetura.repository.CicloAcademicoRepository;
import ao.co.temmais.arquitetura.repository.DisciplinaRepository;

@Controller
@RequestMapping("disciplinas")
public class DisciplinaController {

	@Autowired
	private DisciplinaRepository repository;
	@Autowired
	private CicloAcademicoRepository cicloRepository;
	@GetMapping("/abrir")
	public String abrir(RequisiacaoNovaDisciplina requisiacaoNovaDisciplina) {
		return "disciplina/inserir";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisiacaoNovaDisciplina requisicao, RedirectAttributes attr) {
		Disciplina disciplina = requisicao.toDisciplina();
		repository.save(disciplina);
		return "redirect:/disciplinas/abrir";
	}
	@ModelAttribute("ciclo")
	public List<CicloAcademico> listaCiclo(){
		return cicloRepository.findAll();
	}
}
