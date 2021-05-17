package com.cursospring.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping( value="/parametros", method=RequestMethod.GET )
public class ParamController {
	
	@GetMapping( "/saludo" )
	public String leccionParam( @RequestParam(name="name", required=false) String name, Model model ) {
		
		String paramName = name;
		model.addAttribute("name", paramName);
		
		return "parametros/params";
	}
	
	@PostMapping("/saludoPer")
	public String saludoPersonalizado( @RequestParam("name") String name, Model model ) {
		
		String paramName = name;
		model.addAttribute("name", paramName);
		
		return "parametros/params";
	}
	
}
