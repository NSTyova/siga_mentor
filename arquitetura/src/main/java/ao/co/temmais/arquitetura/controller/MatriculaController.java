package ao.co.temmais.arquitetura.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovaMatricula;
import ao.co.temmais.arquitetura.modelo.Aluno;
import ao.co.temmais.arquitetura.modelo.Ano;
import ao.co.temmais.arquitetura.modelo.CicloAcademico;
import ao.co.temmais.arquitetura.modelo.Matricula;
import ao.co.temmais.arquitetura.modelo.PlanoPagamento;
import ao.co.temmais.arquitetura.modelo.Turma;
import ao.co.temmais.arquitetura.modelo.Usuario;
import ao.co.temmais.arquitetura.repository.AlunoRepository;
import ao.co.temmais.arquitetura.repository.AnoRepository;
import ao.co.temmais.arquitetura.repository.CicloAcademicoRepository;
import ao.co.temmais.arquitetura.repository.MatriculaRepository;
import ao.co.temmais.arquitetura.repository.PlanoPagamentoRepository;
import ao.co.temmais.arquitetura.repository.TurmaRepository;
import ao.co.temmais.arquitetura.repository.UsuarioRepository;

@Controller
@RequestMapping("matriculas")
public class MatriculaController {
	@Autowired
	private AnoRepository anoLectivoRepository;
	@Autowired
	private CicloAcademicoRepository cicloAcademicoRepository;
	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private TurmaRepository turmaBaseRepository;
	@Autowired
	private PlanoPagamentoRepository planoPagamentoRepository;
	@Autowired
	private UsuarioRepository usuarioInscreveuRepository;
	
	@Autowired
	private MatriculaRepository repository;
	
	@GetMapping("/abrir")
	public String abrir(RequisicaoNovaMatricula requisicaoNovaMatricula) {
		return "matricula/inserir";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovaMatricula requisicao, RedirectAttributes attr) {
		// pegar o utilizador logado
		String email=SecurityContextHolder.getContext().getAuthentication().getName();
		Usuario usuario =usuarioInscreveuRepository.findByEmail(email);
		Matricula matricula = requisicao.toMatricula();
		matricula.setUsuarioInscreveu(usuario);
		repository.save(matricula);
		return "redirect:/matricular/abrir";
	}
	
	@ModelAttribute("ano")
	public List<Ano> listaAnos(){
		return anoLectivoRepository.findAll();
	}
	@ModelAttribute("alunos")
	public List<Aluno> listaAluno(){
		return alunoRepository.findAll();
	}
	@ModelAttribute("turmas")
	public List<Turma> listaTurmaBas(){
		return turmaBaseRepository.findAll();
	}
	@ModelAttribute("plano")
	public List<PlanoPagamento> listaPlanoPagamento(){
		return planoPagamentoRepository.findAll();
	}
	
	@ModelAttribute("clicoAcademicos")
	public List<CicloAcademico> listaCicloAdamemico(){
		return cicloAcademicoRepository.findAll();
	}
}
