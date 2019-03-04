package com.cice.gestionequipo.service.impl;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Personal;
import com.cice.gestionequipo.service.UtilleroService;

public class UtilleroServiceImpl implements UtilleroService {
	DataSource datasource = new DataSource();
	
	@Override
	public void contratar(Integer fechaInicio, int id, String name, String surname) {
		Personal personal=datasource.plantilla.get(id);
		if (name.equalsIgnoreCase(personal.getNombre()) && 
			surname.equalsIgnoreCase(personal.getApellido())) {
			System.out.println("Nombre y apellidos de "+name+" "+surname+" coinciden");
			personal.setFechaIncorporacion(fechaInicio);
			datasource.plantilla.put(id, personal);
			System.out.println("Contratado!");
		} else {
			System.out.println("No contratado!");
		}
		System.out.println("Verificando fecha de entrada "+datasource.plantilla.get(id).getFechaIncorporacion());
	}

	@Override
	public void despedir(Integer fechaFin, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarSalario(double nuevoSalario) {
		
		
	}

	@Override
	public void modificacionEstadoCapacidadDeViajar(int idUtillero, boolean nuevoEstado) {
		// TODO Auto-generated method stub
		
	}
	

	

}
