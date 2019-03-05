package com.cice.gestionequipo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cice.gestionequipo.entidades.Jugador;
import com.cice.gestionequipo.entidades.Paritido;
import com.cice.gestionequipo.service.PartidoService;


public class PartidoServiceImpl implements PartidoService{
	Paritido partido = new Paritido();
	
	public List<Jugador> listaDeConvocados() {
		List<Jugador> jugadoresConvocados = new ArrayList<>();		
		jugadoresConvocados= partido.getConvocados();
		return jugadoresConvocados;
	}

	@Override
	public void prepararPartido(int idEntrenador, List<Jugador> convocados, boolean enCasa, int IdUtillero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardarResultadoPartido(String resultado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Jugador> jugadoresNoConvocados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jugador> listaDeTitulares() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}