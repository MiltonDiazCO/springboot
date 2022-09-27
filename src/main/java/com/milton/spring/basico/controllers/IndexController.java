package com.milton.spring.basico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@GetMapping({ "/", "/index" })
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/index2", method = RequestMethod.GET)
	public String indexTwo() {
		return "index";
	}

}
