package com.milton.spring.basico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.milton.spring.basico.models.Usuario;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@GetMapping({"", "/"})
	public String listUsuarios(Model model) {
		Usuario user = new Usuario();
		user.setNombre("Simon");
		user.setApellido("Bolivar");
		user.setCorreo("simonbolivar@gmail.com");
		
		model.addAttribute("usuario", user);
		
		return "usuarios";
	}

}
