package com.cice.gestionequipo.service;

import java.util.List;

import com.cice.gestionequipo.entidades.Jugador;

public interface PartidoService {
	
	
	public void prepararPartido(int idEntrenador,List<Jugador> convocados, boolean enCasa, int IdUtillero);
	public void guardarResultadoPartido(String resultado);
	public List<Jugador> jugadoresNoConvocados();
	public List<Jugador> listaDeTitulares();
	public List<Jugador> listaDeConvocados();


}
