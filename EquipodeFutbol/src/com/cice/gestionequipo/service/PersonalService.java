package com.cice.gestionequipo.service;

public interface PersonalService {

	
	public void contratar(Integer fechaInicio, int id, String name , String surname);
	public void despedir(Integer fechaFin, int id);
	public void modificarSalario(int Id,  double nuevoSalario);
	
	
}
