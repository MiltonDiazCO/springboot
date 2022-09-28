package com.milton.spring.basico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {

	@GetMapping({ "", "/", "minombre" })
	public String datosPersona(@RequestParam(required = false, defaultValue = "NN") String nombre, Model model) {
		model.addAttribute("datos1", ("Hola " + nombre));
		return "params";
	}

	@GetMapping({ "/mix-params" })
	public String datosPersona(@RequestParam String nombre, @RequestParam int edad, Model model) {
		model.addAttribute("datos2", ("Nombre: " + nombre + ", Edad: " + edad));
		return "params";
	}

	@GetMapping({ "/variables/{nombre}" })
	public String datosPersonaVariable(@PathVariable String nombre, Model model) {
		model.addAttribute("datos3", ("Hola " + nombre));
		return "params";
	}

	@GetMapping({ "/mix-variables/{nombre}/{edad}" })
	public String datosPersonaVariable(@PathVariable String nombre, @PathVariable int edad, Model model) {
		model.addAttribute("datos4", ("Nombre: " + nombre + ", Edad: " + edad));
		return "params";
	}

}
