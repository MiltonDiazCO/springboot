package com.milton.spring.basico.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({ "/", "", "/index" })
	public String index(Model model) {
		model.addAttribute("parrafo1", "Hola, soy el parrafo No. 1");
		return "index";
	}

	@GetMapping({ "/index2" })
	public String indexTwo(ModelMap model) {
		model.addAttribute("parrafo2", "Hola, soy el parrafo No. 2");
		return "index";
	}

	@GetMapping({ "/index3" })
	public String indexThree(Map<String, Object> map) {
		map.put("parrafo3", "Hola, soy el parrafo No. 3");
		return "index";
	}

	@GetMapping({ "/index4" })
	public ModelAndView indexFour(ModelAndView mv) {
		mv.addObject("parrafo3", "Hola, soy el parrafo No. 4");
		mv.setViewName("index");
		return mv;
	}

	@ModelAttribute("paises")
	public List<String> listPaises() {
		List<String> paises = Arrays.asList("Argentina", "Colombia", "Peru");
		return paises;
	}

}
