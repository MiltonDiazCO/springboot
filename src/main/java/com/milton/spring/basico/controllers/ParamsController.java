package com.milton.spring.basico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {

	@GetMapping({ "", "/", "minombre" })
	public String miNombre(@RequestParam(required=false, defaultValue="NN") String nombre, Model model) {
		model.addAttribute("nombre", ("Hola " + nombre));
		return "params/nombres";
	}

}
