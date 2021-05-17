package com.cursospring.core.service;

import java.util.List;

import com.cursospring.core.model.Vacante;

public interface IVacanteService {
	public List<Vacante> getVacantes();
	public Vacante getVacante( String name );
}
