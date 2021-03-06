package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {

	@GetMapping("/")
	public String enviarForm(Usuario usuario) {
		
		return "Login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		if("hola".equals(usuario.getUsuario())  && "1234".equals(usuario.getContra())) {
			return "MostrarMensajeV";
		}
		else {
			return "MostrarMensajeF";
		}
		
	}
}
