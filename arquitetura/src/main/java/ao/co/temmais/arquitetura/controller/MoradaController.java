package ao.co.temmais.arquitetura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ao.co.temmais.arquitetura.modelo.Moradas;

@Controller
@RequestMapping("moradas")
public class MoradaController {

	@GetMapping("/abrir")
	public String abrir(Moradas moradas) {
		return "morada/cadastrar";
	}
}
