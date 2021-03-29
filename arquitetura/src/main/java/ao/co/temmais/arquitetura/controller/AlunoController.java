package ao.co.temmais.arquitetura.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

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

import ao.co.temmais.arquitetura.controller.dto.edit.AtualizarAlunos;
import ao.co.temmais.arquitetura.controller.dto.edit.AtualizarEmolumentos;
import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovoAluno;
import ao.co.temmais.arquitetura.modelo.Aluno;
import ao.co.temmais.arquitetura.modelo.Emolumentos;
import ao.co.temmais.arquitetura.modelo.Municipio;
import ao.co.temmais.arquitetura.repository.AlunoRepository;
import ao.co.temmais.arquitetura.repository.CicloAcademicoRepository;
import ao.co.temmais.arquitetura.repository.MunicipioRepository;

@Controller
@RequestMapping("alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository repository;
	@Autowired
	private MunicipioRepository municipioReposity;

	@GetMapping("/abrir")
	public ModelAndView abrir(RequisicaoNovoAluno requisicaoNovoAluno) {
		List<Aluno> todosAlunos = repository.findAll();
		ModelAndView mv = new ModelAndView("aluno/inserir");
		mv.addObject("alunos", todosAlunos);
		return mv;
	}

	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovoAluno requisicao, RedirectAttributes attr) {
		Aluno aluno = requisicao.toAluno();
		repository.save(aluno);
		attr.addAttribute("sucesso", "dados gravados com sucesso");
		return "redirect:/aluno/abrir";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("atualizarAluno", repository.getOne(id));
		return "aluno/editar";
	}

	@PostMapping("/editar")
	public String editar(@Valid AtualizarAlunos requisicao, Long id, RedirectAttributes attr) {
		Aluno aluno = requisicao.toAlunto(id, repository);
		repository.save(aluno);
		attr.addFlashAttribute("sucesso", "Operação realizada com sucesso!");
		return "redirect:/alunos/abrir";
	}

	@ModelAttribute("municipios")
	public List<Municipio> listaMunicipio() {
		return municipioReposity.findAll();
	}
}
