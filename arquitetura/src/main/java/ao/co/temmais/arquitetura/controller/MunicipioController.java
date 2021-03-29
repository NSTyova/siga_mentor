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

import ao.co.temmais.arquitetura.controller.dto.form.RequisicaoNovoMunicipio;
import ao.co.temmais.arquitetura.modelo.Municipio;
import ao.co.temmais.arquitetura.modelo.Provincia;
import ao.co.temmais.arquitetura.repository.MunicipioRepository;
import ao.co.temmais.arquitetura.repository.ProvinciaRepository;

@Controller
@RequestMapping("municipios")
public class MunicipioController {

	@Autowired
	private MunicipioRepository repository;
	@Autowired
	private ProvinciaRepository provinciaRepository;
	
	@GetMapping("/abrir")
	public String abrir(RequisicaoNovoMunicipio requisicaoNovoMunicipio) {
		return "municipio/inserir";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovoMunicipio requisicao, RedirectAttributes attr) {
		Municipio municipio = requisicao.toMunicipio();
		repository.save(municipio);
		attr.addAttribute("sucesso", "dados gravados com sucesso");
		return "redirect:/municipios/abrir";
	}
	
	@ModelAttribute("provincias")
	public List<Provincia> listaProvincia(){
		return provinciaRepository.findAll();
	}
}
