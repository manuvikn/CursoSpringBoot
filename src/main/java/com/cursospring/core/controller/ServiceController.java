package com.cursospring.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cursospring.core.model.Vacante;
import com.cursospring.core.service.IVacanteService;

@Controller
@RequestMapping(value="/servicios", method=RequestMethod.GET)
public class ServiceController {

	@Autowired
	IVacanteService vacanteService;
	
	@GetMapping("/index")
	public String index( Model model ) {
		
		List<Vacante> lista = vacanteService.getVacantes();
		model.addAttribute("lista", lista);
		
		return "servicios/index";
	}
	
	@PostMapping( "/info" )
	public String info( @RequestParam("name") String name,  Model model ) {
		System.out.println(name);
		Vacante vacante = vacanteService.getVacante(name);
		model.addAttribute("vacante", vacante);
		
		return "servicios/info";
	}
	
}
