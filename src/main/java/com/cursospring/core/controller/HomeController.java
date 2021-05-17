package com.cursospring.core.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cursospring.core.model.Vacante;

//@RestController
//@RequestMapping( "/home" )

@Controller
@RequestMapping( value= "/home", method= RequestMethod.GET )
public class HomeController {
	
	@GetMapping( "" )
	public String index() {
		System.out.println( "Accediendo al Home" );
		return "index";
	}
	
	@GetMapping( "/info" )
	public String info( Model model ) {
		
		/*
		String data = "Hola Mundo";
		model.addAttribute("data", data);
		model.addAttribute("date", new Date() );
		*/
		
		String nombre = "Manuel Victoria";
		Date fecha = new Date();
		double salario = 900.0;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fecha);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);
		
		return "home";
	}
	
	@GetMapping("/info/{id}")
	public String infoDetail( @PathVariable("id") int infoId, Model model ) {
		
		List<Vacante> lista = getVacantes();
		Vacante vacante = lista.get(infoId);
		
		model.addAttribute("vacante", vacante);
		
		return "infoDetail";
		
	}
	
	@GetMapping( "/listado" )
	public String mostrarListado( Model model ) {
		
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero");
		lista.add("Arquitecto");
		lista.add("Programador");
		lista.add("Comercial");
		
		model.addAttribute("lista", lista);
		
		return "listado";
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle( Model model ) {
		
		Vacante vacante = new Vacante();
		vacante.setNombre( "Programador Java" );
		vacante.setDescripcion("Se precisa de un programador senior de Java");
		vacante.setFecha(new Date());
		vacante.setSalario(1100);
		
		model.addAttribute("vacante" , vacante);
		
		return "detalle";
	}
	
	@GetMapping("/tabla")
	public String mostrarTabla( Model model ) {
		
		List<Vacante> lista = getVacantes();
		model.addAttribute("vacantes", lista);
		
		return "tabla";
	}
	
	private List<Vacante> getVacantes(){
		
		List<Vacante> lista = new LinkedList<Vacante>();
		
		//Vacante numero uno
		Vacante vacante1 = new Vacante();
		vacante1.setNombre( "Programador Python" );
		vacante1.setDescripcion("Requeridos conocimientos extensos acerca de Django");
		vacante1.setFecha(new Date());
		vacante1.setSalario(1200);
		vacante1.setImg("empresa1.png");
		
		//Vacante numero dos
		Vacante vacante2 = new Vacante();
		vacante2.setNombre( "Peón de Albañilería" );
		vacante2.setDescripcion("Se requiere un peón experto en albañilería");
		vacante2.setFecha(new Date());
		vacante2.setSalario(1300);
		vacante2.setImg("empresa2.png");
		
		//Vacante numero tres
		Vacante vacante3 = new Vacante();
		vacante3.setNombre( "Trabajador social" );
		vacante3.setDescripcion("Se requiere un trabajador social cuanto antes");
		vacante3.setFecha(new Date());
		vacante3.setSalario(1100);
		vacante3.setImg("empresa3.png");
		
		//Vacante numero cuatro
		Vacante vacante4 = new Vacante();
		vacante4.setNombre( "Futbolista" );
		vacante4.setDescripcion("Se precisa de delantero centro con experiencia en finales de Champions League");
		vacante4.setFecha(new Date());
		vacante4.setSalario(4700);
		vacante4.setImg("empresa4.png");
		
		//Vacante numero cinco
		Vacante vacante5 = new Vacante();
		vacante5.setNombre( "Programador Android" );
		vacante5.setDescripcion("Se precisa de un programador con amplios conocimientos en Android Studio");
		vacante5.setFecha(new Date());
		vacante5.setSalario(1250);
		
		lista.add(vacante1);
		lista.add(vacante2);
		lista.add(vacante3);
		lista.add(vacante4);
		lista.add(vacante5);
		
		return lista;
	}
	
}
