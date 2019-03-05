package com.cice.gestionequipo.service.impl;

<<<<<<< HEAD
public class UtilleroServiceImpl {
=======
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
		dataSource.plantilla.put(id, personal);
		System.out.println(personal.toString()+ " Contratado");
		}else{
		System.out.println(personal.toString()+" no contratada");
		}
		System.out.println("Verificando fecha de Entrada "
		+ dataSource.plantilla.get(id).getFechaIncorporacion());
	}

	@Override
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
>>>>>>> dev-pre

}
