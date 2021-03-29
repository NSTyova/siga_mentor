package ao.co.temmais.arquitetura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ao.co.temmais.arquitetura.repository.service.UsuarioService;



@Controller
@RequestMapping("u")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
}
