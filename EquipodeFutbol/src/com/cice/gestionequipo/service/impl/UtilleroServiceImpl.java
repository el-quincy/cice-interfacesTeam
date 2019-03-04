package com.cice.gestionequipo.service.impl;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Personal;
import com.cice.gestionequipo.service.UtilleroService;

public class UtilleroServiceImpl implements UtilleroService {

	DataSource dataSource = new DataSource(); 
	@SuppressWarnings("static-access")
	@Override
	public void contratar(Integer fechaInicio, int id, String name, String surname) {
		
		Personal personal = dataSource.plantilla.get(id);
		if(name.equalsIgnoreCase(personal.getNombre())
				&&surname.equalsIgnoreCase(personal.getApellido())){
			System.out.println("El Nombre de "+personal.getNombre()+" Coincide");
			System.out.println("El Apellido de "+personal.getApellido()+" Coincide");
		personal.setFechaIncorporacion(fechaInicio);
		dataSource.plantilla.put(id, personaltgiorfgmk
	public void despedir(Integer fechaFin, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarSalario(double nuevoSalario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificacionEstadoCapacidadDeViajar(int idUtillero, boolean nuevoEstado) {
		// TODO Auto-generated method stub
		
	}

}
