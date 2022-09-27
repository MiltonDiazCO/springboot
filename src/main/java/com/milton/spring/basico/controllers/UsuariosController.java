package com.milton.spring.basico.controllers;

import java.util.ArrayList;

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
		ArrayList<Usuario> user = new ArrayList<Usuario>();
		user.add(new Usuario("Simon", "Bolivar", "simonbolivar@gmail.com"));
		user.add(new Usuario("Barack", "Obama", "obama@gmail.com"));
		
		model.addAttribute("usuarios", user);
		
		return "usuarios";
	}

}
