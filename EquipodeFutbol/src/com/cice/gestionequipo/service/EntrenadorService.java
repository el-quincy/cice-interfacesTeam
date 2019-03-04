package com.cice.gestionequipo.service;

import java.util.List;

public interface EntrenadorService {

	public List<String> recuperarPalmares(int Id);
	public void agregarTitulo(String titulo);
	public void agregarListadeEquiposAnteriores(int id,List<String> equipos);
	
}
