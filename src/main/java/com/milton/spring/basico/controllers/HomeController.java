package com.milton.spring.basico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({ "home" })
	public String home() {
		return "redirect:/app/";
	}

	@GetMapping({ "", "/" })
	public String homeAlt() {
		return "forward:/app/";
	}

	/*
	 * Nota: el forward solo funciona para rutas del proyecto, si se quiere redirigir
	 * a una ruta externa solo se puede hacer con redirect
	 */

}
