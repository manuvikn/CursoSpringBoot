package com.cursospring.core.service;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cursospring.core.model.Vacante;

@Service
public class VacanteServiceImpl implements IVacanteService{
	
	private List<Vacante> lista;
	
	public VacanteServiceImpl() {
		
		lista = new LinkedList<Vacante>();
		
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
		
	}
	
	
	@Override
	public List<Vacante> getVacantes() {
		// TODO Auto-generated method stub
		return lista;
	}


	@Override
	public Vacante getVacante(String name) {
		// TODO Auto-generated method stub
		for ( Vacante item : lista ) {
			if (item.getNombre().equals(name)) {
				return item;
			}
		}
		
		return null;
		
	}

}
