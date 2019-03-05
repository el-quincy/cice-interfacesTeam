package com.cice.gestionequipo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cice.gestionequipo.dao.DataSource;
import com.cice.gestionequipo.entidades.Personal;
import com.cice.gestionequipo.service.PersonalService;

public class PersonalServiceImpl implements PersonalService {
	DataSource dataSource = new DataSource();

	@Override
	public void contratar(Integer fechaInicio, int id, String name, String surname) {

		Personal personal = dataSource.plantilla.get(id);
		if (name.equalsIgnoreCase(personal.getNombre()) && surname.equalsIgnoreCase(personal.getApellido())) {
			System.out.println("El Nombre de " + personal.getNombre() + " Coincide");
			System.out.println("El Apellido de " + personal.getApellido() + " Coincide");
			personal.setFechaIncorporacion(fechaInicio);
			dataSource.plantilla.put(id, personal);
			System.out.println(personal.toString() + " Contratado");
		} else {
			System.out.println(personal.toString() + " no contratada");
		}
		System.out.println("Verificando fecha de Entrada " + dataSource.plantilla.get(id).getFechaIncorporacion());

	}

	@Override
	public void despedir(Integer fechaFin, int id) {
		Personal personal = dataSource.plantilla.get(id);
		if(id>0&&id<18){
			if (personal.getFechaIncorporacion() != null&&personal.getId() == id) {
				System.out.println("Existe el empleado.");
				personal.setFechaDespido(fechaFin);
				System.out.println("El empleado con la id: " + id + " ha sido despedido a fecha de: " + fechaFin);
			} else {
				System.out.println("No existe el empleado");
			}
		} else {
			System.out.println("No puedes introducir este id");
		}
		
	}

	@Override
	public void modificarSalario(double nuevoSalario) {
		// TODO Auto-generated method stub

	}

}
